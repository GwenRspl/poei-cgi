package projetGeneric;

public class Test {

	public static void main(String[] args) {
		test4();

	}

	private static void test4() {
		Traitement<Personne> traitement = new Traitement<>();
		Personne p = new Personne("Haddock", "Capitaine");
		traitement.setA(p);
		Personne p2 = traitement.getA();

		Traitement<Integer> t = new Traitement<>();
		t.setA(10);
		int a = t.getA();

	}

	private static void test3() {
		Traitement t = new Traitement();
		Personne p = new Personne("Haddock", "Capitaine");
		t.setA(p);
		System.out.println(t.getA());
		Personne p2 = (Personne) t.getA();
		System.out.println(p2.getNom());

	}

	private static void test2() {
		Traitement t1 = new Traitement();
		t1.setA(10);
		System.out.println(t1.getA());

		t1.setA("Blabla");
		System.out.println(t1.getA());

		Personne p = new Personne("Haddock", "Capitaine");
		t1.setA(p);
		System.out.println(t1.getA());

	}

	private static void test1() {
		Traitement t1 = new Traitement();
		t1.setA(10);
		System.out.println(t1.getA());

		Traitement t2 = new Traitement();
		t2.setA("Blabla");
		System.out.println(t2.getA());

		Personne p = new Personne("Haddock", "Capitaine");
		Traitement t3 = new Traitement();
		t3.setA(p);
		System.out.println(t3.getA());

	}

}
