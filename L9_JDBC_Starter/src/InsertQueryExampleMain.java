import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQueryExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;
		try {
			//con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","password");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbdl53","root","password");
	
			System.out.println("Database connection Success"+con);
			
			Statement stmt = con.createStatement();
			
			String query = "insert into student (`id`,`name`,`roll`) values (1,'ADITYA',1)";
			stmt.execute(query);
			stmt.close();
			
			// a statement which you prepare on the fly...The values are inserted dynamic.
			
			//String query = "INSERT INTO `customers`(`customerNumber`,`customerName`,`contactLastName`,`contactFirstName`,`phone`,`addressLine1`,`addressLine2`,`city`,`state`,`postalCode`,`country`,`salesRepEmployeeNumber`,`creditLimit`) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
			/*
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setInt(1, 1000);
			ps.setString(2, "Geeks For Geeks");
			ps.setString(3, "Geeky");
			ps.setString(4, "Guy");
			ps.setString(5, "Random Data");
			ps.setString(6, "Lourem Ispum");
			ps.setString(7, "Random");
			ps.setString(8, "Data");
			ps.setString(9, "Some Data");
			ps.setString(10, "Some Data");
			ps.setString(11, "Data Random");
			ps.setInt(12, 1504);
			ps.setFloat(13, 25000);
		
			System.out.println(ps.executeUpdate());
			*/
			/*
			 * 1. executeBatch: 
			 * loop -> multiple 
			 */
			
			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
