package formationSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import formationSpring.beans.Calcul;

public class App {

	public static void main(String[] args) {
		test();
	}

	static void test() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		ctx	.getBean("calcul", Calcul.class)
			.add(10, 15);

		ctx.close();

	}

}
