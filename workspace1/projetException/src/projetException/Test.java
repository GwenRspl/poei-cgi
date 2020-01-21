package projetException;

public class Test {

	public static void main(String[] args) {
		test2();

	}

	private static void test2() {
		int a = 10;
		int b = 0;
		int c = a / b;
		System.out.println(c);

	}

	private static void test1() {
		System.out.println("avant");
		String str = "2a";
		int a = Integer.parseInt(str);
		System.out.println(a);
		System.out.println("après");

	}

}
