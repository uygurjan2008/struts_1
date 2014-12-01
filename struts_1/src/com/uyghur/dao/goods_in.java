package com.uyghur.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

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

		
		read();
		
		
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
	
	public Map<String, Object> read(){
		


	
		Connection conn = null;
		String driver = "com.mysql.jdbc.Driver";
		String url = "";
		String sql = "select * from `goods_in`";
		url = "jdbc:mysql://127.0.0.1:3306/goods";
		String rootname = "root";
		String rootpass = "root";
		Map<String, Object> map=new LinkedHashMap<String, Object>();
		
		List<Map> list=new List<Map>() {

			@Override
			public boolean add(Map e) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void add(int index, Map element) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean addAll(Collection<? extends Map> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(int index, Collection<? extends Map> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Map get(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int indexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator<Map> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int lastIndexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public ListIterator<Map> listIterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ListIterator<Map> listIterator(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Map remove(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Map set(int index, Map element) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public List<Map> subList(int fromIndex, int toIndex) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		try {
			Class.forName(driver);

			conn = DriverManager.getConnection(url, rootname, rootpass);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			
			
			while(rs.next()) {
				map.put("name", rs.getString("name"));
				map.put("price", rs.getString("price"));
				map.put("description", rs.getString("description"));
			//	list.add(map);
				
			}


		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		for(int i=0;i<list.size();i++){
			System.out.println(i+","+list.get(i));
		}
		
		
		
		return map;

	
		
	}
	

}
