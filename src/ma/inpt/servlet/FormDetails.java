package ma.inpt.servlet;
import java.util.ArrayList;
public class FormDetails {
	protected String name,email,phone,message;
	
	public FormDetails(String name,  String email, String phone, String message) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.message = message;
		
	}
	
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}

	public String getMessage() {
		return message;
	}

	
}