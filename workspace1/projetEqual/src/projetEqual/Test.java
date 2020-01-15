package projetEqual;

public class Test {

	public static void main(String[] args) {
		test2();

	}

	private static void test2() {
		Personne p1 = new Personne("Haddock", "Capitaine", 40);
		Personne p2 = new Personne("Tournesol", "Professeur", 65);
		Personne p3 = p1;
		Personne p4 = new Personne("Haddock", "Capitaine", 40);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		System.out.println(p4.hashCode());

	}

	private static void test1() {
		Personne p1 = new Personne("Haddock", "Capitaine", 40);
		Personne p2 = p1;
		Personne p3 = new Personne("Haddock", "Capitaine", 40);

		System.out.println(p1.equals(p2) ? "ok" : "ko");
		System.out.println(p1.equals(p3) ? "ok" : "ko");
		System.out.println(p3.equals(p2) ? "ok" : "ko");

	}

}
