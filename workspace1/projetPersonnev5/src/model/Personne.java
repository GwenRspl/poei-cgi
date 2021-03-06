package model;

public class Personne {
	private String nom;
	private String prenom;
	private Adresse adresse;

	public Personne(String nom, String prenom, Adresse adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	@Override
	public String toString() {
		String response = "Personne [nom=" + nom + ", prenom=" + prenom;
		response += (adresse != null) ? "\nadresse=" + adresse : "";
		response += "]";
		return response;
	}

}
