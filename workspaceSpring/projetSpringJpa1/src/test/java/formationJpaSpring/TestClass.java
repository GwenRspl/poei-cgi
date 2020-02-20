package formationJpaSpring;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import formationJpaSpring.dao.PersonneDaoHib;
import formationJpaSpring.entity.Personne;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testCreate();
		// testFindAll();
	}

	public static void testFindAll() {
		ClassPathXmlApplicationContext ctX = new ClassPathXmlApplicationContext("./applicationContext.xml");
		PersonneDaoHib hib = ctX.getBean(PersonneDaoHib.class);

		List<Personne> lp = hib.findAll();

		System.out.println(lp);

	}

	public static void testCreate() {
		ClassPathXmlApplicationContext ctX = new ClassPathXmlApplicationContext("./applicationContext.xml");
		PersonneDaoHib hib = ctX.getBean(PersonneDaoHib.class);

		Personne p = new Personne();
		p.setId(123);
		p.setNom("Titi");
		p.setPrenom("Tintin");

		hib.create(p);

	}
}
