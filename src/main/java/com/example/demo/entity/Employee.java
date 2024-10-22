package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	// define fields
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstname;
	
	@Column(name="last_name")
	private String lastname;
	
	@Column(name="email")
	private String email;

	
	// define getter/setter
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return firstname;
	}

	public void setFirst_name(String first_name) {
		this.firstname = first_name;
	}

	public String getLast_name() {
		return lastname;
	}

	public void setLast_name(String last_name) {
		this.lastname = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// define constructors
	
	public Employee(int id, String first_name, String last_name, String email) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}
	
	public Employee() {
		super();
		
	}

	// define toString
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", first_name=" + firstname + ", last_name=" + lastname + ", email=" + email
				+ "]";
	}

}
