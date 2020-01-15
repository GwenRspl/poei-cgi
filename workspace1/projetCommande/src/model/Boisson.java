package model;

public enum Boisson {
	coca(2),
	eau(1),
	sans;

	private int prix;

	private Boisson() {
	}

	private Boisson(int prix) {
		this.prix = prix;
	}

	public int getPrix() {
		return prix;
	}

	public String toString() {
		return "" + name() + " (" + prix + " €)";
	}

}
