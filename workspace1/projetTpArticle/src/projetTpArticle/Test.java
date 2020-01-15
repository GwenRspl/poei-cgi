package projetTpArticle;

public class Test {

	public static void main(String[] args) {
		test();

	}

	static void test() {
		Article a1 = new Article("Dior");
		a1.setPrix(90);

		Article a2 = new Article("Chanel", 105);
		Article a3 = new Article("Zara", 30);
		a3.setPrix(-50);

		Article[] tab = { a1, a2, a3 };
		for (Article article : tab) {
			System.out.println(article);
		}
	}

}
