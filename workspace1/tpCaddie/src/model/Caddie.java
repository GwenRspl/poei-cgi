package model;

import java.util.ArrayList;

public class Caddie {
	private String client;
	private ArrayList<Ligne> lignes = new ArrayList<>();

	public Caddie(String client) {
		this.client = client;
	}

	public void ajouter(Ligne ligne) {
		this.lignes.add(ligne);
	}

	public int getTotal() {
		int result = 0;
		for (Ligne ligne : lignes) {
			result += ligne	.getArticle()
							.getPrix()
					* ligne.getQuantite();
		}
		return result;
	}

	@Override
	public String toString() {
		String result = "Client: " + client + "\n";
		for (Ligne ligne : lignes) {
			result += ligne + "\n";
		}
		result += "Total: " + getTotal() + "€";
		return result;
	}

}
