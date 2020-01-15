package model;

public class CompteSimple {
	private String nom = "NA";
	protected int solde;
	private static final int CADEAU = 20;
	private static final int COMMISSION = 1;

	public CompteSimple(String nom) {
		this.nom = nom;
		this.solde += CADEAU;
	}

	public CompteSimple(String nom, int solde) {
		this.nom = nom;
		this.solde = solde + CADEAU;
	}

	public boolean crediter(int s) {
		boolean success = false;
		if (s > 0) {
			solde += (s - COMMISSION);
			success = true;
		}
		return success;
	}

	public boolean debiter(int s) {
		boolean success = false;
		if (s > 0 && (s + COMMISSION) <= this.solde) {
			solde -= (s + COMMISSION);
			success = true;
		}
		return success;
	}

	public boolean virement(int somme, CompteSimple c) {
		return this.debiter(somme) && c.crediter(somme);
	}

	@Override
	public String toString() {
		return "________________\n" + this	.getClass()
											.getSimpleName()
				+ " du client: " + nom + "\nsolde: " + solde + "€";
	}

	public int getSolde() {
		return solde;
	}

}
