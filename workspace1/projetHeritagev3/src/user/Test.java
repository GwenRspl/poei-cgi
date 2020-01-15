package user;

import model.A;
import model.B;

public class Test {

	public static void main(String[] args) {
		test1();
	}

	private static void test1() {
		A a = new A();

		B b1 = new B();
		A b2 = new B();

		b1.m1();
		b1.m2();

		b2.m1();

	}

}
