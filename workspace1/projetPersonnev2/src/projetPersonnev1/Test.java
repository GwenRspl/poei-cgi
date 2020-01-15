package projetPersonnev1;

public class Test {

	public static void main(String[] args) {
		test3();

	}

	static void test1() {
		Personne p = new Personne();
		p.nom = "Dupont";
		p.prenom = "Jean";
		p.age = 10;
		System.out.println(p.getInfo());
	}

	static void test2() {
		Personne p = new Personne();
		p = new Personne();
	}

	static void test3() {
		Personne p = new Personne("Marchand", "Pierre", 12);
		Personne[] tab = { new Personne(), new Personne("Martin", "Paul"), new Personne("Durand", "Jacques", 21), p };

		for (Personne personne : tab) {
			System.out.println(personne.getInfo());
		}

	}

}
