package user;

import model.Ville;

public class Test {

	public static void main(String[] args) {
		test();
	}

	static void test() {
		Ville v = new Ville("Lyon", "Paris", 1.5, "France");
		System.out.println(v);
		v.setNbHabitant(0.5);
		System.out.println(v);
		System.out.println(new Ville("Paris", "Paris", 8.5, "France"));
	}
}
