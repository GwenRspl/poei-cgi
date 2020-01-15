package model;

public class Ville {

	private String nom;
	private String capitale;
	private double nbHabitant;
	private String pays;

	private boolean isCapital;
	private String categorie;

	private final String regle = "0-1-petit;1-3-moyen;3-10-grand";
	private final int minNbIndex = 0;
	private final int maxNbIndex = 1;
	private final int categorieIndex = 2;

	public Ville(String nom, String capitale, double nbHabitant, String pays) {
		this.nom = nom;
		this.capitale = capitale;
		this.pays = pays;
		this.setNbHabitant(nbHabitant);
		this.computeIsCapitale();
	}

	public void setNbHabitant(double nbHabitant) {
		if (nbHabitant > 0 && nbHabitant <= 10)
			this.nbHabitant = nbHabitant;
		this.findCat();
	}

	private void findCat() {
		String[] splitTab = regle.split(";");
		for (String string : splitTab) {
			String[] tempTab = string.split("-");
			if (Double.parseDouble(tempTab[1]) >= nbHabitant) {
				categorie = tempTab[2];
				break;
			}
			
		}
	}
	
//	private void computeCategorie() {
//		String[][] rules = this.formatRules();
//		for (String[] rule : rules) {
//			if (nbHabitant > Double.parseDouble(rule[minNbIndex])
//					&& nbHabitant <= Double.parseDouble(rule[maxNbIndex])) {
//				this.categorie = rule[categorieIndex];
//			}
//		}
//	}
//
//
//	private String[][] formatRules() {
//		String[] splitTab = regle.split(";");
//		String[][] resultTab = new String[3][3];
//		for (int i = 0; i < splitTab.length; i++) {
//			String[] tempTab = splitTab[i].split("-");
//			resultTab[i] = tempTab;
//		}
//		return resultTab;
//	}

	private void computeIsCapitale() {
		this.isCapital = this.nom.equalsIgnoreCase(this.capitale);
	}

	@Override
	public String toString() {
		String result = "nom: " + nom + ", capitale: " + capitale + ", nbHabitant: " + nbHabitant + "millions, pays: "
				+ pays + ", ";
		result += isCapital ? "est la capitale" : "n'est pas la capitale";
		result += ", categorie: " + categorie;
		return result;
	}

}