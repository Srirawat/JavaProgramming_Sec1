
import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Full Name: ");
		String fullname = scan.nextLine();
		
		String firstname = "", lastname = "";
		int count = 0;
		for(int i = 0; i<=fullname.length()-1; i++) {
			if(fullname.charAt(i)==' ') {
				firstname = fullname.substring(0,i);
				lastname = fullname.substring((i+1));
				System.out.print("First Name: "+firstname.toUpperCase()+"\nLast Name: "+lastname.toLowerCase());

				count ++;
			}
		}
		if(count == 0) {
			System.out.print("Incorrect Name");
		}

	}

}
