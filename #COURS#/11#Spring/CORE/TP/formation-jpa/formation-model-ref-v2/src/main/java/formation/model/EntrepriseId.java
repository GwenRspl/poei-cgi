package formation.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EntrepriseId implements Serializable {
	private static final long serialVersionUID = 4880260509644199171L;
	@Column(length = 20)
	private String siret;
	@Column(name = "name", length = 100)
	private String nom;

	public EntrepriseId() {
		super();
	}

	public EntrepriseId(String siret, String nom) {
		super();
		this.siret = siret;
		this.nom = nom;
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
