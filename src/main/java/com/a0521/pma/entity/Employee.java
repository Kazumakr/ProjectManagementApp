package com.a0521.pma.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Employee {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO or IDENTITY
	@GeneratedValue(strategy= GenerationType.SEQUENCE)

	@SequenceGenerator(name="employee_seq")
	private long employeeId;
	
	private String firstName;
	private String lastName;
	private String email;
	
//	@ManyToOne(cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
//			fetch = FetchType.LAZY
//			)
	@ManyToMany(cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
	fetch = FetchType.LAZY
	)
	@JoinTable(
			name="project_employee",
			joinColumns=@JoinColumn(name="employee_id"),
			inverseJoinColumns=@JoinColumn(name="project_id")
			)
	
	private List<Project> projectRels;
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	

	public long getEmployeeID() {
		return employeeId;
	}

	public void setEmployeeID(long employeeId) {
		this.employeeId = employeeId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Project> getProjectRels() {
		return projectRels;
	}

	public void setProjectRels(List<Project> projectRels) {
		this.projectRels = projectRels;
	}
	
	


	
	
	
	
}
