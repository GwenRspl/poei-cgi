package user;

import model.Rib;
import model.Salarie;

public class Test {

	public static void main(String[] args) {
		test1();

	}

	static void test1() {
		Rib rib = new Rib("CIC", "478456123456789");
		Salarie s = new Salarie(1, "Jones", "Indiana", rib, 8);
		System.out.println(s);
	}

}
