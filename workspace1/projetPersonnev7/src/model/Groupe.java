package model;

import java.util.Arrays;

public class Groupe {

	private String nom;
	private Personne[] tab;

	public Groupe(String nom, int taille) {
		this.nom = nom;
		this.tab = new Personne[taille];
	}

	public boolean ajouter(Personne p) {
		boolean result = false;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == null) {
				tab[i] = p;
				result = true;
				break;
			}
		}
		return result;
	}

	public boolean retirer(int id) {
		boolean result = false;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] != null && tab[i].getId() == id) {
				tab[i] = null;
				result = true;
				break;
			}
		}
		return result;
	}

	public int getCount() {
		int count = 0;
		for (Personne p : this.tab) {
			if (p != null)
				count++;
		}
		return count;
	}

	public int getCountByNom(String nom) {
		int count = 0;
		for (Personne p : this.tab) {
			if (p != null && p.getNom().equalsIgnoreCase(nom))
				count++;
		}
		return count;
	}

	@Override
	public String toString() {
		String response = "Groupe " + nom;
		for (Personne p : tab) {
			if (p != null) {
				response += "\n" + p;
			}
		}
		return response;
	}

}
