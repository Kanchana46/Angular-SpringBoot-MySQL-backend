package com.code.Server.payload;

import lombok.Data;

@Data
public class LoginRequest {
	
	@Override
	public String toString() {
		return "LoginRequest [usernameOrEmail=" + usernameOrEmail + ", password=" + password + "]";
	}
	private String usernameOrEmail;
    private String password;
	public String getUsernameOrEmail() {
		return usernameOrEmail;
	}
	public void setUsernameOrEmail(String usernameOrEmail) {
		this.usernameOrEmail = usernameOrEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
    
}
