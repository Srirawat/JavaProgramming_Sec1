
public class Invoice {
	private int id;
	private Customer customer;
	private double amount;
	
	public Invoice (int id, Customer customer, double amount) {
		 this.id = id;
		this.customer = new Customer(customer.getID(), customer.getName() , customer.getDiscount());
		this.amount = amount;
	}
	public int getID() {
		return this.id;
	}
	public Customer getCustomer() {
		return this.customer = customer;
	}
	public double getAmount() {
		return this.amount;
	}
	public void setCustomer(double amount) {
		this.amount = amount;
	}
	public int getCustomerID() {
		return this.customer.getID();		
	}
	public String getCustomerName() {
		return this.customer.getName();
	}
	public int getCustomerDiscount() {
		return this.customer.getDiscount();
	}
	public double getAmountAfterDiscount() {
		return (amount-(amount*(customer.getDiscount()/100.0)));
	}
	public String toString() {
		return "Invoice[id= "+this.id+" , customer = "+customer.toString()+", amount= "+ getAmountAfterDiscount();
	}

}
