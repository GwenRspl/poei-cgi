package model;

public class Commande {
	private String client;
	private Boisson boisson;
	private Plat plat;
	private Dessert dessert;

	public Commande(String client, Boisson boisson, Plat plat, Dessert dessert) {
		this.client = client;
		this.boisson = boisson;
		this.plat = plat;
		this.dessert = dessert;
	}

	public int getPrixTotal() {
		return this.boisson.getPrix() + this.plat.getPrix() + this.dessert.getPrix();
	}

	@Override
	public String toString() {
		return "Commande au nom de " + client + "\nboisson: " + boisson + "\nplat: " + plat + "\ndessert: " + dessert
				+ "\nPrix total: " + this.getPrixTotal() + "€";
	}

}
