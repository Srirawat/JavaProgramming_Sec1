
public class Employee {
	private String dept;
	
	public String setDept(String dept) {
		return this.dept=dept;
	}
	
	public String getDept() {
		return this.dept;
	}
	
	public void hearder() {
		for(int i = 1; i<=80;i++) {
			System.out.print("*");
		}
	}
}
