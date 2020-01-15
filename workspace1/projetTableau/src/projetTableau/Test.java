package projetTableau;

public class Test {

	public static void main(String[] args) {
		testSplit();
	}

	static void testIntv1() {
		int[] tab = new int[3];
		System.out.println(tab[0]);
		tab[0] = 10;
		System.out.println(tab[0]);

	}

	static void testIntv2() {
		int[] tab = new int[3];
		tab[0] = 10;
		tab[2] = 100;

		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
	}

	static void testIntv3() {
		int[] tab = { 1, 10, 100 };
		for (int e : tab) {
			System.out.print(e + "\t");
		}
	}

	static void testStringv1() {
		String[] tab = { "aa", "bb", null, "cc" };
		for (String str : tab) {
			if (str != null)
				System.out.print(str.toUpperCase() + "\t");
		}
	}

	static void afficheTableau(int[] x) {
		for (int e : x)
			System.out.print(e + "\t");

	}

	static void afficheTableau(String[] x) {
		for (String e : x)
			System.out.print(e + "\t");

	}

	static void testAfficheTableau() {
		int[] tab1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] tab2 = { 9, 8, 7, 6, 5, 4, 1, 2, 3, 7, 8, 9, 4, 5 };
		String[] tab3 = { "aa", "bb", "aa", "bb" };
		afficheTableau(tab1);
		System.out.println();
		afficheTableau(tab2);
		System.out.println();
		afficheTableau(tab3);
	}

	static int[] calcul(int a, int b) {
		int[] tab = new int[2];
		tab[0] = a + b;
		tab[1] = a - b;
		return tab;
	}

	static void testCalcul() {
		int x = 10;
		int y = 5;
		int[] res = calcul(x, y);
		System.out.println(x + "\t" + y);
		System.out.println(res[0] + "\t" + res[1]);
	}

	static void testSplit() {
		String string = "aa;aa cc-ee;ff";
		String[] tab = string.split(";");
		afficheTableau(tab);
	}

}
