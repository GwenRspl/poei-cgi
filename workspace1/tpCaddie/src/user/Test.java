package user;

import model.Boisson;
import model.Caddie;
import model.EBoisson;
import model.EGateau;
import model.Gateau;
import model.Ligne;

public class Test {

	public static void main(String[] args) {
		test1();

	}

	private static void test1() {
		Boisson b = new Boisson("Coca", 2, EBoisson.petit);
		Gateau g = new Gateau("Oreo", EGateau.vanille);
		Ligne l1 = new Ligne(2, b);
		Ligne l2 = new Ligne(3, g);
		Caddie caddie = new Caddie("Capitaine Haddock");
		caddie.ajouter(l1);
		caddie.ajouter(l2);
		System.out.println(caddie);

	}

}
