package model;

public class Ligne {
	private int quantite;
	private Article article;

	public Ligne(int quantite, Article article) {
		this.quantite = quantite;
		this.article = article;
	}

	public int getQuantite() {
		return quantite;
	}

	public Article getArticle() {
		return article;
	}

	@Override
	public String toString() {
		return quantite + " x " + article + " = " + (article.getPrix() * quantite) + "€";
	}

}
