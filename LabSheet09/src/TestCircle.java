
public class TestCircle {

	public static void main(String[] args) {
		//Test all constructors and ToString()
		Circle c1 = new Circle(1.1, "blue"); // call 3nd Constructor
		System.out.println(c1);
		//Circle[radius = 1.1, color = blue]
		
		Circle c2 = new Circle(2.2);//2nd Constructs
		System.out.println(c2);
		
		Circle c3 = new Circle();// 1st Default Constructs
		System.out.println(c3);
		
		//Test Setters and Getters
		c1.setRadius(3.3);
		c1.setColor("Green");
		System.out.println(c1);
		System.out.println("The radius of c1 is: "+c1.getRadius());
		System.out.println("The color of c1 is: "+c1.getColor());
		
		//Test getArea() and getCircumference
		System.out.printf("The area is : %.2f%n", c1.getArea() );
		System.out.printf("The Circumference is: %.3f", c1.getCircumference());
	}

}
