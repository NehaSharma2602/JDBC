package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DqlQuery {

	public static void main(String[] args) {
		try{
			Class.forName("org.postgresql.Driver");
			
			String url = "jdbc:postgresql://localhost:5432/m10_school";
			String user = "postgres";
			String password = "root";
			
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stm = con.createStatement();
			
			String query = "select * from student" ;
			
//			 two ways => execute,getresultset ======> both should be use
			
			
			
//			boolean result =stm.execute(query);
//			ResultSet rs = stm.getResultSet();
			
			
//			in th2 result table the cursor is on the above the first record so for extracting the result we have to use next() and its return type boolean
//			while(rs.next()) {
//				System.out.println(rs.getInt(1)+" "+rs.getString("name")+" "+rs.getDouble(3)+" "+rs.getLong("phone")+" "+rs.getDate(5));
//			}
			
			ResultSet rs = stm.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString("name")+" "+rs.getDouble(3)+" "+rs.getLong("phone")+" "+rs.getDate(5));
			}
			
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
