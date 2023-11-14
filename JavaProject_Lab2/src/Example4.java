import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Example4 {

	public static void main(String[] args) {

		DecimalFormat frm = new DecimalFormat("#,###.##");
		
		String name = JOptionPane.showInputDialog("Input Product Name:");
		
		/*String strUnit = JOptionPane.showInputDialog("Input Product Unit:");
		int unit = Integer.parseInt(strUnit);*/
		
		int unit = Integer.parseInt(JOptionPane.showInputDialog("Input Product Unit:"));
		
		String strpriceperunit = JOptionPane.showInputDialog("Input Price per unit:");
		double priceperunit = Double.parseDouble(strpriceperunit);
		
		double total = unit*priceperunit;
		
		JOptionPane.showMessageDialog(null,"Total Price is "+ frm.format(total) + " baht."
				+ "\nAdd VAT 7% is " + frm.format(((total*0.07)+total)) + " bath.");


	}

}
