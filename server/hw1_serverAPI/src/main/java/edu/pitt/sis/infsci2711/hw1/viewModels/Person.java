package edu.pitt.sis.infsci2711.hw1.viewModels;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {
	
	private int id;
	private String firstName;
	private String lastName;
	
	public Person() {
		
	}
	
	public Person(final String firstName, final String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		System.out.print("nn1");
	}
	
	public Person(final int id, final String firstName, final String lastName) {
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		
	}

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

}
