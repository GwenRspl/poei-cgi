package tpSoapDaoServer;

import java.util.List;
import java.util.Scanner;

import javax.xml.ws.Endpoint;

public class Start {

	public static void main(String[] args) {
		servicePersonne();

	}

	static void servicePersonne() {
		String url = "http://127.0.0.1:8586/";
		Endpoint en = Endpoint.publish(url, new PersonneService());
		System.out.println(url);
		Scanner sc = new Scanner(System.in);
		List<Personne> p = new PersonneService().find();
		System.out.println(p);
		sc.nextLine();
		en.stop();
	}

}
