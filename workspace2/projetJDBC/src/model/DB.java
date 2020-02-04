package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {

	public static void insert(int id, String nom, String prenom) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CGI", "root", "root");

		String sql = "INSERT INTO personnes VALUES(" + id + ",'" + nom + "','" + prenom + "')";
		Statement st = conn.createStatement();

		st.executeUpdate(sql);

		st.close();
		conn.close();
	}

	public static void insertv2(int id, String nom, String prenom) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CGI", "root", "root");

		String sql = "INSERT INTO personnes VALUES(?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ps.setString(2, nom);
		ps.setString(3, prenom);

		ps.executeUpdate();

		ps.close();
		conn.close();
	}

	public static void updatev2(int id, String nom, String prenom) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CGI", "root", "root");

		String sql = "UPDATE personnes SET nom=?, prenom=? WHERE id=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, nom);
		ps.setString(2, prenom);
		ps.setInt(3, id);

		ps.executeUpdate();

		ps.close();
		conn.close();
	}

	public static void update(int id, String nom, String prenom) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CGI", "root", "root");

		String sql = "UPDATE personnes SET nom='" + nom + "', prenom='" + prenom + "' WHERE id=" + id;
		Statement st = conn.createStatement();

		st.executeUpdate(sql);

		st.close();
		conn.close();
	}

	public static void deletev2(int id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CGI", "root", "root");

		String sql = "DELETE FROM personnes WHERE id=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);

		int count = ps.executeUpdate();
		if (count != 0)
			System.out.println("ok");
		else
			System.out.println("ko");

		ps.close();
		conn.close();
	}

	public static void delete(int id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CGI", "root", "root");

		String sql = "DELETE FROM personnes WHERE id=" + id;
		Statement st = conn.createStatement();

		int count = st.executeUpdate(sql);
		if (count != 0)
			System.out.println("ok");
		else
			System.out.println("ko");

		st.close();
		conn.close();
	}

	public static String select() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CGI", "root", "root");

		String sql = "SELECT * FROM personnes";
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);

		StringBuilder result = new StringBuilder();
		result.append("ID\tNOM\t\tPRENOM");
		result.append("\n");
		while (rs.next()) {
			result.append(rs.getInt("id"));
			result.append("\t");
			result.append(rs.getString("nom"));
			if (rs	.getString("nom")
					.length() > 8)
				result.append("\t");
			else
				result.append("\t\t");
			result.append(rs.getString("prenom"));
			result.append("\n");
		}

		rs.close();
		st.close();
		conn.close();

		return result.toString();
	}

	public static String selectByNomLike(String nomLike) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CGI", "root", "root");

		// String sql = "SELECT * FROM personnes WHERE nom LIKE '%" + nomLike + "%'";
		// Statement st = conn.createStatement();
		//
		// ResultSet rs = st.executeQuery(sql);

		String sql = "SELECT * FROM personnes WHERE nom LIKE ?";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setString(1, "%" + nomLike + "%");

		ResultSet rs = st.executeQuery();

		StringBuilder result = new StringBuilder();
		result.append("ID\tNOM\t\tPRENOM");
		result.append("\n");
		while (rs.next()) {
			result.append(rs.getInt("id"));
			result.append("\t");
			result.append(rs.getString("nom"));
			if (rs	.getString("nom")
					.length() > 8)
				result.append("\t");
			else
				result.append("\t\t");
			result.append(rs.getString("prenom"));
			result.append("\n");
		}

		rs.close();
		st.close();
		conn.close();

		return result.toString();
	}

}
