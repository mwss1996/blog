package blogger;

import java.sql.*;

public class ConnectionFactory {
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("org.sqlite.JDBC");
		return DriverManager.getConnection("jdbc:sqlite:WEB-INF/database.sqlite");
	}
	public void closeConnection(Connection connection) throws SQLException {
		connection.close();
	}
}