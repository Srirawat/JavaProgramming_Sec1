
public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("###Test Customer class###");
		Customer c1 = new Customer(1088, "Conan Edogawa",10);
		System.out.println(c1.toString());
		c1.setDiscount(5);
		System.out.println(c1.toString());
		
		Line();
		System.out.println("id is: "+c1.getID());
		System.out.println("name is: "+c1.getName());
		System.out.println("discount is: "+c1.getDiscount());
		
		Line();
		System.out.println("###Test Invoice class###");
		Invoice inv1 = new Invoice(101,c1,12000.00);
		System.out.println(inv1.toString());
		inv1.setCustomer(10000);
		System.out.println(inv1.toString());
		
		Line();
		System.out.println("id is: "+inv1.getID());
		System.out.println("name is: "+inv1.getCustomer());
		System.out.println("discount is: "+inv1.getAmount());
		
		Line();
		System.out.println("customer's id is: "+inv1.getCustomerID());
		System.out.println("customer's name is: "+inv1.getCustomerName());
		System.out.println("customer's discount is: "+inv1.getCustomerDiscount());
		System.out.println("amount after discount is: "+inv1.getAmountAfterDiscount());

	}
	
	public static void Line() {
		for(int i=0;i<50;i++) {
			System.out.print("*");
		}
		System.out.print("\n");
	}

}
