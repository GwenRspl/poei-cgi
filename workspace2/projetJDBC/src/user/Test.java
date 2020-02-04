package user;

import java.sql.SQLException;

import model.DB;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// testInsertv2();
		// testUpdatev2();
		// testDeletev2();
		// testSelect();
		testSelectByNomLike();
	}

	private static void testSelectByNomLike() throws ClassNotFoundException, SQLException {
		System.out.println(DB.selectByNomLike("u"));

	}

	private static void testSelect() throws ClassNotFoundException, SQLException {
		System.out.println(DB.select());

	}

	private static void testInsertv2() throws ClassNotFoundException, SQLException {
		DB.insertv2(9, "aaa", "ccc");
		DB.insertv2(10, "bbb", "ddd");
		DB.insertv2(11, "eee", "fff");
		DB.insertv2(12, "ggg", "hhh");
	}

	private static void testUpdatev2() throws ClassNotFoundException, SQLException {
		DB.updatev2(9, "aaa1", "ccc1");
		DB.updatev2(10, "bbb1", "ddd1");
		DB.updatev2(11, "eee1", "fff1");
		DB.updatev2(12, "ggg1", "hhh1");
	}

	private static void testDeletev2() throws ClassNotFoundException, SQLException {
		DB.deletev2(9);
		DB.deletev2(10);
		DB.deletev2(11);
		DB.deletev2(12);
	}

	private static void testInsert() throws ClassNotFoundException, SQLException {
		DB.insert(9, "aaa", "ccc");
		DB.insert(10, "bbb", "ddd");
		DB.insert(11, "eee", "fff");
		DB.insert(12, "ggg", "hhh");
	}

	private static void testUpdate() throws ClassNotFoundException, SQLException {
		DB.update(9, "aaa1", "ccc1");
		DB.update(10, "bbb1", "ddd1");
		DB.update(11, "eee1", "fff1");
		DB.update(12, "ggg1", "hhh1");
	}

	private static void testDelete() throws ClassNotFoundException, SQLException {
		DB.delete(9);
		DB.delete(10);
		DB.delete(11);
		DB.delete(12);
	}

}
