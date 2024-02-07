import java.io.*;
import java.util.*;

public class Lab1202 {
	public static void main(String[] args)  throws IOException {
		Scanner readFile = new Scanner (new File ("d://txtFile//MemberLogin.txt"));
		Scanner input = new Scanner (System.in);
		System.out.print("Input email: ");
		String emailinput = input.nextLine().toLowerCase();
		
		while(readFile.hasNext()) {
			readFile.next();
			readFile.next();
			String password = readFile.next();
			String email = readFile.next();
			if(emailinput == email) {
				System.out.println("Your password is "+ password);
			}
			else System.out.println("The data not found");
		}
		readFile.close();
	}

}
