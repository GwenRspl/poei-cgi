package model;

public class Personne {

	private String nom;
	private String prenom;
	private int age;
	private String status = "mineur";

	public Personne(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.setStatus();
	}

	private void setStatus() {
		if (this.age > 18)
			this.status = "majeur";
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public int getAge() {
		return age;
	}

	public String getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", status=" + status + "]";
	}

}
