package projetSingleton;

public class Test {

	public static void main(String[] args) {
		test1();
	}

	private static void test1() {
		Personne p1 = Personne.getInstance();
		Personne p2 = Personne.getInstance();
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p2.equals(p1));
	}

}
