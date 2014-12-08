package com.uyghur.ruzi.dao;

import java.sql.*;

import com.opensymphony.xwork2.Action;
import com.uyghur.ruzi.db.Dbdriver;

public class admindao implements Action {
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

	public boolean checkadmin() {
		boolean exist = false;
		Dbdriver db = new Dbdriver();
		String sql = "select * from admin where username='" + getUsername()
				+ "' and password='" + getUserpass() + "'";
		try {
			Class.forName(db.driver());
			Connection conn = db.getConn();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				exist = true;
			} else {
				exist = false;

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return exist;

	}

	public String execute() throws Exception {

		String result="";
		boolean ok=checkadmin();
		if(ok==true){
			result=SUCCESS;
		}else{
			result=ERROR;
		}
		
		
		return result;
	}

}
