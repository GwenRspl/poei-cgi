package user;

import java.sql.SQLException;

import model.DB;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		testInsert();
		testSelectAll();

		testSelectById();

		testUpdate();
		testSelectAll();

		testDelete();
		testSelectAll();

	}

	private static void testSelectAll() throws ClassNotFoundException, SQLException {
		System.out.println(DB.selectAll());
	}

	private static void testSelectById() throws ClassNotFoundException, SQLException {
		System.out.println(DB.selectById(2));
	}

	private static void testInsert() throws ClassNotFoundException, SQLException {
		DB.insert("Zara", "Un manteau en laine");
	}

	private static void testUpdate() throws ClassNotFoundException, SQLException {
		DB.update(2, "Dior", "Un manteau en or");
	}

	private static void testDelete() throws ClassNotFoundException, SQLException {
		DB.delete(3);
	}

}
