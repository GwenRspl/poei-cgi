package model;

public class Info {

	private int poids;
	private double taille;

	public Info(int poids, double taille) {
		this.poids = poids;
		this.taille = taille;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public double getTaille() {
		return taille;
	}

	@Override
	public String toString() {
		return "Info [poids=" + poids + "kg, taille=" + taille + "m]";
	}

}
