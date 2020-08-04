package tech.dipc.taskms.user;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserEmployee {
	
	@Id
	int cid;
	
	String firstname;
	
	String middlename;
	String lastname;
	String email;
	int phonenum;
	String role;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(int phonenum) {
		this.phonenum = phonenum;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "Employee [cid=" + cid + ", firstname=" + firstname + ", middlename=" + middlename + ", lastname="
				+ lastname + ", email=" + email + ", phonenum=" + phonenum + ", role=" + role + "]";
	}
	
	
}
