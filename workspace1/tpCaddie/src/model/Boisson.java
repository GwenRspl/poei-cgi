package model;

public class Boisson extends Article {

	private EBoisson boisson;

	public Boisson(String nom, int prix, EBoisson boisson) {
		super(nom, prix);
		this.boisson = boisson;
	}

	@Override
	public String toString() {
		return super.toString() + boisson.name() + " " + boisson.getVolume() + "L";
	}

}
