import java.util.ArrayList;

public class Form {
	protected String name ;
	protected String email ;
	protected String phone ;
	protected String message ;
	protected static ArrayList<Form> forms = new ArrayList<Form>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public void setPhone(String form) {
		this.phone = form;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Form(String name, String email, String form, String message) {
		this.name = name;
		this.email = email;
		this.phone = form;
		this.message = message;
		forms.add(this);
	
	}

	
}
