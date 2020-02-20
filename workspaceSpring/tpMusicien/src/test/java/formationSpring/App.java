package formationSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import formationSpring.beans.Guitariste;
import formationSpring.beans.Musicien;

public class App {

	public static void main(String[] args) {
		testGuitariste();
	}

	static void testGuitariste() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		Musicien musicien = ctx.getBean("guitariste", Musicien.class);
		musicien.performer();

		Guitariste guitariste = ctx.getBean("guitariste", Guitariste.class);
		guitariste.performer();
	}

}
