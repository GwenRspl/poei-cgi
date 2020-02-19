package tpDaoPersonneRESTClient;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class Test {

	public static void main(String[] args) {
		testSelectAll();
		// testFindById();
		// testCreate();
		// testUpdate();
		// testDelete();

	}

	private static void testSelectAll() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/tpDaoPersonneRESTServer/dao/personnes");
		List<Personne> m = target.request(MediaType.APPLICATION_JSON).get(new GenericType<List<Personne>>() {
		});

		System.out.println(m);
		for (Personne personne : m) {
			System.out.println(personne);
		}

	}

	private static void testFindById() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/tpDaoPersonneRESTServer/dao/personnes").path("4");
		Personne m = target.request(MediaType.APPLICATION_JSON).get(Personne.class);
		System.out.println("response : " + m);

	}

	private static void testCreate() {
		Personne personne = new Personne("Madame", "Personne");
		personne.setId(14);
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/tpDaoPersonneRESTServer/dao/personnes");
		Response m = target.request(MediaType.APPLICATION_JSON)
				.post(Entity.entity(personne, MediaType.APPLICATION_JSON));
		System.out.println("div : " + m);
	}

	private static void testUpdate() {
		Personne personne = new Personne("Madame", "Toutlemonde");
		personne.setId(14);
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/tpDaoPersonneRESTServer/dao/personnes");
		Response m = target.request(MediaType.APPLICATION_JSON)
				.put(Entity.entity(personne, MediaType.APPLICATION_JSON));
		System.out.println("div : " + m);
	}

	private static void testDelete() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/tpDaoPersonneRESTServer/dao/personnes").path("14");
		Response m = target.request(MediaType.APPLICATION_JSON).delete();
		System.out.println("response : " + m);
	}

}
