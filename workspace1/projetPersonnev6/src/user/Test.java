package user;

import model.Adresse;
import model.Personne;

public class Test {

	public static void main(String[] args) {
		test3();

	}

	static void test1() {
		Adresse adr = new Adresse(161, "verdun", "94200");
		Personne p = new Personne("Haddock", "Capitaine", adr, 80, 1.85);
		System.out.println(p);
		Personne p2 = new Personne("Tournesol", "Professeur");
		System.out.println(p2);
	}

	private static void test3() {
		Adresse adr = new Adresse(161, "verdun", "94200");
		Personne p = new Personne("Haddock", "Capitaine", 80, 1.85);
		System.out.println(p);
		System.out.println(p.getInfo()
							.getTaille());
		p	.getInfo()
			.setPoids(70);
		System.out.println(p);

	}

}
