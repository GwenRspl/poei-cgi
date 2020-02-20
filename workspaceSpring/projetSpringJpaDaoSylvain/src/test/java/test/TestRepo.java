package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import repository.PersonneRepository;

public class TestRepo {

	public static void main(String[] args) {
		testFindAll();

	}

	static void testFindAll() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		PersonneRepository repository = ctx.getBean(PersonneRepository.class);
		System.out.println(repository.findAll());
	}

}
