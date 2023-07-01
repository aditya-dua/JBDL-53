package l7_springboot_curd_example.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	Connection con;
	
	public DBConnection() {
		// TODO Auto-generated constructor stub
		createConnection("","","");
	}
	public Connection createConnection(String url,String username, String pass) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// Reflection approach
			// We dynamically load the class. The class is registered automatically.		
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","password");
			
			System.out.println("Database connection Success"+con);
			

			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return con;
	}
	
	

}
