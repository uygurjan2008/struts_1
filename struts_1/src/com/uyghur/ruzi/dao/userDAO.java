package com.uyghur.ruzi.dao;

import java.sql.*;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class userDAO {
	private String username;
	private String useruserpass;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUseruserpass() {
		return useruserpass;
	}

	public void setUseruserpass(String useruserpass) {
		this.useruserpass = useruserpass;
	}

	public boolean getConection(String username, String userpass) {
		Connection conn = null;
		String driver = "com.mysql.jdbc.Driver";
		String url = "";
		String sql="select * from dbusers where username='"+username+"' and userpass='"+userpass+"'";
		

		url = "jdbc:mysql://127.0.0.1:3306/goods";
		
		String rootname="root";
		String rootpass="root";
		
		
		boolean exist=false;
		
		try {
			Class.forName(driver);

			conn = DriverManager.getConnection(url, rootname, rootpass);
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			if(rs.next())
			{
				exist=true; 
				
				HttpSession session=ServletActionContext.getRequest().getSession();
				session.setAttribute("user", username);
				
				
				
				
			}
			else
			{
				exist=false;
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		return exist;
	}

}
