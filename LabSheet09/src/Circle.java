
public class Circle {
	//the public constants
	public static final double DEFAULT_RADIUS = 1.0;
	public static final String DEFAULT_COLOR = "red" ;
	
	//the private 2 attributes
	private double radius;
	private String color;
	
	//Constructs a Circle with default radius and color
	//1st(default) Constructs
	Circle(){
		this.radius = DEFAULT_RADIUS;
		this.color = DEFAULT_COLOR;
	}
	//Constructs a Circle with the given radius and default color
	//2nd Constructs
	Circle(double radius){
		this.radius = radius;
		this.color = DEFAULT_COLOR;
	}
	//Constructs a Circle with the given radius and color
	//3rd Constructs
	Circle(double radius, String color){
		this.radius = radius;
		this.color = color;
	}
	//Returns the radius-the public getter for private attribute radius
	public double getRadius(){
		return this.radius;
	}
	//set the radius-the public setter for private variable radius
	public void setRadius(double radius) {
		this.radius = radius;
	}
	//Returns the color-the public getter for private attribute radius
	public String getColor() {
		return this.color;
	}
	//set the radius-the public setter for private attribute radius
	public void setColor(String color) {
		this.color = color;
	}
	//Return a self-descriptiv sring for a Circle
	public String toString() {
		return "Circle{radius = "+radius+",color = "+color+"]";
	}
	//Return the area of this Circle
	public double getArea() {
		return Math.PI * Math.pow(radius,2);
	}
	//Return the Circumference of this Circlre
	public double getCircumference() {
		return 2.0 * Math.PI * radius;
	}

}
