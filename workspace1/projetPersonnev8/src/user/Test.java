package user;

import model.Adresse;
import model.Personne;

public class Test {

	public static void main(String[] args) {
		test1();

	}

	static void test1() {
		Adresse adr = new Adresse(161, "verdun", "94200");
		Personne p = new Personne("Haddock", "Capitaine");
		p.setAdresse(adr);
		adr.setPersonne(p);
		System.out.println(p.getNom());
		System.out.println(p.getAdresse().getCp());
		System.out.println(adr.getPersonne().getNom());
	}


}
