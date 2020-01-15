package projetPersonnev1;

public class Personne {

	private String nom;
	private String prenom;
	private int age;

	private final int ageMin = 0;
	private final int ageMax = 120;
	// String status;
	// int ageMajeur = 18;

	public Personne() {
	}

	public Personne(String nom, String prenom) {
		this.setNom(nom);
		this.prenom = prenom;
	}

	public Personne(String nom, String prenom, int age) {
		this.setNom(nom);
		this.prenom = prenom;
		this.setAge(age);
	}

	public void setAge(int age) {
		if ((age > ageMin && age < ageMax) && age > this.age)
			this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String getNom() {
		return nom.toUpperCase();
	}

	public void setNom(String nom) {
		if (!nom.isEmpty())
			this.nom = nom;
	}

	public String getPrenom() {
		return prenom.toLowerCase();
	}

	@Override
	public String toString() {
		String result = "NOM: " + this.getNom();
		result += " | PRENOM: " + this.prenom;
		result += " | AGE: " + this.age;
		// result += " | STATUS: ";
		// result += (this.age < this.ageMajeur) ? "MINEUR" : "MAJEUR";
		return result;
	}

}
