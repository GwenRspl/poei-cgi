package user;

import java.util.Scanner;

import model.Boisson;
import model.Commande;
import model.Dessert;
import model.Plat;

public class Test {

	public static void main(String[] args) {
		test1();
	}

	private static void test1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bonjour quel est votre nom ?");
		String name = scanner.nextLine();

		System.out.println("Veuillez saisir votre commande:");

		System.out.println("Quelle boisson voulez-vous ?");
		for (Boisson b : Boisson.values()) {
			System.out.println(b);
		}
		Boisson boisson = Boisson.valueOf(scanner	.nextLine()
													.toLowerCase());

		System.out.println("Quelle plat voulez-vous ?");
		for (Plat p : Plat.values()) {
			System.out.println(p);
		}
		Plat plat = Plat.valueOf(scanner.nextLine()
										.toLowerCase());

		System.out.println("Quelle dessert voulez-vous ?");
		for (Dessert d : Dessert.values()) {
			System.out.println(d);
		}
		Dessert dessert = Dessert.valueOf(scanner	.nextLine()
													.toLowerCase());

		Commande commande = new Commande(name, boisson, plat, dessert);
		System.out.println("A - Prix total\nB - Facture détaillée");
		String string = scanner.nextLine();
		if (string.equalsIgnoreCase("A")) {
			System.out.println("Le prix total est " + commande.getPrixTotal() + "€");

		} else if (string.equalsIgnoreCase("B")) {
			System.out.println(commande);
		}

	}

}
