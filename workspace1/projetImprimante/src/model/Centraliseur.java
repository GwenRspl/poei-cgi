package model;

public class Centraliseur {

	private static Centraliseur instance;
	private Imprimante[] tab = { new Imprimante("IP1"), new Imprimante("IP2") };
	private boolean switchImp;

	private Centraliseur() {
	}

	public static Centraliseur getInstance() {
		if (instance == null) {
			instance = new Centraliseur();
		}
		return instance;
	}

	public void print(String str) {
		if (switchImp)
			tab[1].print(str);
		else
			tab[0].print(str);

		switchImp = !switchImp;

	}

}
