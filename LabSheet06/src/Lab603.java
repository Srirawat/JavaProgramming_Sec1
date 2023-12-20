import java.util.*;
public class Lab603 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.print("Please enter your name, separated by a space."
				+ "\n: ");
		String fullname = scan.nextLine();
		String firstName = fullname.substring(0,fullname.indexOf(' '));
		System.out.println(abbreviatName(fullname)+firstName);
		

	}
	public static String abbreviatName(String fullname) {
		String lastname ="";
		for(int i = 0; i<=fullname.length()-1; i++) {
			if(fullname.charAt(i)==' ') {
				lastname = lastname+fullname.charAt(i+1)+".";}
		}
		return lastname;
	}
}
