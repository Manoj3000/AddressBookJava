package com.bridgelabz;

public class AddessBookData {
	
	String first_name;
	String last_name;
	String phoneNumber;
	String email;
	String address;
	String city;
	String state;
	int zipCode;
	
	public AddessBookData(String first_name, String last_name, String phoneNumber, String email, String address, String city, String state, int zipCode) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	
	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

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

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

}
