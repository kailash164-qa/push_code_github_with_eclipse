package com.gspan.RestAssuredEx1;

public class Login {

	private String username, password;

	public Login() {
		
	}

	public Login(String username, String password) {
		
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + "]";
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

}
