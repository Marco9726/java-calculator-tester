package org.java.myTesting;

import java.time.LocalDate;

public class Employee {

	private String name;
	private String surname;
	private LocalDate dateOfBirth;
	private String role;
	
	public Employee(String name, String surname, LocalDate dateOfBirth, String role) throws Exception {
		
		setName(name);
		setSurname(surname);
		setDateOfBirth(dateOfBirth);
		setRole(role);
	}
	
//	GETTERS AND SETTERS
	public String getName() {
		return name;
	}
	
	public void setName(String name) throws Exception {
		
		if(name == null || name.isBlank()) {
			throw new Exception("Name can't be empty");
		}
		this.name = name;
	}
	
	public String getLastname() {
		return surname;
	}
	
	public void setSurname(String surname) throws Exception {
		if(surname == null || surname.isBlank()) {
			throw new Exception("Surame can't be empty");
		}
		this.surname = surname;
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(LocalDate dateOfBirth) throws Exception {
		
		LocalDate now = LocalDate.now();
		
		if(dateOfBirth == null || dateOfBirth.isAfter(now)) {
			
			throw new Exception("Date of birth can't be in future");
		}
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) throws Exception {
		
		if( role == null || (!role.equals("employee") && !role.equals("boss") )) {
			
			throw new Exception("Role must be Employee or Boss");
		}
		this.role = role;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName() + getLastname() + getDateOfBirth() + getRole();
	}
}
