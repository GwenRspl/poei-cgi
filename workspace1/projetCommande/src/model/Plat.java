package model;

public enum Plat {
	platDuJour(5),
	salade(3),
	riz(1);

	private int prix;

	private Plat(int prix) {
		this.prix = prix;
	}

	public int getPrix() {
		return prix;
	}

	public String toString() {
		return "" + name() + " (" + prix + " €)";
	}

}
