package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Personne;
import model.Projet;

public class test {

	public static void main(String[] args) {

		// testConnexion();
		// testCreate();
		// testFindAllPersonne();
		testFindPersonneById();

	}

	static void testConnexion() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb5");
		EntityManager em = emf.createEntityManager();

		em.close();
		emf.close();
	}

	static void testCreate() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb5");
		EntityManager em = emf.createEntityManager();

		Personne p1 = new Personne(1, "Haddock", "Capitaine", 41);
		Personne p2 = new Personne(2, "Tournesol", "Professeur", 62);

		Projet pro1 = new Projet();
		pro1.setId(1);
		pro1.setName("JAVA");

		Projet pro2 = new Projet();
		pro2.setId(2);
		pro2.setName("SQL");

		p1.setProjets(new ArrayList<Projet>(Arrays.asList(pro1, pro2)));
		p2.setProjets(new ArrayList<Projet>(Arrays.asList(pro1, pro2)));

		EntityTransaction entityTransaction = em.getTransaction();
		entityTransaction.begin();

		em.persist(pro1);
		em.persist(pro2);
		em.persist(p1);
		em.persist(p2);

		entityTransaction.commit();

		em.close();
		emf.close();
	}

	static void testFindAllPersonne() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb5");
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("SELECT p from Personne p");
		List<Personne> list = query.getResultList();

		System.out.println(list);

		em.close();
		emf.close();

	}

	static void testFindPersonneById() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb5");
		EntityManager em = emf.createEntityManager();

		Personne p = em.find(Personne.class, 2);

		// System.out.println(p);
		// System.out.println(p.getProjets());

		em.close();
		emf.close();
		System.out.println(p.getProjets());
	}

}
