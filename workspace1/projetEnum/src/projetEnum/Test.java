package projetEnum;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		testFormationv5();
	}

	private static void testJour() {
		System.out.println(Semaine.WE);

	}

	private static void testCivilite() {
		System.out.println(Civilite.MLLE + " Castafiore");

	}

	private static void testCivilitev2() {
		Civilite mrbis = Civilite.MR;
		System.out.println(Civilite.MR);
		System.out.println(mrbis);
		String string = Civilite.MR.toString();
		String string1 = Civilite.MR.name();
		System.out.println(string1);

	}

	private static void testFormationv1() {
		System.out.println(Formation.JAVA);
		Formation formation = Formation.PYTHON;
		System.out.println(formation.toString());
		System.out.println(formation.name());
	}

	private static void testFormationv2() {
		Formation f = Formation.JAVA;
		System.out.println(f.getPrix());
		System.out.println(f.getLieu());
		System.out.println(Formation.HTML.getLieu());

	}

	private static void testFormationv4() {
		Formation f = Formation.JAVA;
		System.out.println(f.toString());
		System.out.println(f.name());

	}

	private static void testFormationv5() {
		Scanner scan = new Scanner(System.in);
		Formation[] formations = Formation.values();
		System.out.println("choisir depuis la liste");
		for (Formation formation : formations) {
			System.out.print(formation.name() + "\t");
		}
		System.out.println();
		String choix = scan.nextLine();
		Formation f = Formation.valueOf(choix);
		System.out.println(f);

	}

}
