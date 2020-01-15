package user;

import model.Eleve;
import model.Professeur;

public class Test {

	public static void main(String[] args) {
		test1();

	}

	private static void test1() {
		Professeur professeur = new Professeur("Tournesol");

		Eleve e1 = new Eleve("Peter");
		Eleve e2 = new Eleve("Parker");

		e1.setProfesseur(professeur);
		e2.setProfesseur(professeur);
		professeur.attach(e1);
		professeur.attach(e2);

		professeur.setNote(18);
		System.out.println(e1);
		System.out.println(e2);

	}

}
