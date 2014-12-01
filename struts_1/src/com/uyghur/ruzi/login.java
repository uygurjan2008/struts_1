package com.uyghur.ruzi;

import com.uyghur.dao.userDAO;

public class login {

	private String username;
	private String userpass;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpass() {
		return userpass;
	}

	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}

	public String execute() {
		userDAO u=new userDAO();
		boolean user=u.getConection(username, userpass);
		System.out.println("user"+user);
		
		if (user==true) {
			
			return "success";

		} else {
			return "fail";
		}

	}

}
