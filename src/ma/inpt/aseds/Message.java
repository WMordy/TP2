package ma.inpt.aseds;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Message {
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String message ;
	@ManyToOne(targetEntity = Person.class,cascade = CascadeType.ALL 
			, fetch = FetchType.EAGER)
    @JoinColumn(name="person_id", nullable=false)
	private Person person ;
	public Message() {
		super();
	}
	public Message( String message, Person pers) {
		super();
		this.message = message;
		this.person = pers;
	}

}
