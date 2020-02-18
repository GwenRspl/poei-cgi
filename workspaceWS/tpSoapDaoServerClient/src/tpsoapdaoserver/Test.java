package tpsoapdaoserver;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		// find();
		findById();
		create();

	}

	static void find() {
		PersonneWS service = new PersonneServiceService().getPersonneWSPort();
		List<Personne> list = service.find();
		for (Personne personne : list) {
			System.out.println("\n" + personne.getId() + " " + personne.getPrenom() + " " + personne.getNom());
		}
	}

	static void findById() {
		PersonneWS service = new PersonneServiceService().getPersonneWSPort();
		Personne personne = service.findById(2);
		System.out.println("\n" + personne.getId() + " " + personne.getPrenom() + " " + personne.getNom());
	}

	static void create() {
		PersonneWS service = new PersonneServiceService().getPersonneWSPort();
		Personne p = new Personne();
		p.setId(11);
		p.setNom("Rabbit");
		p.setPrenom("Roger");
		service.create(p);
	}

}
