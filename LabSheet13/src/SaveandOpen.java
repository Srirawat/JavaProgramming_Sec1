import java.util.*;
import java.io.*;
public class SaveandOpen extends Employee{
	private String name;
	private String dept;
	public void insert() throws IOException{
	//create object for input data from keyboard(console)
	Scanner scan = new Scanner(System.in);
	//crate object for write(save) data to File using PrintStrem Class
	PrintStream writeFile = new PrintStream(new File ("d://txtFile//employee.txt"));
	String answer;
	do {
		 hearder();
		System.out.print("\nEnter name: ");
		name = scan.next();
		System.out.print("\nEnter dapartment: ");
		dept = scan.next();
		//save all data to file
		writeFile.println(name+"\t"+dept);
		System.out.print("\nEnter data again? : ");
		answer = scan.next().toLowerCase();
		 hearder();
	}while(answer.equals("y"));
	
	writeFile.close();
	}
	
	public void read() {
		int i = 1;
		try {
			//create object for read File using Scanner Class
			Scanner readFile = new Scanner(new File("d://txtFile//employee.txt"));
			boolean check = false;
			hearder();
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next();
				if(dept.equalsIgnoreCase(super.getDept())) {
					System.out.println("\n"+i+")"+name);
					i++;
					check=true;
					
				}
			}
			if(check==false) {
				
				System.out.println("\nSorry, no department: "+super.getDept()+" in File");
				hearder();
			}
			hearder();
			System.out.print("\nEmployee in dept "+super.getDept()+" is "+(--i)+" person.");
			readFile.close();
			
		}catch(IOException e) {
			System.out.println("\nSorry, file not found....");
		}
	}

}
