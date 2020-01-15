package user;

import model.InfoProprio;
import model.Parking;
import model.Voiture;

public class Test {

	public static void main(String[] args) {
		test1();

	}

	private static void test1() {
		Parking p = new Parking("Trust", 10);
		InfoProprio info1 = new InfoProprio("Haddock", "Capitaine");
		Voiture v1 = new Voiture(info1, "123L456", "Toyota");
		InfoProprio info2 = new InfoProprio("Tournesol", "Professeur");
		Voiture v2 = new Voiture(info2, "123M456", "Mercedes");
		InfoProprio info3 = new InfoProprio("Etmilou", "Tintin");
		Voiture v3 = new Voiture(info3, "789R123", "Toyota");

		v1.setVitesse(50);
		v2.setVitesse(130);
		v2.setVitesse(190);
		v3.setVitesse(200);
		v3.setVitesse(50);
		v3.setVitesse(180);

		p.rajouter(v1);
		p.rajouter(v2);
		p.rajouter(v3);
		System.out.println(p);
		System.out.println(p.getCount());
		System.out.println(p.getCountByMarque("Toyota"));
		
		p.quitter("789R123");
		System.out.println(p);
		System.out.println(p.getCount());
		System.out.println(p.getCountByMarque("Toyota"));

	}

}
