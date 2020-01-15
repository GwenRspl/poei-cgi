package projetEnum;

public enum Formation {
	JAVA(500, "Paris"),
	PYTHON(300, "Marseille"),
	CPP(100),
	HTML,
	CSHARP(5);

	private int prix;
	private String lieu = "NA";

	private Formation() {
	}

	private Formation(int prix) {
		this.prix = prix;
	}

	private Formation(int prix, String lieu) {
		this.prix = prix;
		this.lieu = lieu;
	}

	public int getPrix() {
		return prix;
	}

	public String getLieu() {
		return lieu;
	}

	public String toString() {
		return "nom: " + name() + ", lieu: " + lieu + ", prix: " + prix;
	}
}
