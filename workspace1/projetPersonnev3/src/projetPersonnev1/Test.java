package projetPersonnev1;

public class Test {

	public static void main(String[] args) {
		test4();

	}

	static void test1() {
		Personne p = new Personne("Dupont", "Jean", 10);
		System.out.println(p.toString());
		System.out.println(p);
	}

	static void test2() {
		Personne p = new Personne("Dupont", "Jean");
		System.out.println(p);
		p.setAge(-10);
		System.out.println(p);
		p.setAge(10);
		System.out.println(p);
		p.setAge(120);
		System.out.println(p);
		p.setAge(8);
		System.out.println(p);
		p.setAge(11);
		System.out.println(p);
	}

	static void test3() {
		Personne p = new Personne("Dupont", "Jean");
		p.setAge(10);
		System.out.println(p.getAge());
	}

	static void test4() {
		Personne p = new Personne("Dupont", "Jean");
		p.setNom("Tournesol");
		System.out.println(p.getNom());
		p.setNom("");
		System.out.println(p.getNom());
		System.out.println(p);
	}

}
