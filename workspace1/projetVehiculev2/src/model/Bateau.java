package model;

public class Bateau extends Vehicule {

	private EBateau eBateau;

	public Bateau(String marque, int prix, EBateau eBateau) {
		super(marque, prix);
		this.eBateau = eBateau;
	}

	@Override
	public String avancer() {
		return "Je flotte";
	}

	@Override
	public String demarrer() {
		return "bateau démarré";
	}

	@Override
	public String toString() {
		return super.toString() + "[taille=" + eBateau.getTaille() + "places]";
	}

}
