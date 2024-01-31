import java.time.*;
public class FictionBook implements Author,Book{
	private String author_name, email, title;
	private int publicYear;

	FictionBook(String title, int publicYear){
		this.title = title;
		this.publicYear = publicYear;
	}
	public void setAuthorName(String name) {
		author_name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean checkFormatName() {
		if(author_name.indexOf(" ")>0) {
			return true;
		}
		else {
			return false;
		}
	}
	public String getLastName() {
		return (author_name.substring(author_name.indexOf(" "))).toUpperCase();
	}
	public String getFirstName() {
		return (author_name.substring(0,author_name.indexOf(" "))).toUpperCase();
	}
	public boolean checkEmail() {
		if(email.endsWith("@hotmail.com")||email.endsWith("@windowslive.com")) {
			return true;
		}
		else {
			return false;
		}
	}
	public String getTitle() {
		return this.title;
	}
	
	public int totalPublicYear() {
		return Year.now().getValue() - this.publicYear;
	}
	
	public String toString() {
		return getTitle()+"write by "+getLastName().substring(0,1)+"."+getFirstName()+"("+this.email+")\nPublished for "+totalPublicYear()+" years";
	}
}
