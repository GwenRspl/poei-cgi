package formationSpring.beans;

import org.springframework.stereotype.Component;

@Component("yolo")
public class HelloWorld implements IHelloWorld {

	@Override
	public String getHello() {
		return "hello u";
	}

	public String getBonjour() {
		return "bonjour u";
	}
}
