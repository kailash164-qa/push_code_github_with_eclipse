package com.gspan.RestAssuredEx1;

public class User2 {
	private String email, username, password,phoneNumber;
	
	private Name name;
	
	private Address2 address;
	

	public User2() {
		
	}


	public User2(String email, String username, String password, String phoneNumber, Name name, Address2 address) {
		super();
		this.email = email;
		this.username = username;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public Name getName() {
		return name;
	}


	public void setName(Name name) {
		this.name = name;
	}


	public Address2 getAddress() {
		return address;
	}


	public void setAddress(Address2 address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "User2 [email=" + email + ", username=" + username + ", password=" + password + ", phoneNumber="
				+ phoneNumber + ", name=" + name + ", address=" + address + "]";
	}

	
	
	
	
	

	
}
