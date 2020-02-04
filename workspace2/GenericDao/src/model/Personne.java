package model;

public class Personne {

	private int id;
	private String nom;
	private String prenom;

	public Personne(int id, String nom, String prenom) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	@Override
	public String toString() {
		return "\nid=" + id + ", nom=" + nom + ", prenom=" + prenom;
	}

}
