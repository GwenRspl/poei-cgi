package user;

import model.Adresse;
import model.Personne;

public class Test {

	public static void main(String[] args) {
		test4();

	}

	static void test1() {
		Adresse adr = new Adresse(161, "verdun", "94200");
		Personne p = new Personne("Haddock", "Capitaine", adr);
		System.out.println(p);
	}

	static void test2() {
		Personne p = new Personne("Haddock", "Capitaine");
		System.out.println(p);
	}

	static void test3() {
		Adresse adr = new Adresse(161, "verdun", "94200");
		System.out.println(adr);
		adr.setNumero(160);
		System.out.println(adr);
	}

	private static void test4() {
		Adresse adr = new Adresse(161, "verdun", "94200");
		Personne p = new Personne("Haddock", "Capitaine", adr);
		System.out.println(p);
		p.getAdresse().setNumero(160);
		System.out.println(p);

	}

}
