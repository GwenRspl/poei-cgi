package model;

public class Voiture {

	private int vitesse;
	private int flash;
	private InfoVoiture infoVoiture;
	private InfoProprio infoProprio;

	private final int vitesseMin = 0;
	private final int vitesseMax = 300;
	private final int vitesseFlash = 120;

	public Voiture(InfoProprio infoProprio, String matricule, String marque) {
		this.infoProprio = infoProprio;
		this.infoVoiture = new InfoVoiture(matricule, marque);
	}

	public void setVitesse(int vitesse) {
		if (vitesse >= vitesseMin && vitesse <= vitesseMax) {
			if (this.vitesse < this.vitesseFlash && vitesse >= this.vitesseFlash) {
				this.flash++;
			}
			this.vitesse = vitesse;
		}
	}

	public int getFlash() {
		return flash;
	}
	

	public InfoVoiture getInfoVoiture() {
		return infoVoiture;
	}

	@Override
	public String toString() {
		return "Voiture [vitesse=" + vitesse + ", flash=" + flash + ", infoVoiture=" + infoVoiture + ", infoProprio="
				+ infoProprio + "]";
	}

}
