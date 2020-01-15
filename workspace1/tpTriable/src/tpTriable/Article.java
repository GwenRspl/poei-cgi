package tpTriable;

public class Article {

	private String marque;
	private int prix;

	public Article(String marque, int prix) {
		this.marque = marque;
		this.prix = prix;
	}

	public String getMarque() {
		return marque;
	}

	public int getPrix() {
		return prix;
	}

	@Override
	public String toString() {
		return "Article [marque=" + marque + ", prix=" + prix + "]";
	}

}
