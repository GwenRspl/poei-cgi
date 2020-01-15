package projetPersonnev1;

public class Personne {

	int ageMajeur = 18;
	String nom;
	String prenom;
	int age;
	String status;

	public Personne() {
	}

	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	String getInfo() {
		String result = "NOM: " + this.nom;
		result += " | PRENOM: " + this.prenom;
		result += " | AGE: " + this.age;
		result += " | STATUS: ";
		result += (this.age < this.ageMajeur) ? "MINEUR" : "MAJEUR";
		return result;
	}

}
