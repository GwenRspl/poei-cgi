package fr.atatorus.bookservice.services;

public class TestClient {

	public static void main(String[] args) {
		testAdd();
		testMult();
		testSous();
		testDiv();

	}

	public static void testAdd() {
		Calc calc = new CalcService().getCalcPort();
		System.out.println(calc.add(5, 10));
	}

	public static void testMult() {
		Calc calc = new CalcService().getCalcPort();
		System.out.println(calc.mult(5, 10));
	}

	public static void testSous() {
		Calc calc = new CalcService().getCalcPort();
		System.out.println(calc.sous(5, 10));
	}

	public static void testDiv() {
		Calc calc = new CalcService().getCalcPort();
		System.out.println(calc.div(5, 10));
	}

}
