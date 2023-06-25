import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQueryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","password");
			
			System.out.println("Database connection Success"+con);
			
			Statement stm = con.createStatement();
			
			String query = "select * from customers";
			
			
			ResultSet rs = stm.executeQuery(query);
			
			System.out.println(rs);
			
			while (rs.next()) {
				System.out.println("Customer Name:"+rs.getString("customerName"));
			}
			
			
			rs.close();
			stm.close();
			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
