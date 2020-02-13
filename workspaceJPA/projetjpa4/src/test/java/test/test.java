package test;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Departement;
import model.Personne;

public class test {

	public static void main(String[] args) {

		// testConnexion();
		// testCreate();
		// testFindAllPersonne();
		// testFindPersonneById();
		testFindDeptByIdV2();
	}

	static void testConnexion() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb4");
		EntityManager em = emf.createEntityManager();

		em.close();
		emf.close();
	}

	static void testCreate() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb4");
		EntityManager em = emf.createEntityManager();

		Departement d1 = new Departement(75, "Paris");
		Departement d2 = new Departement(94, "Val-De-Marne");

		Personne p1 = new Personne(1, "Haddock", "Capitaine", 41);
		Personne p2 = new Personne(2, "Tournesol", "Professeur", 62);
		Personne p3 = new Personne(3, "Ratapopoulos", "Monsieur", 52);
		Personne p4 = new Personne(4, "EtMilou", "Tintin", 28);

		p1.setDept(d1);
		p2.setDept(d1);
		p3.setDept(d2);
		p4.setDept(d2);

		EntityTransaction entityTransaction = em.getTransaction();
		entityTransaction.begin();

		em.persist(d1);
		em.persist(d2);
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);

		entityTransaction.commit();

		em.close();
		emf.close();
	}

	static void testFindAllPersonne() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb4");
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("SELECT p from Personne p");
		List<Personne> list = query.getResultList();

		System.out.println(list);

		em.close();
		emf.close();
	}

	static void testFindPersonneById() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb4");
		EntityManager em = emf.createEntityManager();

		Personne p = em.find(Personne.class, 2);

		System.out.println(p);

		em.close();
		emf.close();
	}

	static void testFindDeptById() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb4");
		EntityManager em = emf.createEntityManager();

		Departement p = em.find(Departement.class, 75);

		System.out.println(p);

		em.close();
		emf.close();
	}

	static void testFindDeptByIdV2() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb4");
		EntityManager em = emf.createEntityManager();

		Departement p = em.find(Departement.class, 75);
		Collection<Personne> collection = p.getPersonnes();
		System.out.println(collection); // il faut solliciter l'objet au sein de la connexion ouverte, sans cette ligne,
										// le 2e sysout ne fonctionnne pas

		em.close();
		emf.close();
		System.out.println(collection);
	}

}
