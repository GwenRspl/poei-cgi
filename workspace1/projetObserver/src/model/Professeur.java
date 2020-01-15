package model;

import java.util.Arrays;

public class Professeur {

	private int note;
	private String nom;
	private Eleve[] tab = new Eleve[10];

	public Professeur(String nom) {
		this.nom = nom;
	}

	public void attach(Eleve e) {
		for (int i = 0; i < tab.length; i++) {
			if (this.tab[i] == null) {
				tab[i] = e;
				break;
			}
		}
	}

	public void notifAll() {
		for (Eleve eleve : tab) {
			if (eleve != null)
				eleve.notif();
		}
	}

	public void setNote(int note) {
		this.note = note;
		this.notifAll();
	}

	public int getNote() {
		return note;
	}

	@Override
	public String toString() {
		return "Professeur [note=" + note + ", nom=" + nom + ", tab=" + Arrays.toString(tab) + "]";
	}

}
