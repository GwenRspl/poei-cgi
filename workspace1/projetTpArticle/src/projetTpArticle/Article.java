package projetTpArticle;

public class Article {

	private String marque;
	private int prix;
	private String status;

	private final int pivot = 100;
	private final int minPrice = 0;
	private final String cher = "cher";
	private final String pasCher = "pas cher";

	public Article(String marque) {
		this.marque = marque;
	}

	public Article(String marque, int prix) {
		this.marque = marque;
		this.setPrix(prix);
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		if (prix > minPrice) {
			this.prix = prix;
			computeStatus();
		}
	}

	public String getMarque() {
		return marque;
	}

	public String getStatus() {
		return status;
	}

	private void computeStatus() {
		this.status = this.prix > pivot ? cher : pasCher;
	}

	@Override
	public String toString() {
		String result = "MARQUE: " + this.getMarque();
		result += " | PRIX: " + this.getPrix();
		result += " | STATUS: " + this.getStatus();
		return result;
	}

}
