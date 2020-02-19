package formation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "training")
public class Formation {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name = "title", length = 100)
	private String intitule;
	@Column(length = 100)
	private String promotion;
	@Temporal(TemporalType.DATE)
	@Column(name = "startdate")
	private Date dtDebut;
	@Temporal(TemporalType.DATE)
	@Column(name = "enddate")
	private Date dtFin;
	@ManyToOne
	@JoinColumn(name = "classroom_id")
	private Salle salle;
	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "company_siret", referencedColumnName = "siret"),
		@JoinColumn(name = "company_name", referencedColumnName = "name") })
	private Entreprise entreprise;
	@ManyToMany
	@JoinTable(name = "training_subject", joinColumns = @JoinColumn(name = "training_id"), inverseJoinColumns = @JoinColumn(name = "subject_name"), uniqueConstraints = @UniqueConstraint(columnNames = {
			"training_id", "subject_name" }))
	private List<Matiere> matieres = new ArrayList<>();

	public Formation() {
		super();
	}

	public Formation(String intitule, String promotion, Date dtDebut, Date dtFin) {
		this(null, intitule, promotion, dtDebut, dtFin);
	}

	public Formation(Long id, String intitule, String promotion, Date dtDebut, Date dtFin) {
		super();
		this.id = id;
		this.intitule = intitule;
		this.promotion = promotion;
		this.dtDebut = dtDebut;
		this.dtFin = dtFin;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public String getPromotion() {
		return promotion;
	}

	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}

	public Date getDtDebut() {
		return dtDebut;
	}

	public void setDtDebut(Date dtDebut) {
		this.dtDebut = dtDebut;
	}

	public Date getDtFin() {
		return dtFin;
	}

	public void setDtFin(Date dtFin) {
		this.dtFin = dtFin;
	}

	public List<Matiere> getMatieres() {
		return matieres;
	}

	public void setMatieres(List<Matiere> matieres) {
		this.matieres = matieres;
	}

	public void addMatiere(Matiere matiere) {
		this.matieres.add(matiere);
	}

	public void removeMatiere(Matiere matiere) {
		this.matieres.remove(matiere);
	}

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

}
