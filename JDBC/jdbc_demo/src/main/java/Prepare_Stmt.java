import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Prepare_Stmt {

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
			
			// preparedStmt object
			// dynamic
			
			String query = "insert into student values(?,?,?,?,?)";// (?  => delimeter)
			PreparedStatement ps = con.prepareStatement(query);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the id");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the name");
			String name = sc.nextLine();
			
			System.out.println("Enter the percentage");
			Double percentage = sc.nextDouble();
			sc.nextLine();
			
			System.out.println("Enter the phone number");
			Long phone = sc.nextLong();
			sc.nextLine();
			
			System.out.println("Enter the dob: ");
			String dob = sc.nextLine();
			
			
			
//			now we have to tell which delimeter holds which value by using setX() method
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setDouble(3, percentage);
			ps.setLong(4, phone);
			ps.setDate(5, Date.valueOf(dob));
			
			
//			execute() and executeUpdate() => same as statement, in preparedstatement there are no arg methods
			boolean result = ps.execute();
			System.out.println(result);
			
			
		}
		catch(ClassNotFoundException c) {
			System.out.println("invalid class name");
		}
		catch(SQLException s) {
			s.printStackTrace();
		}
	}
}
