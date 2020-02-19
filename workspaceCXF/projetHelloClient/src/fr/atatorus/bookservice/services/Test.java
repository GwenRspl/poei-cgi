package fr.atatorus.bookservice.services;

public class Test {

	public static void main(String[] args) {
		Hello hello = new HelloService().getHelloPort();
		System.out.println(hello.hello("tintin"));

	}

}
