package ma.inpt.aseds;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	@Column(name = "name")
	private String name;
	@Column(name = "phone")
	private String phone;
	@Column(name = "email")
	private String email ;
  
	@OneToMany (
    		mappedBy = "person"
		, cascade = CascadeType.ALL 
		, fetch = FetchType.EAGER
   		,targetEntity = Message.class
    )
	Set<Message> msgs = new HashSet<Message>(); 
  
	
	
	public Person() {
		super();
	}
	public Person( String name, String phone, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	} 
	  public Set<Message> getMsgs() {
			return msgs;
		}
	
		public void setMsgs(HashSet<Message> msgs) {
			this.msgs = msgs;
		}
		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", msgs=" + msgs + "]";
		}
	
	

}
