package model;

public enum Dessert {
	fruit(3),
	gateau(4),
	sans;

	private int prix;

	private Dessert() {
	}

	private Dessert(int prix) {
		this.prix = prix;
	}

	public int getPrix() {
		return prix;
	}

	public String toString() {
		return "" + name() + " (" + prix + " €)";
	}

}
