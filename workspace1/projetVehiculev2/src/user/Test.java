package user;

import model.Bateau;
import model.EBateau;
import model.Vehicule;
import model.Velo;
import model.Voiture;

public class Test {

	public static void main(String[] args) {
		test9();

	}

	private static void test9() {
		Velo v1 = new Velo("Scours", 200);
		Voiture v2 = new Voiture("Pitude", 45000);
		Bateau bateau = new Bateau("Piqueur", 110000, EBateau.MOYEN);

		testDemarrer(v1);
		testDemarrer(v2);
		testDemarrer(bateau);

	}

	private static void testDemarrer(Vehicule vehicule) {
		System.out.println(vehicule.demarrer());

	}

	private static void test6() {
		Velo v1 = new Velo("QuickBike", 200);
		Voiture v2 = new Voiture("Mercedes", 45000);
		Vehicule v3 = new Voiture("Tracto1000", 500);
		Bateau bateau = new Bateau("Yachtching", 110000, EBateau.MOYEN);

		testAvancer(v1);
		testAvancer(v2);
		testAvancer(v3);
		testAvancer(bateau);
	}

	static void testAvancer(Vehicule v) {
		System.out.println(v.avancer());
	}

	private static void test5() {
		Voiture v1 = new Voiture("Mercedes", 45000);
		Vehicule v2 = v1;
		Voiture v3 = (Voiture) v2;

	}

	private static void test4() {
		Vehicule v3 = new Voiture("Tracto1000", 500);
		Object v2 = new Voiture("Tracto1000", 500);

		System.out.println(v2);

	}

	private static void test3() {

		Velo v1 = new Velo("QuickBike", 200);
		Voiture v2 = new Voiture("Mercedes", 45000);
		Vehicule v3 = new Voiture("Tracto1000", 500);
		Bateau bateau = new Bateau("Yachtching", 110000, EBateau.MOYEN);

		Vehicule[] tab = { v1, v2, v3, bateau };

		for (Vehicule vehicule : tab) {
			System.err.println(vehicule.avancer());
		}
	}

	private static void test2() {
		Voiture v1 = new Voiture("aa", 200);
		Vehicule v2 = new Voiture("aa", 200);

		v1.gpsOnOff();

		Velo v3 = new Velo("QuickBike", 200);
		Vehicule v4 = new Velo("QuickBike", 200);
		System.out.println(v3.avancer());
		System.out.println(v4.avancer());

	}

	private static void test1() {
		Velo v1 = new Velo("QuickBike", 200);
		Voiture v2 = new Voiture("Mercedes", 45000);
		Vehicule v3 = new Voiture("Tracto1000", 500);
		Bateau bateau = new Bateau("Yachtching", 110000, EBateau.MOYEN);

		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(bateau);

		System.out.println(v1.avancer());
		System.out.println(v2.avancer());
		System.out.println(v3.avancer());
		System.out.println(bateau.avancer());

	}

	private static void test8() {
		Vehicule[] tab = { new Velo("QuickBike", 200), new Voiture("Mercedes", 45000), new Voiture("Tracto1000", 500),
				new Bateau("Yachtching", 110000, EBateau.MOYEN) };

		for (Vehicule vehicule : tab) {
			System.err.println(vehicule.avancer());
			System.err.println(vehicule.demarrer());
		}
	}

}
