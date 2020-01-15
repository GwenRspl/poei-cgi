package projet2;

public class Test {

	public static void main(String[] args) {
		testAffiche();

	}

	static void m1() {
		System.out.println("m1");
	}

	static void hello(String name) {
		System.out.println("hello " + name);
	}

	static void testHello() {
		hello("moto");
		hello("pip");
	}

	static void info(String familyName, String name, int age) {
		String result = "NOM: " + familyName.toUpperCase() + "\t";
		result += "PRENOM: " + name.toLowerCase() + "\t";
		result += "AGE: " + age + "\t";
		result += "STATUT: " + ((age < 18) ? "mineur" : "majeur");
		System.out.println(result);
	}

	static void testInfo() {
		info("Dupont", "Jean", 21);
		info("Martin", "Paul", 9);
	}

	static int add(int a, int b) {
		return a + b;
	}

	static void testAdd() {
		int result = add(10, 15);
		System.out.println(result);
		System.out.println(add(15, 15));
	}

	static void affiche() {
		System.out.println("hello");
	}
	
	static void affiche(String nom) {
		System.out.println("hello " + nom);
	}
	
	static void affiche(String nom, String prenom) {
		System.out.println("hello " + nom + " " + prenom);
	}

	static void testAffiche() {
		affiche();
		affiche("bip");
		affiche("bip","boup");
		
	}
}
