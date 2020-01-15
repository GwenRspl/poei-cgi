package user;

import model.DeuxD;
import model.TroisD;

public class Test {

	public static void main(String[] args) {
		test2();
	}

	private static void test2() {
		TroisD a = new TroisD(10, 20, 30);
		System.out.println(a);

	}

	private static void test1() {
		DeuxD a = new DeuxD(10, 20);
		System.out.println(a);
	}

}
