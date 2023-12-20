import java.util.*;
public class Lab604 {
	static Scanner scan = new Scanner(System.in);
	static String studentID,strSubjectID;
	static int subjectID;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputStudent();

	}
	public static void inputStudent() {
		do {
			System.out.print("Enter Student Id: ");
			studentID = scan.next();
			System.out.print("Enter Subject Id: ");
			subjectID = scan.nextInt();
			//Convert subjectID from integer to string (strSubjectID)
			strSubjectID = subjectID+"";
		}while(!(islength(studentID,strSubjectID)));
		System.out.println();
		displayData(isITStudent(studentID),isITsubject(strSubjectID));
	}
	public static boolean islength(String id, String sub_id) {
		if(id.length()==10 && sub_id.length()==7) {
			return true;
		}
		return false;
	}//end isLength()
	
	public static boolean isITStudent(String id) {
		if(id.substring(0,3).equals("211") && id.substring(3,6).equals("311") ) {
			return true;
		}
		return false;
	}
	public static boolean isITsubject(String sub_id) {
		if(sub_id.substring(0,2).equals("21") && sub_id.substring(4,5).equals("1") ) {
			return true;
		}
		return false;
	}
	public static void displayData(boolean sid, boolean subid) {
		if(sid) {
			System.out.println("Stusent id: "+studentID+" 1st year student in IT ");
		}
		else {
			System.out.println("Stusent id: "+studentID+" is not 1st year student in IT ");
		}
		if(subid) {
			System.out.println("Enroll in courses for Year 1");
		}
		else {
			System.out.println("NOt enroll in courses for Year 1");
		}
	}
	

}
