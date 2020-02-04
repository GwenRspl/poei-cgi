package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {

	public static String selectAll() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbarticles", "root", "root");

		String sql = "SELECT * FROM articles";

		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery(sql);

		StringBuilder result = new StringBuilder();
		result.append("ID\tMARQUE\tDESCRIPTION\n");
		while (rs.next()) {
			result.append(rs.getInt("id"));
			result.append("\t");
			result.append(rs.getString("marque"));
			result.append("\t");
			result.append(rs.getString("description"));
			result.append("\n");
		}

		rs.close();
		st.close();
		connection.close();

		return result.toString();
	}

	public static String selectById(int id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbarticles", "root", "root");

		String sql = "SELECT * FROM articles WHERE id=" + id;

		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery(sql);

		StringBuilder result = new StringBuilder();
		result.append("ID\tMARQUE\tDESCRIPTION\n");
		while (rs.next()) {
			result.append(rs.getInt("id"));
			result.append("\t");
			result.append(rs.getString("marque"));
			result.append("\t");
			result.append(rs.getString("description"));
			result.append("\n");
		}

		rs.close();
		st.close();
		connection.close();

		return result.toString();
	}

	public static void insert(String marque, String description) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbarticles", "root", "root");

		String sql = "INSERT INTO articles (marque,description) VALUES(?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, marque);
		ps.setString(2, description);

		ps.executeUpdate();

		ps.close();
		conn.close();
	}

	public static void update(int id, String marque, String description) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbarticles", "root", "root");

		String sql = "UPDATE articles SET marque=?, description=? WHERE id=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, marque);
		ps.setString(2, description);
		ps.setInt(3, id);

		ps.executeUpdate();

		ps.close();
		conn.close();
	}

	public static void delete(int id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbarticles", "root", "root");

		String sql = "DELETE FROM articles WHERE id=" + id;
		Statement st = conn.createStatement();

		st.executeUpdate(sql);

		st.close();
		conn.close();

	}

}
