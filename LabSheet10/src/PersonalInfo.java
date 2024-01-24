
public class PersonalInfo {
	private Person name; //object name reference class Person
	private Date bDay; // object bDay reference class Date
	//Declare 1 private attribute
	private int personID;
	
	//Default constructor
	//firstName = "" , lastName = ""
	PersonalInfo(){
		name = new Person();
		bDay = new Date();
		personID = 0;
	}
	//constructor with parameter
	PersonalInfo(String first , String last , int month , int day , int year , int ID){
		name = new Person(first,last);
		bDay = new Date(month,day,year);
		personID = ID;
	}
	
	//Method to set the personal information
	//call set method from class Person and class Date
	public void setPersonalInfo(String first , String last , int month , int day , int year , int ID) {
		name.setName(first, last);
		bDay.setDate(month,day,year);
		personID = ID;
	}
	
	//Method to return the string if personal information
	public String toString() {
		return "Name: "+name.toString()+"\n"+"Date of birth: "+bDay.toString()+"\n"+"Personal ID:"+personID;
	} 

}
