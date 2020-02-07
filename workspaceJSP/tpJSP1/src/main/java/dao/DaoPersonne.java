package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Personne;

public class DaoPersonne {

	public void insert(Personne p) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root", "root");
		String sql = "INSERT INTO personnes VALUES(?,?,?)";
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setInt(1, p.getId());
		ps.setString(2, p.getNom());
		ps.setString(3, p.getPrenom());

		ps.executeUpdate();

		ps.close();
		connection.close();
	}

}
