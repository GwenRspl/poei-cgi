package test;

import java.util.List;

import dao.PersonneDaoImpl;
import model.Personne;

public class Test2 {

	public static void main(String[] args) {
		testCreate();
		testFindById();
		testUpdate();
		testFindAll();
		testDelete();
		testFindAll();
		testFindByName();

	}

	private static void testCreate() {
		Personne personne = new Personne(10, "César", "Jules", 48);
		new PersonneDaoImpl().create(personne);
	}

	private static void testFindAll() {
		List<Personne> list = new PersonneDaoImpl().findAll();
		System.out.println(list);
	}

	private static void testFindById() {
		Personne p = new PersonneDaoImpl().findById(10);
		System.out.println(p);
	}

	private static void testUpdate() {
		Personne personne = null;
		personne = new PersonneDaoImpl().findById(10);
		personne.setAge(50);
		new PersonneDaoImpl().update(personne);
	}

	private static void testDelete() {
		new PersonneDaoImpl().delete(new Personne(10, "", "", 0));
	}

	private static void testFindByName() {
		List<Personne> list = new PersonneDaoImpl().findByName("Haddock");
		System.out.println(list);
	}

}
