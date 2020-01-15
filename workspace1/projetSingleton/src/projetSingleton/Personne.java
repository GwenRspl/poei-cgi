package projetSingleton;

public class Personne {

	private String name = "Dupond";

	private static Personne instance;
	// private static Personne instance = new Personne();
	// >> chargé au démarrage de l'application

	private Personne() {
	}

	public static Personne getInstance() {
		if (instance == null) {
			instance = new Personne();
		}
		return instance;
	}

	@Override
	public String toString() {
		return "Personne [name=" + name + "]";
	}

}
