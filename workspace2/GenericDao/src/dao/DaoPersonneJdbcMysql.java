package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Personne;

public class DaoPersonneJdbcMysql implements DaoPersonne {

	private Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root", "root");
		return connection;

	}

	public ArrayList<Personne> find() throws ClassNotFoundException, SQLException {
		Connection conn = this.getConnection();

		String sql = "SELECT * FROM personnes";
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);

		ArrayList<Personne> personnes = new ArrayList<>();
		while (rs.next()) {
			Personne p = new Personne(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"));
			personnes.add(p);
		}

		rs.close();
		st.close();
		conn.close();

		return personnes;
	}

	public Personne findById(Integer id) throws ClassNotFoundException, SQLException {
		Connection conn = this.getConnection();

		String sql = "SELECT * FROM personnes WHERE id=" + id;
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);

		Personne personne = null;
		while (rs.next()) {
			personne = new Personne(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"));
		}

		rs.close();
		st.close();
		conn.close();

		return personne;
	}

	public void create(Personne p) throws ClassNotFoundException, SQLException {
		Connection conn = this.getConnection();

		String sql = "INSERT INTO personnes VALUES(?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, p.getId());
		ps.setString(2, p.getNom());
		ps.setString(3, p.getPrenom());

		ps.executeUpdate();

		ps.close();
		conn.close();
	}

	public void update(Personne p) throws ClassNotFoundException, SQLException {
		Connection conn = this.getConnection();

		String sql = "UPDATE personnes SET nom=?, prenom=? WHERE id=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, p.getNom());
		ps.setString(2, p.getPrenom());
		ps.setInt(3, p.getId());

		ps.executeUpdate();

		ps.close();
		conn.close();
	}

	public void delete(Personne p) throws ClassNotFoundException, SQLException {
		Connection conn = this.getConnection();

		String sql = "DELETE FROM personnes WHERE id=" + p.getId();
		Statement st = conn.createStatement();

		st.executeUpdate(sql);

		st.close();
		conn.close();
	}

	public ArrayList<Personne> findByRange(Integer id1, Integer id2) throws ClassNotFoundException, SQLException {

		Connection conn = this.getConnection();

		String sql = "SELECT * FROM personnes WHERE id BETWEEN " + id1 + " AND " + id2;
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);

		ArrayList<Personne> personnes = new ArrayList<>();
		while (rs.next()) {
			Personne personne = new Personne(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"));

			personnes.add(personne);
		}

		rs.close();
		st.close();
		conn.close();

		return personnes;
	}

}
