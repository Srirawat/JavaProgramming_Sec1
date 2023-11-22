import javax.swing.*;
import java.util.Random; //use library for Random class
import java.text.*;
public class Withdrawal {

	public static void main(String[] args) {
		//using class Random for random money
		Random rdmoney = new Random();
		int balance = rdmoney.nextInt(9) * 100000;
		
		DecimalFormat frmId = new DecimalFormat("#,###");
		
		int money = Integer.parseInt(JOptionPane.showInputDialog("Your balance : "+ frmId.format(balance) +
				"\nInput money to withdraw : "));
		int wid = money;
		if (money>balance) {
			JOptionPane.showMessageDialog(null, "Error:Cannot withdraw more than balance","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if (money>20000) {
			JOptionPane.showMessageDialog(null, "Error:Cannot withdraw more than 20,000","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if ((money%100)!=0) {
			JOptionPane.showMessageDialog(null, "Error:Cannot withdraw "+money%100+" bath.","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else {
			int thunsandbank = money / 1000;
			money = money-(thunsandbank*1000);
			int fivehunbank = (money / 500);
			money = money-(fivehunbank*500);
			int hun = money/100;
			money = money-(hun*100);
			JOptionPane.showMessageDialog(null,"You withdraw "+frmId.format(wid)+" bath."+"\n1,000 = "+thunsandbank+
					"\n500 = "+fivehunbank+"\n100 = "+hun);
		}
		
	}

}
