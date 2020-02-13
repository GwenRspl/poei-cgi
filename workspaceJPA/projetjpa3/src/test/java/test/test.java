package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Computer;
import model.Personne;

public class test {

	public static void main(String[] args) {

		testFindPersonne();
	}

	static void testConnexion() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb3");
		EntityManager em = emf.createEntityManager();

		em.close();
		emf.close();
	}

	static void testFindComputer() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb3");
		EntityManager em = emf.createEntityManager();

		Computer pc = em.find(Computer.class, "SN789");
		System.out.println(pc);

		em.close();
		emf.close();
		System.out.println(pc.getModel());
		System.out.println(pc	.getPersonne()
								.getNom());
	}

	static void testFindPersonne() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb3");
		EntityManager em = emf.createEntityManager();

		Personne p = em.find(Personne.class, 1);

		em.close();
		emf.close();
		System.out.println(p.getNom());
		System.out.println(p.getPc()
							.getModel());
	}

	static void testCreate() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb3");
		EntityManager em = emf.createEntityManager();

		Personne p = new Personne(1, "Haddock", "Capitaine", 41);
		Computer computer = new Computer();
		computer.setModel("Asus");
		computer.setSN("SN789");
		computer.setPersonne(p); // optionnel
		p.setPc(computer); // obligatoire

		EntityTransaction entityTransaction = em.getTransaction();
		entityTransaction.begin();

		em.persist(computer);
		em.persist(p);

		entityTransaction.commit();

		em.close();
		emf.close();
	}

}
