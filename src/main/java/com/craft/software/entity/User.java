package com.craft.software.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;


@Entity
public class User {

	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	    private long id;
	
	  @NotBlank(message = "First Name is mandatory")
	    @Column(name = "firstname")
	    private String firstname;
	  
	  @NotBlank(message = "Last Name is mandatory")
	    @Column(name = "lastname")
	    private String lastname;
      
      @NotBlank(message = "Department is mandatory")
        @Column(name = "department")
        private String department;
	
	

	public User() {
	}

	public User(long id, String firstname, String lastname, String department) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.department = department;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
