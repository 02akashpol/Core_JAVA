package database_conn;

import java.sql.*;

public class InsertData {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection( 
					"jdbc:mysql://localhost:3306/core_java?useSSL=false", "root", "Akashpol@123");
			
			Statement stat = conn.createStatement();
			int recv = stat.executeUpdate("insert into student values(1, 'Akash Pol', 'CDAC', 12563.2356)");
			
			conn.close();
			
			if(recv>0)
				System.out.println("Data inserted sucessfully.");
			
		}catch(ClassNotFoundException exp) {
			
			exp.printStackTrace();
		
		}catch(SQLException exp) {
			
			exp.printStackTrace();
		}
	}

}
