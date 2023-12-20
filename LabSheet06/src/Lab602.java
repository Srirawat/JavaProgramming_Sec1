import javax.swing.*;
public class Lab602 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputyear = Integer.parseInt(JOptionPane.showInputDialog("Input year: "));
		
		while(!(checkYear(inputyear))) {
			inputyear = Integer.parseInt(JOptionPane.showInputDialog("Please Input year between 1000-3000: "+"\nInput Year, again"));
		}
		if(isLeapYear(inputyear) == true) {
			JOptionPane.showMessageDialog(null, inputyear + " is Leap Year");
		}else {
			JOptionPane.showMessageDialog(null, inputyear + " is not Leap Year");
		}

	}
	public static boolean isLeapYear(int year) {
		if ((year%4 == 0) && (year%100 != 100) || (year%400 == 0)) {
		    return true;	
		}
		else return false;
	}
	
	public static boolean checkYear(int year) {
		if(year >= 100 & year <= 3000) {
			return true;
		}
		else return false;
	}

}
