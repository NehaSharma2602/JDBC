package connection_closed;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class closed_connection {

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("driver is loaded");
			
			String url = "jdbc:postgresql://localhost:5432/m10_school";
			String user = "postgres";
			String password = "root";
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("connection established");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				System.out.println("connection closed");
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
