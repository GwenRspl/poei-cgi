package formationSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import formationSpring.beans.Personne;

public class App {

	public static void main(String[] args) {
		testPersonne();
	}

	static void testPersonne() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		// traitements

		// Adresse adresse = (Adresse) ctx.getBean("adresse");
		Personne personne = (Personne) ctx.getBean("personne");
		Personne personne2 = ctx.getBean("personne", Personne.class);

		System.out.println(personne);
		System.out.println(personne2);

		// JavaCollection col = (JavaCollection) ctx.getBean("javaCollection");
		// System.out.println(col.getAdressList());
		// System.out.println(col.getAdressMap());
		ctx.close();
	}

}
