package model;

public class Personne {
	private String nom;
	private String prenom;
	private Adresse adresse;

	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getNom() {
		return nom;
	}

	@Override
	public String toString() {
		String response = "Personne [nom=" + nom + ", prenom=" + prenom;
		response += "]";
		return response;
	}

}
