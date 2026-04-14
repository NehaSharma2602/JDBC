package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DdlQuery {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			
			String url = "jdbc:postgresql://localhost:5432/m10_school";
			String user = "postgres";
			String password = "root";
			
			Connection con = DriverManager.getConnection(url,user, password);
			
			Statement stm = con.createStatement();
//			? ddl query ==> create, drop, rename, alter truncate
			
			
			String s1 = "create table teacher(id integer primary key, name character varying(50), subject character varying(50))";
			System.out.println(stm.executeUpdate(s1));
			
//			String s2 = "drop table teacher";
//			System.out.println(stm.executeUpdate(s2));
			
		}
		catch(ClassNotFoundException e) {
			System.out.println("invalid class name");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
