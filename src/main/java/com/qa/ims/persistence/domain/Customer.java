package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Customer {

	private Long id;
	private String firstName;
	private String surname;
	private String email;
	
	public Customer(String firstName, String surname, String email) {
		this.setFirstName(firstName);
		this.setSurname(surname);
		this.setEmail(email);
	}

	public Customer(Long id, String firstName, String surname, String email) {
		this.setId(id);
		this.setFirstName(firstName);
		this.setSurname(surname);
		this.setEmail(email);
	}

	//Getters & Setters 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// toString
	@Override
	public String toString() {
		return "id:" + id + "\t\n\rFirst name: " + firstName + "\t\nSurname: " + surname + "\t\n\rEmail: " + email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, firstName, id, surname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(id, other.id) && Objects.equals(surname, other.surname);
	}



}
