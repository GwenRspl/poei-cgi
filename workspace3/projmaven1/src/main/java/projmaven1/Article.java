package projmaven1;

public class Article {
	private String marque;
	private int prix;
	private String code;

	public Article(String marque, int prix, String code) {
		this.marque = marque;
		this.prix = prix;
		this.code = code;
	}

	@Override
	public String toString() {
		return "Article [marque=" + marque + ", prix=" + prix + ", code=" + code + "]";
	}

}
