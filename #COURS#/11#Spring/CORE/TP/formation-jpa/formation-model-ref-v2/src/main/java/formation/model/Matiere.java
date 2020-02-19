package formation.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
public class Matiere {
	@Id
	@Column(name = "name", length = 100)
	private String nom;
	@Column(name = "duration")
	private Integer duree;
	@Enumerated(EnumType.STRING)
	@Column(name = "level", length = 20)
	private Niveau niveau;

	@ManyToMany(mappedBy = "matieres")
	private List<Formation> formations = new ArrayList<>();

	public Matiere() {
		super();
	}

	public Matiere(String nom, Integer duree, Niveau niveau) {
		super();
		this.nom = nom;
		this.duree = duree;
		this.niveau = niveau;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getDuree() {
		return duree;
	}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}

	public Niveau getNiveau() {
		return niveau;
	}

	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}

	public List<Formation> getFormations() {
		return formations;
	}

	public void setFormations(List<Formation> formations) {
		this.formations = formations;
	}

}
