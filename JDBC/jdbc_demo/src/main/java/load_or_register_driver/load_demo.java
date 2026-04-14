package load_or_register_driver;

public class load_demo {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("driver is loaded");
		}
		catch(ClassNotFoundException c) {
			System.out.println("invalid class name");
		}
	}
}
