package tpCalculException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// tpConversion();
		tpCalcul();
	}

	private static void tpConversion() {
		try {
			System.out.println(Traitement.increment("10b"));
		} catch (ConversionException e) {
			System.out.println(e);
		}

	}

	static void tpCalcul() {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);

		System.out.println("Veuillez saisir les deux opérandes");
		System.out.print("1er opérande: ");
		try {
			double nb1 = scanner.nextDouble();
			System.out.print("2eme opérande (autre que 0 pour la division): ");
			double nb2 = scanner.nextDouble();
			System.out.println(
					"Veuillez choisir dans la liste suivante l'opérateur voulu:\n" + "+/add\t-/sous\t*/mult\t/ div");
			String operator = scanner2.nextLine();

			double result = Traitement.calcul(nb1, nb2, operator);
			System.out.println("le résultat de l'opération : " + nb1 + operator + nb2 + "=" + result);
		} catch (NegatifException e) {
			System.out.println(e);
		} catch (OperateurException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (InputMismatchException e) {
			System.out.println(e);
		}

	}

}
