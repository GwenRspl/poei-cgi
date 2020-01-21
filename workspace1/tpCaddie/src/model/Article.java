package model;

public abstract class Article {
	private String nom;
	protected int prix;

	public int getPrix() {
		return prix;
	}

	public Article(String nom, int prix) {
		this.nom = nom;
		this.prix = prix;
	}

	@Override
	public String toString() {
		return nom + " (" + prix + "€) ";
	}

}
