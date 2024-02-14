import java.io.*;
import java.util.*;

public class EmployeeInfo {

	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		String department;
		String choice;
		System.out.print("Inert or Read data?: ");
		choice = scan.next().toLowerCase();
		while(!(choice.equals("insert"))&&!(choice.equals("read"))) {
			System.out.print("Pleas type insert or read data,again: ");
			choice = scan.next().toLowerCase();
		}
		
		SaveandOpen obj = new SaveandOpen();
		if(choice.equals("insert")) {
			obj.insert();
			
		}
		else if(choice.equals("read")) {
			System.out.print("\nEnter department: ");
			department = scan.next();
			obj.setDept(department); //sent department to setDEpt() method from
			obj.read();
		}
			
	}
	

}
