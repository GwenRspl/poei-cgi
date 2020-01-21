package tpCommercial;

public class Client {
	private String nom;
	private int nbSalarie;
	private EPole pole;

	public Client(String nom, int nbSalarie, EPole pole) {
		this.nom = nom;
		this.nbSalarie = nbSalarie;
		this.pole = pole;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", nbSalarie=" + nbSalarie + ", pole=" + pole + "]";
	}

}
