import java.text.DecimalFormat;
import java.util.*;
public class Sales extends Employee {
	DecimalFormat frm = new DecimalFormat("#,###.00");
	private double sales;
	Sales (String id,String name, double salary, double sales){
		 super(id, name, salary);
		 this.sales = sales;
	}
	Sales (String id,String name, double sales){
		 super(id, name);
		 this.sales = sales;
	}
	public double getCommission() {
		if(sales >= 50000) {
			return ((sales-50000)*0.1);
		}
		else if (sales < 50000 && sales >10000) {
			return ((sales-10000)*0.15);
		}
		else {
			return 0;
		}
	}
	public String toString() {
		return super.getName()+"("+super.getId()+") get comission "+frm.format(getCommission())+"B.";
	}

}
