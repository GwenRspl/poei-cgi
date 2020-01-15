package tpTriable;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// testInt();
		// testString();
		// testPersonne();
		// testArticleTrierParMarque();
		testArticleTrierParPrix();

	}

	private static void testArticleTrierParPrix() {
		Article[] tab = { new Article("Zara", 50), new Article("Chanel", 500), new Article("YSL", 1000),
				new Article("H&M", 10) };
		for (Article article : tab) {
			System.out.println(article);
		}
		System.out.println("------------------------");
		Arrays.sort(tab, new ComparePrix());
		for (Article article : tab) {
			System.out.println(article);
		}

	}

	private static void testArticleTrierParMarque() {
		Article[] tab = { new Article("Zara", 50), new Article("Chanel", 500), new Article("YSL", 1000),
				new Article("H&M", 10) };
		for (Article article : tab) {
			System.out.println(article);
		}
		System.out.println("------------------------");
		Arrays.sort(tab, new CompareMarque());
		for (Article article : tab) {
			System.out.println(article);
		}

	}

	private static void testPersonne() {
		Personne p1 = new Personne("Haddock", "Capitaine", 40);
		Personne p2 = new Personne("Tournesol", "Professeur", 60);
		Personne p3 = new Personne("Etmilou", "Tintin", 25);
		Personne[] tab = { p1, p2, p3 };
		affiche(tab);

		Arrays.sort(tab);
		affiche(tab);

	}

	private static void testInt() {
		int[] tab = { 2, 1, 6, 5, 9, 8 };
		affiche(tab);

		Arrays.sort(tab);
		affiche(tab);
	}

	private static void testString() {
		String[] tab = { "aaa", "bbb", "ccc", "ddd", "eee" };
		affiche(tab);
		Arrays.sort(tab);
		affiche(tab);
	}

	private static void affiche(int[] tab) {
		for (int i : tab) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

	private static void affiche(String[] tab) {
		for (String i : tab) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

	private static void affiche(Personne[] tab) {
		for (Personne i : tab) {
			System.out.println(i);
		}
		System.out.println();
	}

}
