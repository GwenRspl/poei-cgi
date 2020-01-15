package model;

public class InfoVoiture {

	private String matricule;
	private String marque;

	public InfoVoiture(String matricule, String marque) {
		this.matricule = matricule;
		this.marque = marque;
	}

	public String getMarque() {
		return marque;
	}

	public String getMatricule() {
		return matricule;
	}

	@Override
	public String toString() {
		return "[matricule=" + matricule + ", marque=" + marque + "]";
	}

}
