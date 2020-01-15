package model;


public class Parking {

	private String nom;
	private Voiture[] voitures;

	public Parking(String nom, int taille) {
		this.nom = nom;
		this.voitures = new Voiture[taille];
	}

	public boolean rajouter(Voiture voiture) {
		boolean result = false;
		for (int i = 0; i < voitures.length; i++) {
			if (voitures[i] == null) {
				voiture.setVitesse(0);
				voitures[i] = voiture;
				result = true;
				break;
			}
		}
		return result;
	}

	public boolean quitter(String matricule) {
		boolean result = false;
		for (int i = 0; i < voitures.length; i++) {
			if (voitures[i] != null && voitures[i]	.getInfoVoiture()
													.getMatricule()
													.equalsIgnoreCase(matricule)) {
				voitures[i] = null;
				result = true;
				break;
			}
		}
		return result;
	}

	public int getCount() {
		int count = 0;
		for (Voiture voiture : voitures) {
			if (voiture != null)
				count++;
		}
		return count;
	}

	public int getCountByMarque(String marque) {
		int count = 0;
		for (Voiture voiture : voitures) {
			if (voiture != null && voiture	.getInfoVoiture()
											.getMarque()
											.equalsIgnoreCase(marque))
				count++;
		}
		return count;
	}

	@Override
	public String toString() {
		String res = "Parking " + nom.toUpperCase() + "\n";
		for (Voiture voiture : voitures) {
			if (voiture != null)
				res += voiture + "\n";
		}
		return res;
	}

}
