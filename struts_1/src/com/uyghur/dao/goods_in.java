package com.uyghur.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedHashMap;

import sun.org.mozilla.javascript.internal.json.JsonParser;

public class goods_in {
	private String name;
	private int price;
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String execute() {

		boolean in = insert(name, price, description);
		if (in == true) {
			return "true";
		} else {

			return "false";
		}
		
		
		

	}

	public boolean insert(String name, int price, String description) {

		boolean in = false;
		Connection conn = null;
		String driver = "com.mysql.jdbc.Driver";
		String url = "";
		String sql = "INSERT INTO `goods_in` (`name`, `price`, `description`, `etc`) VALUES ('"
				+ name + "', '" + price + "', '" + description + "', 'ee')";
		url = "jdbc:mysql://127.0.0.1:3306/goods";
		String rootname = "root";
		String rootpass = "root";

		try {
			Class.forName(driver);

			conn = DriverManager.getConnection(url, rootname, rootpass);
			Statement stmt = conn.createStatement();
			boolean rs = stmt.execute(sql);

			System.out.println("rs " + rs);

			if (rs == false) {
				in = true;

			} else {
				in = false;
			}

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		return in;

	}
	
	public boolean read(){
		


		boolean in = false;
		Connection conn = null;
		String driver = "com.mysql.jdbc.Driver";
		String url = "";
		String sql = "select * from `goods_in`";
		url = "jdbc:mysql://127.0.0.1:3306/goods";
		String rootname = "root";
		String rootpass = "root";

		try {
			Class.forName(driver);

			conn = DriverManager.getConnection(url, rootname, rootpass);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			System.out.println("rs " + rs);

			while(rs.next()) {
				
				
			}


		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		return in;

	
		
	}
	

}
