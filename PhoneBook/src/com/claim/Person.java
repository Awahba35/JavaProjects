package com.claim;

import java.util.Comparator;

public class Person {

	private String firstName;
	private String lastName;
	private Address personAddress = new Address();  //Address object
	private String telephoneNumber;


	public Person(String firstName, String lastName,Address personAddress, String telephoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.personAddress = personAddress;
		this.telephoneNumber = telephoneNumber;

	}

	/**
	 * 
	 * @return a formatted string containing contact info
	 */
	public String toString() {
		String str = String.format(
				"First Name: %s\n" +
						"Last Name: %S\n" +
						"Address: %s " +
						"Phone Number: %s\n",
						getFirstName(), getLastName(), getpersonAddress().getInfo(), getTelephoneNumber()
				);

		return str;
	}

	/*Comparator for sorting the list by Student Name*/
	public static Comparator<Person> StuNameComparator = new Comparator<Person>() {

		public int compare(Person s1, Person s2) {
			String StudentName1 = s1.getFirstName().toUpperCase();
			String StudentName2 = s2.getFirstName().toUpperCase();

			//ascending order
			return StudentName1.compareTo(StudentName2);
		}
	};
	// Getters and Setters

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
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public Address getpersonAddress() {
		return personAddress;
	}
	public void setpersonAddress(Address personAddress) {
		this.personAddress = personAddress;
	}

}