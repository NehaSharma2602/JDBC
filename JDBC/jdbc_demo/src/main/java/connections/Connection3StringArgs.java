package connections;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Connection3StringArgs {
	public static void main(String[] args) {
		
//		step 1 : load the driver
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("driver loaded");
//		step 2: connection using 3 string 
			
			String url = "jdbc:postgresql://localhost:5432/m10_school";
			String user = "postgres";
			String password = "root";
			
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("connection established");
		}
		catch(ClassNotFoundException c) {
			System.out.println("invalid class name");
		}
		catch(SQLException s) {
			System.out.println("connection failed");
		}
	}
	
}
