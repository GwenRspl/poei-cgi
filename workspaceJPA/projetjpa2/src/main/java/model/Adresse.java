package model;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
	private int numero;
	private String rue;
	private int cp;

	public Adresse() {
	}

	public Adresse(int numero, String rue, int cp) {
		this.numero = numero;
		this.rue = rue;
		this.cp = cp;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	@Override
	public String toString() {
		return "Adresse [numero=" + numero + ", rue=" + rue + ", cp=" + cp + "]";
	}

}
