package projetStatic;

public class Test {

	public static void main(String[] args) {
		test4();

	}

	private static void test1() {
		A.m1();
		A a = new A();
		a.m3();
		new A().m4();
	}

	private static void test2() {
		double res = Traitement.calcul(1, 2, "+");
		System.out.println(res);
	}

	private static void test3() {
		Personne p1 = new Personne("Papa");
		Personne p2 = new Personne("Maman");
		p1.setPrenom("Papi");
		System.out.println(p1);
		System.out.println(p2);
		Personne.setNom("Loup");
		System.out.println(p1);
		System.out.println(p2);
	}

	private static void test4() {
		Personne p1 = new Personne("Papa");
		Personne p2 = new Personne("Maman");
		new Personne("Cousin");
		new Personne("Tata");
		System.out.println(Personne.getCompteur());

	}

}
