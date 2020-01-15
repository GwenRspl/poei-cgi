package model;

public class Vehicule {

	private String marque;
	private int prix;

	public Vehicule(String marque, int prix) {
		this.marque = marque;
		this.prix = prix;
	}

	public String avancer() {
		return "Je roule";
	}

	@Override
	public String toString() {
		return "[marque=" + marque + ", prix=" + prix + "]";
	}

}
