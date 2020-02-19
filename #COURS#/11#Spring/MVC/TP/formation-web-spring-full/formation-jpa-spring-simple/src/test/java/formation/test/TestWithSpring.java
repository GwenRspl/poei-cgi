package formation.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import formation.dao.IDaoSalle;
import formation.dao.jpa.DaoSalleJpa;
import formation.model.Adresse;
import formation.model.Personne;
import formation.model.Salle;

public class TestWithSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IDaoSalle daoSalle = (IDaoSalle) context.getBean(IDaoSalle.class);

		List<Salle> salles = daoSalle.findAll();
		
		System.out.println("Nombre au début="+salles.size());
		
		Salle wim = new Salle("Work In Merignac"); // new
		wim.setAdresse(new Adresse("86 avenue JFK", "33700", "Mérignac"));

		wim = daoSalle.save(wim); // managed

		Salle wimFind = daoSalle.find(wim.getId());

		System.out.println(wim.getId() + "=" + wimFind.getId());
		System.out.println(wim.getNom() + "=" + wimFind.getNom());
		System.out.println(wim.getAdresse().getRue() + "=" + wimFind.getAdresse().getRue());
		System.out.println(wim.getAdresse().getCodePostal() + "=" + wimFind.getAdresse().getCodePostal());
		System.out.println(wim.getAdresse().getVille() + "=" + wimFind.getAdresse().getVille());

		wim.setNom("WIM"); // detached
		wim.setAdresse(new Adresse("8 boulevard Saint Martin", "33000", "Bordeaux"));

		wim = daoSalle.save(wim); // managed

		wimFind = daoSalle.find(wim.getId());
		
		for(Personne p : wimFind.getPersonnes()) {
			System.out.println(p.getNom());
		}

		System.out.println(wim.getId() + "=" + wimFind.getId());
		System.out.println(wim.getNom() + "=" + wimFind.getNom());
		System.out.println(wim.getAdresse().getRue() + "=" + wimFind.getAdresse().getRue());
		System.out.println(wim.getAdresse().getCodePostal() + "=" + wimFind.getAdresse().getCodePostal());
		System.out.println(wim.getAdresse().getVille() + "=" + wimFind.getAdresse().getVille());

		salles = daoSalle.findAll();
		
		System.out.println("Nombre avant la suppression="+salles.size());
		
		daoSalle.delete(wim);
		
		wimFind = daoSalle.find(wim.getId());
		
		System.out.println(wimFind);
		
		
		
		context.close();
	}
}
