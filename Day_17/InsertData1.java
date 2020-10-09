package database_conn;

import java.util.*;
import java.sql.*;

public class InsertData1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the roll number of student.");
		int rno = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter the name of student.");
		String name = sc.nextLine();
		
		//sc.nextLine();
		System.out.println("Enter the name of course.");
		String course = sc.nextLine();
		
		System.out.println("Enter the fee amount for that student.");
		float fee = sc.nextFloat();
		
		try {
			
			Class .forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/core_java?useSSL=false", "root", "Akashpol@123");
			
			Statement stat = conn.createStatement();
			int recv = stat.executeUpdate("insert into student values("+rno+", '"+name+"', '"+course+"', "+fee+")");
			
			conn.close();
			
			if(recv>0)
				System.out.println("Data inserted successfully.");
			else
				System.out.println("Insertion of data is failed.");
			
		}catch(ClassNotFoundException exp) {
			
			exp.printStackTrace();
			
		}catch(SQLException exp) {
			
			exp.printStackTrace();
		}
	}

}
