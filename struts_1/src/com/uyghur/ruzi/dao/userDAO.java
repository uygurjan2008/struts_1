package com.uyghur.ruzi.dao;

import java.sql.*;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.uyghur.ruzi.db.Dbdriver;

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
	
		String sql="select * from user where username='"+username+"' and userpass='"+userpass+"'";
		
		Dbdriver db=new Dbdriver();
		
		boolean exist=false;
		
		try {
			Class.forName(db.driver());

			Connection conn = db.getConn();
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
