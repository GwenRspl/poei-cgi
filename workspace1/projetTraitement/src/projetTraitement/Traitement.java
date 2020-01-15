package projetTraitement;

public class Traitement {
	
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
