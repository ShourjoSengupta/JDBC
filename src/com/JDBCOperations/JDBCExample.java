package com.JDBCOperations;
import java.sql.DriverManager;
import java.sql.ResultSet; 
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class JDBCExample {
	static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/microntable";
	static final String USER = "root";
	static final String PASS = "Nte#25";
	static final String QUERY = "select book_no, title, sub_code, author from book_detl";
	
	public static void main(String[] args) {
		//open connection
		try(Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(QUERY);){
			while (rs.next()) {
				System.out.println("Bno: "+ rs.getString("book_no"));
				System.out.println("Tit: "+ rs.getString("title"));
				System.out.println("scode: "+ rs.getString("sub_code"));
				System.out.println("aut: "+ rs.getString("author"));
				
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
