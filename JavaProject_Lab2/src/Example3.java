import java.text.DecimalFormat;
import java.util.*;
public class Example3 {

	public static void main(String[] args) {
		
		DecimalFormat frm = new DecimalFormat("#,###.##");
		
		Scanner scan = new Scanner(System.in);
		
		String name;
		System.out.print("Input product name   : ");
		name = scan.nextLine();
		
		System.out.print("Input product unit   : ");
		int unit = scan.nextInt();
		
		System.out.print("Input price per unit : ");
		double priceperunit = scan.nextDouble();
		
		double total = unit*priceperunit;
		
		System.out.println("Total Price is "+ frm.format(total)+" baht.");
		System.out.println("\nAdd VAT 7% is "+ frm.format(((total*0.07)+total))+" baht.");

	}

}
