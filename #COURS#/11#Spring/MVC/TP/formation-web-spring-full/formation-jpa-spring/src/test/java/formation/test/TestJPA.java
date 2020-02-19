package formation.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import formation.model.Adresse;
import formation.model.Eleve;
import formation.model.Formateur;
import formation.model.Salle;

public class TestJPA {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("maFormation");
		EntityManager em = null;
		EntityTransaction tx = null;

		Formateur eric = null;
		
		try {
			em = emf.createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			Salle wim = new Salle("Work In Merignac");
			wim.setAdresse(new Adresse("86 avenue JFK", "33700", "Mérignac"));

			em.persist(wim);

			Eleve jerome = new Eleve("MAGNANT", "Jérôme");
			jerome.setNote(14);
			jerome.setDtNaissance(sdf.parse("11/09/1992"));
			jerome.setAdresse(new Adresse("1 rue de la Paix", "75008", "Paris"));

			em.persist(jerome);
			
			eric = new Formateur("SULTAN", "Eric");
			
			jerome.setFormateur(eric);
			
			em.persist(eric);
			

			tx.commit(); 
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
		
		Formateur ericFind = null;
		
		try {
			em = emf.createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			ericFind = em.find(Formateur.class, eric.getId());

			for(Eleve eleve : ericFind.getEleves()) {
				System.out.println(eleve.getNom());
			}
			
			tx.commit();
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

		
		for(Eleve eleve : ericFind.getEleves()) {
			System.out.println(eleve.getNom());
		}
		
		emf.close();

	}

}
