import java.util.*;
public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String email,name;
		System.out.print("input title: ");
		String title = scan.nextLine();
		System.out.print("input publicYear: ");
		int publicYear = scan.nextInt();
		
		FictionBook obj1 = new FictionBook(title,publicYear);
		
		scan.nextLine();
		
		do {
			System.out.print("Input name: ");
			name = scan.nextLine();
			obj1.setAuthorName(name);
		}while(!obj1.checkFormatName());

		do {
			System.out.print("Input email: ");
			 email = scan.nextLine();
			obj1.setEmail(email);
		}while(!obj1.checkEmail());
		
		
		System.out.println(obj1);

	}

}
