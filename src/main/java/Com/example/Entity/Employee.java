package Com.example.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="mail_id")
	private String mail_id;
	
	 @Column(name="phonenumber")
  private String phonenumber;
	 
	 @Column(name="role")
	private String role;
	 @Column(name="company")
	
	private String company;
	 
	 @Column(name="password")
	private String password;
	
   public void setId(int id) {
		this.id=id;
	}
   
   public void setName(String name) {
		this.name=name;
	}
   
   public void setMail_id(String mail_id) {
		this.mail_id=mail_id;
	}
     public void setPhonenumber(String phonenumber) {
		this.phonenumber=phonenumber;
	}
  
   public void setRole(String role) {
		this.role=role;
	}
  
   public void setCompany(String company) {
		this.company=company;
	}
  
   public void setPassword(String password) {
	  this.password= password;
	  }
   
  public int getId() {
	  return id;
  }
  public String getName() {
	  return name;
  }
  public String getMail() {
	  return mail_id;
  }
  public String getPhonenumber() {
	  return phonenumber;
  }
  public String getRole() {
	  return role;
  }
  public String getCompany() {
	  return company;
  }
  public String getPassword() {
	  return password;
  }

}
 
 