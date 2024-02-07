import java.io.*;
import java.util.*;
public final class Lab1205 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner readFile = new Scanner (new File ("d://txtFile//student.txt"));
			int i = 1 ;
			Head();
			
			while(readFile.hasNext()) {
				
				String id = readFile.next();
				readFile.next();
				String fname = readFile.next();
				String lname = readFile.next();
				double grade = Double.parseDouble(readFile.next());
				String First = fname.substring(1,1)+".";
				readFile.next();
				
			System.out.println(i +".\t"+id+"\t"+Level(id)+"\t"+First+lname+"\t"+grade+"\t"+Status(grade));
			i++;
		}readFile.close();

	}
	public static String Level(String id)throws IOException {
		if(id.startsWith("1913")) {
			return "3th";
		}
		else return "4th";
	}
	public static String Status(Double gradee) throws IOException{
		if (gradee >= 2.00) {
			return "Pass";
		}
		else if (gradee >1.00 && gradee <2.00) {
			return "Critical";
		}
		else return "Retired";
	}
	public static void Head() {
		System.out.println("NO.\tID\t\tLevel\tName\t\tGrade   Status");
		System.out.println("*************************************************************************");
	}

}
