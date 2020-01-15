package user;

import model.A;
import model.B;

public class Test {

	public static void main(String[] args) {
		test5();
	}

	private static void test5() {
		A a = new A();
		System.out.println(a.toString());

	}

	private static void test4() {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		a.m();
		b.m();
		c.m();
		d.m();

	}

	private static void test2() {
		B b = new B();
		b.m1();
		b.m2();

	}

	private static void test1() {
		A a = new A();
		a.m1();
		B b = new B();
		b.m2();

	}

}
