package formation.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Entreprise {
	@EmbeddedId
	private EntrepriseId id;
	@Enumerated(EnumType.STRING)
	@Column(length = 5)
	private Type type;
	@Column(name = "turnover") // pour Grégoire
	private Long chiffreAffaire;

	public Entreprise() {
		super();
	}

	public Entreprise(String siret, String nom) {
		super();
		this.id = new EntrepriseId(siret, nom);
	}

	public EntrepriseId getId() {
		return id;
	}

	public void setId(EntrepriseId id) {
		this.id = id;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Long getChiffreAffaire() {
		return chiffreAffaire;
	}

	public void setChiffreAffaire(Long chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}

}
