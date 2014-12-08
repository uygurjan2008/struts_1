package com.uyghur.ruzi.db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class Dbdriver {
		Connection conn=null;
		String url=null;
		String username=null;
		String password=null;
		

		public Connection getConn(){
			
			InputStream is=Dbdriver.class.getResourceAsStream("/db.properties");
			Properties prop=new Properties();
			try {
				prop.load(is);
			} catch (IOException e1) {

				e1.printStackTrace();
			}
			url = prop.getProperty("jdbc.url");
			username= prop.getProperty("jdbc.username");
			password = prop.getProperty("jdbc.password");
			try {
				conn = DriverManager.getConnection(url, username, password);
			} catch (SQLException e) {

				e.printStackTrace();
			}
			
			System.out.println("conn:"+url+","+username+","+password);
			return conn;
			
		}
		
		public String driver()
		{
			String driver="com.mysql.jdbc.Driver";
			System.out.println("driver String :"+driver);
			return driver;
		}
	
	
}
