
public class Director {
	private String name, email;
	private char gender;
	
	Director(String name,String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	Director(String name, String email){
		this.name = name;
		this.email = email;
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	public String getGenderName() {
		if(gender == 'm' || gender == 'M') {
			return "Male";
		}
		else if(gender == 'f' || gender == 'F') {
			return "female";
		}
		else return null;
	}
	public String toSrting() {
		return name+"("+email+";"+getGenderName()+")";
	}
}
