package projet1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		m8();

	}

	static void m8() {
		Scanner clavier = new Scanner(System.in);
		System.out.println("age?????");
		int age = clavier.nextInt();
		if (  (age < 18) )
			System.out.println("mineur");
		else
			System.out.println("majeur");
		System.out.println("a bientot");

	}

	static void m7() {
		Scanner clavier = new Scanner(System.in);
		System.out.println("age?????");
		int age = clavier.nextInt();
		if (age < 18) {
			System.out.println("mineur");
		}
		System.out.println("a bientot");

	}

	static void m6() {
		System.out.println("nom?????");
		Scanner clavier = new Scanner(System.in);
		String nom = clavier.nextLine();
		String s = "bienvenue " + nom;
		System.out.println(s);
	}

	static void m5() {
		int a = 5;
		int b;
		b = a++;
		System.out.println(a);
		System.out.println(b);
		b = ++a;
		System.out.println(a);
		System.out.println(b);
	}

	static void m4() {
		int a = 10;
		// a=a+20;
		a += 20;
		String s = "bonjour ";
		s += "toto";
		System.out.println(s);
	}

	static void m3() {
		String s1 = "bonjour";
		String s2 = "toto";
		String s3 = s1 + s2;
		System.out.println(s3);
		String s4 = "" + 2 + 0;
	}

	static void m1() {
		System.out.println("je suis m1");
		String str = "1";
		int a = Integer.parseInt(str);

		double b = 10.5;
		String c = "toto";
		char d = 'a';
		boolean e = false;

	}

	// cest la methode qui fait ....
	static void m2() {
		System.out.println("je suis m2");
		int x = 0;
		// System.out.println(x);
	}

}
