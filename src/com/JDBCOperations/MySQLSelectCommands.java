package com.JDBCOperations;
import java.sql.DriverManager;
import java.sql.ResultSet; 
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class MySQLSelectCommands {
public static void main(String[] args) throws SQLException {
	Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/microntable","root","Nte#25");
	String QUERY = "select * from book_detl";
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery(QUERY);
		while (rs.next()) {
			String Bno= rs.getString("book_no");
			String Tit= rs.getString("title");
			String scode= rs.getString("sub_code");
			String Pub= rs.getString("publisher");
			String St= rs.getString("status");
			String yop=  rs.getString("yop");
			String price= rs.getString("price");
			
			System.out.println(Bno +" "+ Tit +" "+scode+" "+Pub+" "+St+" "+yop+" "+price);
			
		}
		con.close();
		System.out.println("Statement Executed: Query executed");
}
}
