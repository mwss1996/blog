package blogger;

import java.sql.*;
import java.util.*;

public class ArticleDAO {
	
	public static List<Article> listArticles() {
		try {
			Connection connection = new ConnectionFactory().getConnection();
			ResultSet result = connection.prepareStatement("SELECT * FROM ARTICLE").executeQuery();
			List<Article> list = new ArrayList<Article>();
			while (result.next()) {
				list.add(
							new Article(
								result.getString("TIME"),
								result.getString("TITLE"),
								result.getString("SUBTITLE"),
								result.getString("CONTENT")
							)
						);
			}
			connection.close();
			return list;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	public static List<Article> listArticles(int rows, int page) {
		try {
			Connection connection = new ConnectionFactory().getConnection();
			PreparedStatement statment = connection.prepareStatement("SELECT * FROM ARTICLE LIMIT ? OFFSET ?");
			statment.setInt(1, rows);
			statment.setInt(2, rows * page);
			ResultSet result = statment.executeQuery();
			List<Article> list = new ArrayList<Article>();
			while (result.next()) {
				list.add(
							new Article(
								result.getString("TIME"),
								result.getString("TITLE"),
								result.getString("SUBTITLE"),
								result.getString("CONTENT")
							)
						);
			}
			connection.close();
			return list;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	public static int getRowCount() {
		try {
			Connection connection = new ConnectionFactory().getConnection();
			PreparedStatement statment = connection.prepareStatement("SELECT COUNT(*) FROM article;");
			ResultSet result = statment.executeQuery();
			if (result.next()) {
				return result.getInt("COUNT(*)");
			}
			return 0;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}