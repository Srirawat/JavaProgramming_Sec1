import java.text.*;
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double Buffet = 299f;
		int numberofcustomer = 5;
		double price = numberofcustomer*Buffet;
		double total = (price*0.03)+price;
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		System.out.println("Buffet of "+ numberofcustomer +
		" customers is "+ frm.format(price));
		System.out.println("Add Service Charge 3% is " + frm.format(total));

	}

}
