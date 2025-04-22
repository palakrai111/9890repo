import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbcon {
	static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	static String DB_URL = "jdbc:mysql://localhost:3306/StudentDao";
	static String DB_USERNAME = "root";
	static String DB_PASSWORD = "localhost";

	public static Connection dbcon() throws ClassNotFoundException, SQLException {

		Class.forName(DB_DRIVER);
		Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

		return con;

	}
}
