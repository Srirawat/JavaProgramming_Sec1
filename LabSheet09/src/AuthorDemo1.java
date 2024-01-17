import java.util.*;
public class AuthorDemo1 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		
		String name , email;
		char gender;
		
		System.out.print("Input author name    : ");
		name = scan.nextLine();
		
		System.out.print("Input e-mail         : ");
		email = scan.nextLine();
		
		System.out.print("Input gender         : ");
		gender = scan.next().charAt(0);
		
		Author a1 = new Author(name , email , gender);
		
		
		System.out.println();
		System.out.println(a1);
		

	}

}
