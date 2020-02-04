package user;

import java.sql.SQLException;

import model.DAOPersonne;
import model.Personne;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		testCreate();
		testSelectAll();
		testSelectById();

		testUpdate();
		testSelectAll();

		testDelete();
		testSelectAll();

		testFindByRange();

	}

	private static void testSelectAll() throws ClassNotFoundException, SQLException {
		DAOPersonne dao = new DAOPersonne();
		System.out.println(dao.find());
	}

	private static void testSelectById() throws ClassNotFoundException, SQLException {
		DAOPersonne dao = new DAOPersonne();
		Personne p = dao.findById(2);
		if (p == null)
			System.out.println("Personne inexistante");
		else
			System.out.println(p);
	}

	private static void testCreate() throws ClassNotFoundException, SQLException {
		DAOPersonne dao = new DAOPersonne();
		Personne p = new Personne(9, "The Dog", "Milou");
		dao.create(p);
	}

	private static void testUpdate() throws ClassNotFoundException, SQLException {
		DAOPersonne dao = new DAOPersonne();
		Personne p = new Personne(9, "The Doggo", "Milou");
		dao.update(p);
	}

	private static void testDelete() throws ClassNotFoundException, SQLException {
		DAOPersonne dao = new DAOPersonne();
		dao.delete(9);
	}

	private static void testFindByRange() throws ClassNotFoundException, SQLException {
		DAOPersonne dao = new DAOPersonne();
		System.out.println(dao.findByRange(2, 4));
	}

}
