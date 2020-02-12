package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Adresse;
import model.Personne;

public class test {

	public static void main(String[] args) {

		testFind();
	}

	static void testConnexion() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb2");
		EntityManager em = emf.createEntityManager();

		em.close();
		emf.close();
	}

	static void testFind() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb2");
		EntityManager em = emf.createEntityManager();

		Personne p = em.find(Personne.class, 1);
		System.out.println(p.getNom());
		System.out.println(p.getAdresse()
							.getCp());

		em.close();
		emf.close();
	}

	static void testCreate() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb2");
		EntityManager em = emf.createEntityManager();

		Adresse adresse = new Adresse(12, "rue Léon Blum", 94400);
		Personne p = new Personne(1, "Haddock", "Capitaine", 41, adresse);

		EntityTransaction entityTransaction = em.getTransaction();
		entityTransaction.begin();

		em.persist(p);

		entityTransaction.commit();

		em.close();
		emf.close();
	}

}
