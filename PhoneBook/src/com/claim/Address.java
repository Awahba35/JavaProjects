package com.claim;

public class Address {
	
	
	//data members
	private String street;
	private String city;
	private String state;
	private String zipCode;
	
	public Address() {
		
	}
	
	// paremetrized constructor
	public Address(String street,String city, String state, String zipCode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	
	/**
	 * 
	 * @return  a formatted string of the address 
	 */
	public String getInfo() {
		//5555 something rd. city, state zip
		String str = String.format(
				"%s %s, %s %s", getStreet(), getCity(), getState(), getZipCode()
		);
		
		return str;
	}
	
	//getters and setters
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}

}