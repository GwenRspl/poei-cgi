package model;

public class Personne {
	private String nom;
	private String prenom;
	private Adresse adresse;
	private Info info;

	public Personne(String nom, String prenom, Adresse adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne(String nom, String prenom, Adresse adresse, int poids, double taille) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.info = new Info(poids, taille);
	}

	public Personne(String nom, String prenom, int poids, double taille) {
		this.nom = nom;
		this.prenom = prenom;
		this.info =  new Info(poids, taille);
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public Info getInfo() {
		return info;
	}

	@Override
	public String toString() {
		String response = "Personne [nom=" + nom + ", prenom=" + prenom;
		response += (adresse != null) ? "\nadresse=" + adresse : "";
		response += (info != null) ? "\ninfo=" + info : "";
		response += "]";
		return response;
	}

}
