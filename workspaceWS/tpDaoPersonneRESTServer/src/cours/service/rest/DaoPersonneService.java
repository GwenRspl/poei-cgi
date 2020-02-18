package cours.service.rest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/dao")
public class DaoPersonneService {

	public DaoPersonneService() {

	}

	@GET
	@Path("/test")
	@Produces(MediaType.APPLICATION_JSON)
	public String test() {
		return "test working..";
	}

	@GET
	@Path("/personnes")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Personne> selectAll() {
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
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return personnes;
	}

	@GET
	@Path("/personnes/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Personne findById(@PathParam(value = "id") int id) {
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
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return personne;
	}

	@POST
	@Path("/personnes")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String create(Personne p) {
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
		return "personne enregistrée en DB";
	}

	@DELETE
	@Path("/personnes/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String delete(@PathParam(value = "id") int id) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root", "root");

			ps = conn.prepareStatement("DELETE FROM personnes WHERE ID = ?");
			ps.setLong(1, id);

			ps.executeUpdate();
			ps.close();
			conn.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "ok";
	}

	@PUT
	@Path("/personnes")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String update(Personne p) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root", "root");

			String sql = "UPDATE personnes SET nom=?, prenom=? WHERE id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, p.getNom());
			ps.setString(2, p.getPrenom());
			ps.setInt(3, p.getId());

			ps.executeUpdate();

			ps.close();
			conn.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "ok";
	}

}
