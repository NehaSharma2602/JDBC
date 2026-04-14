package load_or_register_driver;
import org.postgresql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class register_demo {

	public static void main(String[] args) {
		Driver d = new Driver();
		
		try {
			DriverManager.registerDriver(d);
			System.out.println("driver is registered");
		}
		catch(SQLException s) {
			System.out.println("invalid driver object");
		}
	}
}
