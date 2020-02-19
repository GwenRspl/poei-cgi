package formation.test;

import java.util.List;

import formation.dao.IDaoSalle;
import formation.dao.jpa.DaoSalleJpa;
import formation.model.Adresse;
import formation.model.Salle;

public class TestWithDao {

	public static void main(String[] args) {
		IDaoSalle daoSalle = new DaoSalleJpa();

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

	}

}
