import java.io.*;
import java.util.*;

public class Lab1201 {
	public static void main(String[] args)  throws IOException {
		Scanner readFile = new Scanner (new File ("d://txtFile//MemberLogin.txt"));
		while(readFile.hasNext()) {
			String fname = readFile.next();
			String lname = readFile.next();
			readFile.next();
			String email = readFile.next().toUpperCase(); 
			String First = lname.substring(0,1)+".";
			
			System.out.println(First+fname+" ("+email+")");
		}
		readFile.close();
	}

}
