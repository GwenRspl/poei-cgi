package model;

public class Adresse {

	private int numero;
	private String rue;
	private String cp;
	private Personne personne;

	public Adresse(int numero, String rue, String cp) {
		this.numero = numero;
		this.rue = rue;
		this.cp = cp;
	}

	public String getCp() {
		return cp;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	
	

	public Personne getPersonne() {
		return personne;
	}

	@Override
	public String toString() {
		return "Adresse [numero=" + numero + ", rue=" + rue + ", cp=" + cp + "]";
	}

}
