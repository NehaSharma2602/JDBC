package connections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionPropertiesFile {

	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			
			
			FileInputStream fis = new FileInputStream("C:\\Users\\Neha\\OneDrive\\Desktop\\Advance java\\JDBC\\jdbc_demo\\src\\main\\resources\\data.properties");
			
			Properties p = new Properties();
			p.load(fis);
			
			String url = p.getProperty("url");
			
			Connection con = DriverManager.getConnection(url, p);
			System.out.println("connection established succefully");
			
		}
		catch(ClassNotFoundException c) {
			c.printStackTrace();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
