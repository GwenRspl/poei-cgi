package user;

import model.Personne;

public class Test {

	public static void main(String[] args) {
		test1();
	}

	static void test1() {
		System.out.println(new Personne("Haddock", "Capitaine", 40));
	}
}
