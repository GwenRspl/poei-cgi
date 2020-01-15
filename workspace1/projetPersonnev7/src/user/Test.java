package user;

import model.Groupe;
import model.Personne;

public class Test {

	public static void main(String[] args) {
		test2();
	}

	static void test1() {
		Groupe g = new Groupe("CGI", 10);
		Personne p1 = new Personne(1, "Jones", "Indiana", 30);
		Personne p2 = new Personne(2, "Jones", "Junior", 10);
		Personne p3 = new Personne(3, "Jones", "Doggy", 3);
		g.ajouter(p1);
		g.ajouter(p2);
		g.ajouter(p3);
		System.out.println(g);

		g.retirer(2);
		System.out.println(g);
		System.out.println(g.getCount());

	};

	static void test2() {
		Groupe g = new Groupe("CGI", 10);
		Personne p1 = new Personne(1, "Jones", "Indiana", 30);
		Personne p2 = new Personne(2, "Jones", "Junior", 10);
		Personne p3 = new Personne(3, "Dog", "SnoopDoggy", 3);
		g.ajouter(p1);
		g.ajouter(p2);
		g.ajouter(p3);

		System.out.println(g);
		System.out.println("nb of personnes: " + g.getCount());
		System.out.println("nb of Jones: " + g.getCountByNom("Jones"));
		System.out.println("nb of Dog: " + g.getCountByNom("Dog"));
	};
}
