package projet1;

import java.util.Random;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		testRandom();
	}

	static void m1() {
		System.out.println("je suis m1");
	}

	static void m2() {
		System.out.println("je suis m2");
	}

	static void m5() {
		int a = 5;
		int b;
		b = a++; // b prend la valeur de a, et après a s'incrémente
		System.out.println(a);
		System.out.println(b);
		b = ++a; // b prend la valeur de a déjà incrémenté
		System.out.println(a);
		System.out.println(b);
	}

	static void m6() {
		System.out.println("Votre nom ?");
		Scanner clavier = new Scanner(System.in);
		String nom = clavier.nextLine();
		System.out.println("Bonjour " + nom);
		Scanner clavier2 = new Scanner(System.in); // il vaut mieux utiliser un scanner different quand on a besoin
													// d'input de types différents sinon bugs
		int nb = clavier.nextInt();
	}

	static void m7() {
		System.out.println("Votre age ?");
		Scanner clavier = new Scanner(System.in);
		int age = clavier.nextInt();
		if (age < 18)
			System.out.println("mineur");
		else
			System.out.println("majeur");
		System.out.println("a bientôt");
	}

	static void testEgal() {
		String s1 = "toto";
		String s2 = "toto";
		if (s1.equals(s2)) {
			System.out.println("OK");
		} else {
			System.out.println("KO");
		}
	}

	static void testSwitch() {
		System.out.print("Donner un nombre:");
		Scanner clavier = new Scanner(System.in);
		int nb = clavier.nextInt();
		switch (nb) {
		case 1:
			System.out.println("Lundi");
			break;
		case 2:
			System.out.println("Mardi");
			break;
		case 3:
			System.out.println("Mercredi");
			break;
		case 4:
			System.out.println("Jeudi");
			break;
		case 5:
			System.out.println("Vendredi");
			break;
		case 6:
			System.out.println("Début de ");
		case 7:
			System.out.println("Weekend");
			break;
		default:
			System.out.println("Autrement");
			break;
		}
	}

	static void testFor() {
		for (int i = 0; i < 10; i++) {
			System.out.println("I=" + i);
		}
	}

	static void testWhile() {
		int s = 0;
		int i = 0;
		while (i < 10) {
			s += i;
			i++;
		}
		System.out.println("somme=" + s);

	}

	static void doWhile() {
		int s = 0;
		int i = 100;
		do {
			s += i;
			System.out.println("I:=" + i);
			i++;
		} while (i < 10);
		System.out.println("somme=" + s);

	}

	static void testRandom() {
		Random r = new Random();
		int res= r.nextInt(10);
		System.out.println(res);
	}
}
