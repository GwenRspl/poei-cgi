package projetInterface;

public class Test {

	public static void main(String[] args) {
		test2();

	}

	private static void test2() {
		I1 a1 = new A();
		a1.m1();
		A mA = (A) a1;
		mA.mA();
		I2 a2 = new A();

	}

	private static void test1() {
		A a1 = new A();
		a1.m1();
		a1.mA();

		I1 a2 = a1;
		a2.m1();

		I2 a3 = a1;
		a3.m2();
	}

}
