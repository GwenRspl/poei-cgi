package model;

public class Salarie {
	private int id;
	private String nom;
	private String prenom;
	private Rib rib;
	private Status status;

	public Salarie(int id, String nom, String prenom, Rib rib, int experience) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.rib = rib;
		this.status = new Status(experience);
	}

	@Override
	public String toString() {
		return "Salarie [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", rib=" + rib + ", status=" + status
				+ "]";
	}

}
