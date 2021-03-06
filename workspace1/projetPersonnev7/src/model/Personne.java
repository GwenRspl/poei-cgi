package model;

public class Personne {

	private int id;
	private String nom;
	private String prenom;
	private int age;

	public Personne(int id, String nom, String prenom, int age) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}

}
