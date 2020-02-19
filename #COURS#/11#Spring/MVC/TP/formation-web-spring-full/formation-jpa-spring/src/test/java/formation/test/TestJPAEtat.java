package formation.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import formation.model.Adresse;
import formation.model.Eleve;
import formation.model.Salle;

public class TestJPAEtat {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("maFormation");


		EntityManager em = null;
		EntityTransaction tx = null;
		
		Salle wim = null;

		try {
			em = emf.createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			wim = new Salle("Work In Merignac"); // new ou transient
			wim.setAdresse(new Adresse("86 avenue JFK", "33700", "Mérignac"));
			
			em.persist(wim); // managed
	
			wim.setNom("WIM modif 1"); // dirty checking
			
			Salle wimFind = em.find(Salle.class, wim.getId()); // managed
			
			System.out.println(wim == wimFind);
			
			tx.commit(); // em.flush();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}
		
		wim.setNom("WIM modif 2"); // detached
		
		try {
			em = emf.createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			Salle wimCopy = em.merge(wim);
			
			wim.setNom("WIM modif 3"); // detached
			
			wimCopy.setNom("WIM modif 4"); // managed
			
			em.remove(wimCopy);
			
			tx.commit(); // em.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}
		
		try {
			em = emf.createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			em.remove(em.merge(wim));
			
			tx.commit(); // em.flush();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}
		
	
		
		emf.close();

	}

}
