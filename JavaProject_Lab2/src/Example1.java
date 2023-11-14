
public class Example1 {

	public static void main(String[] args) {
		
		
		
		String ISBN = "IB2-6325-85-4-1";
		String Title = "Basic Java Progamming";
		int Unit = 5;
		float Price = 225.75f ;
		float total =Price*Unit;
		
		System.out.println("Book ISBN : "+ISBN);
		System.out.println("Book Title : "+Title);
		System.out.println("Book Unit : "+Unit+" Books.");
		System.out.println("Book Pric : "+Price+" Bath.");
		System.out.println("---------------------------------------------");
		System.out.println("Total Price is "+total);
		System.out.println("Add VAT 7% is "+((total*0.07)+total));
	}
	

}
