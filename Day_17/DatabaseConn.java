package database_conn;

import java.sql.*;

public class DatabaseConn {

	public static void main(String[] args) {
		
		try {
			
			// loading jdbc driver [mysql type-4]
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// creating jdbc connection
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/core_java?useSSL=false", "root", "Akashpol@123");

			// creating statement [query statement]
			Statement stat = con.createStatement();
			// executing query
			stat.execute("create table student(rno int primary key, name varchar(40), course varchar(20), fee float)");
			
			// closing connection
			con.close();
			
			
			System.out.println("Table created successfully.");
	
		}catch(Exception exp) {
			
			System.out.println(exp); 
			
		}
	}

}
