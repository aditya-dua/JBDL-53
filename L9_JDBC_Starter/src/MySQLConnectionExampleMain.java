import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnectionExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// Reflection approach
			// We dynamically load the class. The class is registered automatically.
			
			/**Approach 2 : Register Driver
			 * 
			 * Driver driver = new com.mysql.cj.jdbc.Driver();
			 * DriverManager.registerDriver(driver);
			 * 
			 * 
			 */
			
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","password");
			
			System.out.println("Database connection Success"+con);
			
			Statement stm = con.createStatement();
			
			String query = "CREATE DATABASE IF NOT EXISTS jbdl53";
			
			System.out.println(stm.execute(query));
			
			System.out.println("Schema created successfully.");
			con.close();
			
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
	
	}

}
