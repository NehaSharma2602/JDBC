package connections;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection1stringArgs {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			
			String url = "jdbc:postgresql://localhost:5432/m10_school?user=postgres&password=root";
			
			Connection con = DriverManager.getConnection(url);
			System.out.println("connection established");
		}
		catch(ClassNotFoundException c) {
			c.printStackTrace();
		}
		catch(SQLException s) {
			s.printStackTrace();
		}
	}
}
