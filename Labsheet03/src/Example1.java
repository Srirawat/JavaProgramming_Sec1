import javax.swing.*;//import library for input data from dialog box
import java.text.*;

public class Example1 {

	public static void main(String[] args) {
		final int BUFFET = 299;
		// input and convert data from Dialog box
		int numberofcustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill?"));
		
		double Priceafterdiscount , totalPrice = 0;
		
		//calculate total price of buffet
		totalPrice = BUFFET * numberofcustomer;
		
		DecimalFormat frmId = new DecimalFormat("#,###.00");
		//using confirm dialog box
		int memberCard;
		do {
		memberCard = JOptionPane.showConfirmDialog(null, "Total Price is "+frmId.format(totalPrice)+" Bath."+
		"\nDo you have a member card ?");
		}while(memberCard == JOptionPane.CANCEL_OPTION);
		
		if(memberCard == JOptionPane.YES_OPTION) {
			Priceafterdiscount = totalPrice-(totalPrice*0.1);
			//using showMessage dialog box for display totalPrice
			JOptionPane.showMessageDialog(null, "Aount to be paid is " + frmId.format(Priceafterdiscount) + " Bath." );
		}
		
		else if(memberCard == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Aount to be paid is " + frmId.format(totalPrice) + " Bath." );
		}
		
	}

}
