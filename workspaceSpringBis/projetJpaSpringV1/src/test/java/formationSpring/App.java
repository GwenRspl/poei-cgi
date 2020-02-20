package formationSpring;

import dao.PersonneDaoImpl;

public class App {

	public static void main(String[] args) {
		test();
	}

	static void test() {
		System.out.println(new PersonneDaoImpl().findAll());
	}

}
