package projet2;

import java.util.Random;
import java.util.Scanner;

public class Tp {

	public static void main(String[] args) {
		menu();
	}

	static void tpInfo() {
		System.out.println("\nVotre nom ?");
		Scanner scanner = new Scanner(System.in);
		String nom = scanner.nextLine();
		System.out.println("Votre prénom ?");
		String prenom = scanner.nextLine();
		System.out.println("Prénom: " + prenom + "\n" + "Nom: " + nom);
	}

	static void tpAge() {
		System.out.println("\nVotre age ?");
		Scanner scan = new Scanner(System.in);

		int ageMin = 0;
		int ageMax = 120;
		int ageMineur = 18;
		int ageMajeur = 50;

		int age = scan.nextInt();
		if (age < ageMin || age > ageMax) {
			System.out.println("erreur");
		} else if (age < ageMineur) {
			System.out.println("mineur");
		} else if (age < ageMajeur) {
			System.out.println("majeur");
		} else {
			System.out.println("senior");
		}

	}

	static void menu() {
		StringBuilder instruction = new StringBuilder();
		instruction	.append("Choose the method to execute:\n")
					.append("1> tpAGe\n")
					.append("2> tpInfo\n")
					.append("3> tpBoucle\n")
					.append("4> tpBoucle2\n")
					.append("5> tpPuissance\n")
					.append("6> tpRandom\n")
					.append("7> tpCalculSalaire\n")
					.append("8> tpCalcul\n");
		System.out.println(instruction.toString());
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		switch (choice) {
		case 1:
			tpAge();
			break;
		case 2:
			tpInfo();
			break;
		case 3:
			tpBoucle();
			break;
		case 4:
			tpBoucle2();
			break;
		case 5:
			tpPuissance();
			break;
		case 6:
			tpRandom();
			break;
		case 7:
			tpCalculSalaire();
			break;
		case 8:
			tpCalcul();
			break;
		default:
			System.out.println("Wrong number");
		}
	}

	static void tpBoucle() {
		Scanner stringScan = new Scanner(System.in);
		Scanner intScan = new Scanner(System.in);

		System.out.println("\nDonner un caractère");
		String character = stringScan.nextLine();

		System.out.println("Donner la largeur");
		int width = intScan.nextInt();

		System.out.println("Donner la hauteur");
		int height = intScan.nextInt();

		for (int i = 0; i < height; i++) {
			for (int y = 0; y < width; y++) {
				System.out.print(character + "\t");
			}
			System.out.println("\n");
		}
	}

	static void tpBoucle2() {
		Scanner stringScan = new Scanner(System.in);
		Scanner intScan = new Scanner(System.in);

		System.out.println("\nDonner un caractère");
		String character = stringScan.nextLine();

		System.out.println("Donner la largeur");
		int width = intScan.nextInt();

		System.out.println("Donner la hauteur");
		int height = intScan.nextInt();

		String lines = "";

		for (int i = 0; i < height; i++) {
			for (int y = 0; y < width; y++) {
				lines += character + "\t";
			}
			lines += "\n";
		}
		System.out.println(lines + "\n");
	}

	static void tpPuissance() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Premier double");
		double firstDouble = Double.parseDouble(scan.nextLine());

		System.out.println("Deuxième double");
		double secondDouble = Double.parseDouble(scan.nextLine());

		double res = Math.pow(firstDouble, secondDouble);
		System.out.println(firstDouble + " puissance " + secondDouble + " = " + res);

	}

	static void tpRandom() {
		Random r = new Random();
		int res = r.nextInt(11);
		boolean success = false;
		int input;
		int count = 0;

		Scanner scan = new Scanner(System.in);

		while (!success) {
			count++;
			System.out.println("Saisir le chiffre à deviner entre 0 et 10");
			input = scan.nextInt();
			if (input == res) {
				success = true;
				System.out.println("Bravo vous avez trouvé le bon chiffre en " + count
						+ " tentative(s), il s'agissait bien de " + res);
			} else if (input < res && count < 5) {
				System.out.println("C'est plus!");
			} else if (input > res && count < 5) {
				System.out.println("C'est moins!");
			} else {
				System.out.println("Game over!");
				break;
			}
		}
	}

	static void tpCalculSalaire() {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Saisissez votre nom:");
		String name = scanner.nextLine();
		System.out.println("Saisissez votre salaire annuel brut:");
		double salary = scanner2.nextDouble();
		calculSalaire(name, salary);
	}

	static void calculSalaire(String name, double salary) {
		double monthlySalary = salary / 12;
		double netSalary = monthlySalary - (monthlySalary * 23 / 100);
		System.out.println(name + ", votre salaire mensuel net est de " + netSalary);

	}

	static void tpCalcul() {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);

		System.out.println("Veuillez saisir les deux opérandes");
		System.out.print("1er opérande: ");
		double nb1 = scanner.nextDouble();
		System.out.print("2eme opérande (autre que 0 pour la division: ");
		double nb2 = scanner.nextDouble();
		System.out.println(
				"Veuillez choisir dans la liste sivante l'opérateur voulu:\n" + "+/add\t-/sous\t*/mult\t/ div");
		String operator = scanner2.nextLine();
		double result = calcul(nb1, nb2, operator);
		System.out.println("le résultat de l'opération : " + nb1 + operator + nb2 + "=" + result);

	}

	static double calcul(double nb1, double nb2, String operator) {
		double result = 0;
		switch (operator) {
			case "+":
			case "add":
				result = add(nb1, nb2);
				break;
			case "-":
			case "sous":
				result = substract(nb1, nb2);
				break;
			case "*":
			case "mult":
				result = multiplication(nb1, nb2);
				break;
			case "/":
			case "div":
				result = division(nb1, nb2);
				break;
			default:
				break;

		}
		return result;

	}

	static double add(double nb1, double nb2) {
		return nb1 + nb2;
	}

	static double substract(double nb1, double nb2) {
		return nb1 - nb2;
	}

	static double multiplication(double nb1, double nb2) {
		return nb1 * nb2;
	}

	static double division(double nb1, double nb2) {
		return nb1 / nb2;
	}

}
