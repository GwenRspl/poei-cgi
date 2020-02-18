package prjRESTClient;

import java.util.ArrayList;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class Test {

	public static void main(String[] args) {
		// testHello();
		// testCalc();
		// testCalcInfo();
		// testCalcAdd();
		// testCalcDiv();
		// testCalcSous();
		// testCalcMult();
		// testHelloPath();
		// testCalcAdd2();
		testHelloList();

	}

	private static void testHello() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/projetRESTSERVERHello/Hello/hello");
		String m = target	.request(MediaType.APPLICATION_JSON)
							.get(String.class);
		System.out.println("response : " + m);

	}

	private static void testCalc() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/projetRESTSERVERCalculatrice/calc/test");
		String m = target	.request(MediaType.APPLICATION_JSON)
							.get(String.class);
		System.out.println("response : " + m);
	}

	private static void testCalcInfo() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/projetRESTSERVERCalculatrice/calc/info");
		CalcInfo m = target	.request(MediaType.APPLICATION_JSON)
							.get(CalcInfo.class);
		System.out.println("response : " + m);
	}

	private static void testCalcAdd() {
		CalcInfo info = new CalcInfo(10, 12);
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/projetRESTSERVERCalculatrice/calc/add");
		Response m = target	.request(MediaType.APPLICATION_JSON)
							.post(Entity.entity(info, MediaType.APPLICATION_JSON));
		System.out.println("add : " + m.readEntity(Double.class));
	}

	private static void testCalcAdd2() {
		CalcInfo info = new CalcInfo(10, 12);
		Client client = ClientBuilder.newClient();
		WebTarget target = client	.target("http://localhost:8080/projetRESTSERVERCalculatrice/calc/add2")
									.path("15")
									.path("10");
		Double m = target	.request(MediaType.APPLICATION_JSON)
							.get(Double.class);
		System.out.println("add : " + m);
	}

	private static void testCalcMult() {
		CalcInfo info = new CalcInfo(10, 12);
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/projetRESTSERVERCalculatrice/calc/mult");
		Response m = target	.request(MediaType.APPLICATION_JSON)
							.post(Entity.entity(info, MediaType.APPLICATION_JSON));
		System.out.println("mult : " + m.readEntity(Double.class));
	}

	private static void testCalcDiv() {
		CalcInfo info = new CalcInfo(10, 12);
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/projetRESTSERVERCalculatrice/calc/div");
		Response m = target	.request(MediaType.APPLICATION_JSON)
							.post(Entity.entity(info, MediaType.APPLICATION_JSON));
		System.out.println("div : " + m.readEntity(Double.class));
	}

	private static void testCalcSous() {
		CalcInfo info = new CalcInfo(10, 12);
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/projetRESTSERVERCalculatrice/calc/sous");
		Response m = target	.request(MediaType.APPLICATION_JSON)
							.post(Entity.entity(info, MediaType.APPLICATION_JSON));
		System.out.println("sous : " + m.readEntity(Double.class));
	}

	private static void testHelloPath() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client	.target("http://localhost:8080/projetRESTSERVERHello/Hello/hello2")
									.path("tintin");
		String m = target	.request(MediaType.APPLICATION_JSON)
							.get(String.class);
		System.out.println("response : " + m);
	}

	private static void testHelloList() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/projetRESTSERVERHello/Hello/list");
		ArrayList<String> m = (ArrayList<String>) target.request(MediaType.APPLICATION_JSON)
														.get(ArrayList.class);

		System.out.println("response : " + m);
	}

}
