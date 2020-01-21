package projetException;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		testDiv();

	}

	private static void testDiv() {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("nb1");
			int a = scanner.nextInt();
			System.out.println("nb2");
			int b = scanner.nextInt();
			int c = Traitement.div(a, b);
			System.out.println(c);
		} catch (Exception e) {
			System.out.println("exception gérée");
		}
		System.out.println("fini");

	}

	private static void test4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("avant");
		System.out.println("saisir chiffre dans une chaine");
		String saisie = scanner.nextLine();

		try {
			int res = Integer.parseInt(saisie);
			res++;
			System.out.println(">>>" + res);
		} catch (Exception e) {
			System.out.println("exception gérée");
		} finally {
			System.out.println("finally");
		}
		System.out.println("après");

	}

	private static void test2() {
		int a = 10;
		int b = 0;
		int c = a / b;
		System.out.println(c);

	}

	private static void test1() {
		System.out.println("avant");
		String str = "2a";
		int a = Integer.parseInt(str);
		System.out.println(a);
		System.out.println("après");

	}

}
