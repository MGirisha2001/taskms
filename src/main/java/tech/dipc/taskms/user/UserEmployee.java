package tech.dipc.taskms.user;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import tech.dipc.taskms.task.TaskEmployee;

@Entity
public class UserEmployee {

	@Id

	String firstname;
	String middlename;
	String lastname;
	String email;
	int phonenum;
	String role;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "UserEmployee_Name", referencedColumnName = "firstname")
	List<TaskEmployee> taskEmployee = new ArrayList<>();

	public List<TaskEmployee> getTaskEmployee() {
		return taskEmployee;
	}

	public void setTaskEmployee(List<TaskEmployee> taskEmployee) {
		this.taskEmployee = taskEmployee;
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
		return "Employee [firstname=" + firstname + ", middlename=" + middlename + ", lastname=" + lastname + ", email="
				+ email + ", phonenum=" + phonenum + ", role=" + role + "]";
	}

}
