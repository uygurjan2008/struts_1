package com.uyghur.ruzi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import com.sun.crypto.provider.DESCipher;

public class goods {
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
		return "";
		
	}
	
	public  LinkedHashMap<String, Object> read(){
		

		Connection conn = null;
		String driver = "com.mysql.jdbc.Driver";
		String url = "";
		String sql = "select * from goods_in";
		url = "jdbc:mysql://127.0.0.1:3306/goods";
		String rootname = "root";
		String rootpass = "root";

		boolean exist = false;

		LinkedHashMap<String, Object> map=new LinkedHashMap<String, Object>();
		
		try {
			Class.forName(driver);

			conn = DriverManager.getConnection(url, rootname, rootpass);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			System.out.println("rs "+rs);
				
			
			while (rs.next()) {

			
			map.put("name", rs.getString("name"));
			map.put("price", rs.getString("price"));
			map.put("description", rs.getString("description"));
			
			System.out.println(map.get("name")+""+map.size());
			
			}


				System.out.println(map.get("name"));
				

			
			for(int i=0;i<map.size();i++){
				System.out.println(map.get(""+i+""));
			}
			
			
			

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		
		return map;
	
		
		
	}
	

}
