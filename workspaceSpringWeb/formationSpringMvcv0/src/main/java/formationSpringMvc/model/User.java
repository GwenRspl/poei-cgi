package formationSpringMvc.model;

public class User {

	private String nom;
	private String prenom;

	public User(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public User() {
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "User [nom=" + nom + ", prenom=" + prenom + "]";
	}

}
