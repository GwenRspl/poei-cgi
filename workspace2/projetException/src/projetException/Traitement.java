package projetException;

public class Traitement {
	public static int div(int a, int b) {
		if (b == 0)
			throw new ArithmeticException("/ by zero dans div");
		return a / b;
	}

	public static int div2(int a, int b) throws Exception {
		if (b == 0)
			throw new Exception("/ by zero dans div2");
		return a / b;
	}

	public static int mult(int a, int b) throws MultException {
		String message = "pb ds mult avec un 0";
		if (a == 0)
			throw new MultException(message, "a");
		else if (b == 0)
			throw new MultException(message, "b");
		return a * b;
	}

}
