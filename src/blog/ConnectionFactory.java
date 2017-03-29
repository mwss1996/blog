package blog;

import java.sql.*;

public class ConnectionFactory {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("org.sqlite.JDBC");
		Connection connection = DriverManager.getConnection("jdbc:sqlite:WEB-INF/database.sqlite");
		connection.setAutoCommit(false);
		return connection;
	}
}