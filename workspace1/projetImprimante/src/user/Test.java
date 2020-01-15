package user;

import model.Poste;

public class Test {

	public static void main(String[] args) {
		test1();

	}

	private static void test1() {
		Poste p1 = new Poste("Poste1");
		Poste p2 = new Poste("Poste2");
		Poste p3 = new Poste("Poste3");

		p1.print("hello");
		p2.print("hello n°2");
		p3.print("hello n°3");

	}

}
