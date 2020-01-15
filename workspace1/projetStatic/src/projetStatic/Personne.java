package projetStatic;

public class Personne {

	private static String nom = "Ours"; // un seul attribut partagé par toutes les instances
	private static final int AGE_MIN = 0; // une variable finale
	private static int compteur = 0; // un attribut qui persiste dans la mémoire
	private String prenom;

	public Personne(String prenom) {
		this.prenom = prenom;
		compteur++;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public static void setNom(String nom) {
		Personne.nom = nom;
	}

	public static int getCompteur() {
		return compteur;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + "]";
	}

}
