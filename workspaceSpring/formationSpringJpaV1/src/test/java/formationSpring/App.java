package formationSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import formationSpring.beans.IHelloWorld;

public class App {

	public static void main(String[] args) {
		testHello();
	}

	static void testHello() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		// traitements
		IHelloWorld x = (IHelloWorld) ctx.getBean("yolo");

		System.out.println(x.getHello());
		ctx.close();
	}

}
