package tpTriable;

public class Personne implements Comparable<Personne> {

	private String nom;
	private String prenom;
	private int age;

	public Personne(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}

	// @Override
	// public int compareTo(Personne o) {
	// return this.nom.compareTo(o.nom);
	// }

	@Override
	public int compareTo(Personne o) {
		return ((Integer) this.age).compareTo((Integer) o.age);
	}

}
