package wzorce.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private static DatabaseConnection instance;
	private Connection connection;
	private String url = "jdbc:postgresql://localhost:5432/jdbc";
	private String username = "admin";
	private String password = "admin";

	private DatabaseConnection() {
		try {
			this.connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");
		} catch (SQLException e) {
			System.out.println("Error connecting to DataBase" + e.getMessage());
		}
	}

	public Connection getConnection() {
		return connection;
	}

	public static DatabaseConnection getInstance() throws SQLException {
		if (instance == null) {
			instance = new DatabaseConnection();
		}
		return instance;
	}
}
