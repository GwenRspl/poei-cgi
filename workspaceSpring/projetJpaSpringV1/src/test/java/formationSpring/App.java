package formationSpring;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.PersonneDaoImpl;
import entity.Personne;

public class App {

	public static void main(String[] args) {
		test();
	}

	static void test() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		PersonneDaoImpl hib = ctx.getBean(PersonneDaoImpl.class);

		List<Personne> lp = hib.findAll();

		System.out.println(lp);
	}

}
