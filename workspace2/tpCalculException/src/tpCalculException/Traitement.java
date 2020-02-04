package tpCalculException;

public class Traitement {

	public static int increment(String str) throws ConversionException {
		int result = 0;
		try {
			result = Integer.parseInt(str);
			result++;
		} catch (Exception e) {
			throw new ConversionException(e.getMessage(), "problème de conversion");
		}
		return result;
	}

	public static double calcul(double nb1, double nb2, String operator) throws NegatifException, OperateurException {
		if (nb1 < 0)
			throw new NegatifException("negative number not supported", "nb1");
		else if (nb2 < 0)
			throw new NegatifException("negative number not supported", "nb2");
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
			if (nb2 == 0)
				throw new ArithmeticException("Division par zero impossible");
			result = division(nb1, nb2);
			break;
		default:
			throw new OperateurException("operateur non supporté", operator);
		}
		return result;

	}

	private static double add(double nb1, double nb2) {
		return nb1 + nb2;
	}

	private static double substract(double nb1, double nb2) {
		return nb1 - nb2;
	}

	private static double multiplication(double nb1, double nb2) {
		return nb1 * nb2;
	}

	private static double division(double nb1, double nb2) {
		return nb1 / nb2;
	}

}
