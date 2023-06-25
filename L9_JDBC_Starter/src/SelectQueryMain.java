import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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
			
			/**
			 * In order to query a resultset, there are 2 types...columnIndex and column Label
			 * 
			 */
			
			
			ResultSetMetaData rsmd = rs.getMetaData();
			
			System.out.println(rsmd.getColumnCount());
			System.out.println(rsmd.getColumnLabel(1));
			System.out.println(rsmd.getTableName(1));
			
			
			while (rs.next()) {
				System.out.println("****************");
				System.out.println("Customer Details");
				System.out.println("Customer Number :"+ rs.getInt(1));
				System.out.println("Customer Name :"+ rs.getString(2));
				System.out.println("Customer Contact Name :"+ rs.getString(4)+" "+rs.getString(3));
				System.out.println("Customer Phone :"+ rs.getString(5));
				System.out.println("Customer Address :"+ rs.getString(7));
				System.out.println("****************");
				//System.out.println("Customer Name:"+rs.getString("customerName")+" "+"Customer Name:"+rs.getInt("customerNumber"));
				
			}
			
			/**
			 * Orders Table in my data, 
			 * I want you to query that table and return the 
			 * 1. Number of Columns
			 * 2. All the Column Names
			 * 3. Print out all the Data in the Rows
			 */
			
			rs.close();
			stm.close();
			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
