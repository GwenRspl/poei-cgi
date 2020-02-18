package tpSoapDaoServer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DaoPersonne {

	public ArrayList<Personne> find() {
		ArrayList<Personne> personnes = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root", "root");

			String sql = "SELECT * FROM personnes";
			Statement st = conn.createStatement();

			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				Personne p = new Personne(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"));
				personnes.add(p);
			}

			rs.close();
			st.close();
			conn.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return personnes;
	}

	public Personne findById(int id) {
		Personne personne = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root", "root");

			String sql = "SELECT * FROM personnes WHERE id=" + id;
			Statement st = conn.createStatement();

			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				personne = new Personne(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"));
			}

			rs.close();
			st.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return personne;
	}

	public void create(Personne p) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root", "root");

			String sql = "INSERT INTO personnes VALUES(?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, p.getId());
			ps.setString(2, p.getNom());
			ps.setString(3, p.getPrenom());

			ps.executeUpdate();

			ps.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
