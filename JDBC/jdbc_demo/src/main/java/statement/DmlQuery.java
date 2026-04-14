package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DmlQuery {

public static void main(String[] args) {
//	step 1 : load the driver
	try {
		Class.forName("org.postgresql.Driver");
		System.out.println("driver loaded");
//	step 2: connection using 3 string 
		
		String url = "jdbc:postgresql://localhost:5432/m10_school";
		String user = "postgres";
		String password = "root";
		
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("connection established");
		
		
		
//	step 3: creating the statement object
		Statement stm = con.createStatement();
		
		
		
//	Step 4
		String query1 = "insert into student values(3, 'Pooja', 89.0, 123489098, '2000-12-01')";
//	for execution 2 ways => execute= it returns boolean value(true for selection otherwise false), executeUpdate= it return integer value and we can check whether the data is updated or not(if inseted and then it will return 1 otherwise 0)
		/*
		 * execute() method return boolean value, true => dql, false=>dml,ddl
		 * executeUpdate methods return int value, we canot pass dql queries
		 */
		
//		boolean result = stm.execute(query1);
//		System.out.println(result);
		
		
		String query2 = "insert into student values(4, 'Pooja', 89.0, 123489098, '2000-12-01')";
		String query3="UPDATE student set name='krish' WHERE name='Sonam'";
		String query4="delete from student WHERE name='Pooja'";
		int result1 = stm.executeUpdate(query3	);
		
		if(result1 > 0) {
			System.out.println("query has been executed");
		}
		else {
			System.out.println("execution failed");
		}
		
	
	}
	catch(ClassNotFoundException c) {
		System.out.println("invalid class name");
	}
	catch(SQLException s) {
		System.out.println("connection failed");
	}
}
}
