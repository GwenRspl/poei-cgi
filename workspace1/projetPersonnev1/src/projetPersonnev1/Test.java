package projetPersonnev1;

public class Test {

	public static void main(String[] args) {
		test6();

	}

	static void test1() {
		Personne p = new Personne();
		p.nom = "Dupont";
		p.prenom = "Jean";
		System.out.println(p.getInfo());
	}

	static void test6() {
		Personne p1 = new Personne();
		p1.nom = "Dupont";
		p1.prenom = "Pierre";

		Personne p2 = new Personne();
		p2.nom = "Durand";
		p2.prenom = "Paul";

		Personne p3 = new Personne();
		p3.nom = "Martin";
		p3.prenom = "Jacques";

		Personne[] tab = { p1, p2, null, p3 };
		for (Personne p : tab) {
			if (p != null)
				System.out.println(p.getInfo());
		}

		tab[0].nom = "machin";
		System.out.println(p1.getInfo());

	}

}
