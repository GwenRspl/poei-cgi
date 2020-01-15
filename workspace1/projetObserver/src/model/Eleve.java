package model;

public class Eleve {

	private int note;
	private String nom;
	private Professeur professeur;

	public Eleve(String nom) {
		this.nom = nom;
	}

	public void notif() {
		this.note = professeur.getNote();
	}

	public void setProfesseur(Professeur professeur) {
		this.professeur = professeur;
	}

	@Override
	public String toString() {
		return "L'élève " + nom + " a recu a obtenu la note de " + note + ".";
	}

}
