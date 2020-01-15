package model;

public enum EBateau {
	PETIT(2),
	MOYEN(10),
	GRAND(50);

	private int taille;

	private EBateau(int taille) {
		this.taille = taille;
	}

	public int getTaille() {
		return taille;
	}

}
