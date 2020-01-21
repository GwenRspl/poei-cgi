package model;

public enum EGateau {
	choco(1),
	vanille(2);

	private int prix;

	private EGateau(int prix) {
		this.prix = prix;
	}

	public int getPrix() {
		return prix;
	}

}
