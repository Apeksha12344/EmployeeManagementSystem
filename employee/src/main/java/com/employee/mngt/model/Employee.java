package com.employee.mngt.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@Column(name = "first_name")
	@NotEmpty
	@Size(min=3 , message="firstName must contain atleast 3 characters")
	private String firstName;

	@NotEmpty
	@Size(min=3 , message="lastName must contain atleast 3 characters")
	@Column(name = "last_name")
	private String lastName;
	
	@NotEmpty
	@Email(message="Email  is not valid!")
	@Column(name = "email_id")
	private String emailId;
	//contact//designation
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, String emailId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
