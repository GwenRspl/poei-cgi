package model;

public class Voiture extends Vehicule {
	private boolean gps;

	public Voiture(String marque, int prix) {
		super(marque, prix);
	}

	public void gpsOnOff() {
		this.gps = !this.gps;
	}

	@Override
	public String demarrer() {
		return "voiture d�marr�e";
	}

	@Override
	public String toString() {
		return super.toString() + "[gps=" + (gps ? "activ�" : "d�sactiv�") + "]";
	}

}
