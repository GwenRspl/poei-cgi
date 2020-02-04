package user;

import java.sql.SQLException;

import dao.DaoPersonneJdbcMysql;
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
		DaoPersonneJdbcMysql dao = new DaoPersonneJdbcMysql();
		System.out.println(dao.find());
	}

	private static void testSelectById() throws ClassNotFoundException, SQLException {
		DaoPersonneJdbcMysql dao = new DaoPersonneJdbcMysql();
		Personne p = dao.findById(2);
		if (p == null)
			System.out.println("Personne inexistante");
		else
			System.out.println(p);
	}

	private static void testCreate() throws ClassNotFoundException, SQLException {
		DaoPersonneJdbcMysql dao = new DaoPersonneJdbcMysql();
		Personne p = new Personne(9, "The Dog", "Milou");
		dao.create(p);
	}

	private static void testUpdate() throws ClassNotFoundException, SQLException {
		DaoPersonneJdbcMysql dao = new DaoPersonneJdbcMysql();
		Personne p = new Personne(9, "The Doggo", "Milou");
		dao.update(p);
	}

	private static void testDelete() throws ClassNotFoundException, SQLException {
		DaoPersonneJdbcMysql dao = new DaoPersonneJdbcMysql();
		dao.delete(new Personne(9, "", ""));
	}

	private static void testFindByRange() throws ClassNotFoundException, SQLException {
		DaoPersonneJdbcMysql dao = new DaoPersonneJdbcMysql();
		System.out.println(dao.findByRange(2, 4));
	}

}
