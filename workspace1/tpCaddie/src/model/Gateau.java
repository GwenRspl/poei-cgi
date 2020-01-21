package model;

public class Gateau extends Article {

	private EGateau gateau;

	public Gateau(String nom, EGateau gateau) {
		super(nom, gateau.getPrix());
		this.gateau = gateau;
	}

	@Override
	public String toString() {
		return super.toString() + gateau.name();
	}

}
