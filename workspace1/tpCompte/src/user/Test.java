package user;

import model.CB;
import model.CompteCB;
import model.CompteSimple;
import model.CompteVIP;

public class Test {

	public static void main(String[] args) {
		test1();

	}

	private static void test1() {
		CompteCB cb = new CompteCB("Capitaine Haddock", CB.AMEX);
		System.out.println(cb);

		CompteSimple simple = new CompteSimple("Professeur Tournesol");
		simple.crediter(101);

		System.out.println(cb);
		System.out.println(simple);

		simple.virement(100, cb);

		System.out.println(cb);
		System.out.println(simple);

		CompteVIP vip = new CompteVIP("Tintin Etmilou");
		vip.debiter(500);
		System.out.println(vip);
		vip.virement(100, simple);
		System.out.println(vip);
		System.out.println(simple);

	}

}
