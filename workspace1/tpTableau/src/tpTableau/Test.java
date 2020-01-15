package tpTableau;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		tpTraitementText();

	}

	static void tpTableau() {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		System.out.print("Veuillez saisir la taille du tableau (de chaine) souhaitée: ");
		int size = scanner.nextInt();
		String[] tab = new String[size];

		for (int i = 0; i < size; i++) {
			System.out.print("Veuillez saisir l'élément n°" + (i + 1) + " du tableau: ");
			tab[i] = scanner2.nextLine();
		}

		System.out.println("Voici un affichage du tableau démandé:");
		for (String str : tab) {
			System.out.print(str + "\t");
		}

	}

	static void tpDoubleTableau() {
		int[] tab1 = { 10, 20, 30, 40, 50 };
		int[] tab2 = doublerTableau(tab1);
		afficheTableau(tab1);
		System.out.println();
		afficheTableau(tab2);
	}

	static int[] doublerTableau(int[] tab) {
		int[] newTab = new int[tab.length];
		for (int i = 0; i < tab.length; i++) {
			newTab[i] = tab[i] * 2;
		}
		return newTab;
	}

	static void tpDoubleTableauv2() {
		int[] tab1 = { 10, 20, 30, 40, 50 };
		afficheTableau(tab1);
		doublerTableauv2(tab1);
		System.out.println();
		afficheTableau(tab1);

	}

	static void doublerTableauv2(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			tab[i] *= 2;
		}
	}

	static void afficheTableau(int[] x) {
		for (int e : x)
			System.out.print(e + "\t");
	}

	static void tpOccurence() {
		Scanner scanner = new Scanner(System.in);
		int[] tab = { 1, 2, 1, 3, 1, 2, 4 };
		System.out.println("Veuillez choisir un chiffre de la liste: ");
		afficheTableau(tab);
		System.out.println();
		int nb = scanner.nextInt();
		int occurence = occurence(nb, tab);
		System.out.println("Apparait: " + occurence + " fois");
	}

	static int occurence(int nb, int[] tab) {
		int count = 0;
		for (int x : tab) {
			if (x == nb)
				count++;
		}
		return count;
	}

	static void tpReverse() {
		int[] tab1 = { 10, 20, 30, 40 };
		int[] tab2 = reverse(tab1);
		afficheTableau(tab1);
		System.out.println();
		afficheTableau(tab2);
	}

	static int[] reverse(int[] tab) {
		int[] newTab = new int[tab.length];
		for (int i = 0; i < tab.length; i++) {
			newTab[newTab.length - 1 - i] = tab[i];
		}
		return newTab;
	}

	static void tpTraitementText() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Veuillez saisir une phrase:\t");
		String text = scanner.nextLine();
		String response = traitementText(text);
		System.out.println("La nouvelle phrase est :\t" + response);
	}

	static String traitementText(String text) {
		String[] textArray = splitText(text);
		textArray = reverseString(textArray);
		String result = concatText(textArray);
		return result;
	}

	static String[] splitText(String str) {
		return str.split(" ");
	}

	static String[] reverseString(String[] tab) {
		String[] newTab = new String[tab.length];
		for (int i = 0; i < tab.length; i++) {
			newTab[newTab.length - 1 - i] = tab[i];
		}
		return newTab;
	}

	static String concatText(String[] tab) {
		StringBuilder result = new StringBuilder();
		for (String e : tab) {
			result.append(e + " ");
		}
		return result	.toString()
						.trim()
						.toUpperCase();
	}

}
