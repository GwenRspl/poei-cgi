package formation.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("eleve")
public class Eleve extends Personne {
	@Column(name = "grade")
	private Integer note;
	@Enumerated(EnumType.STRING)
	@Column(name = "diploma", length = 10)
	private Diplome diplome;
	@ManyToOne
	@JoinColumn(name = "trainer_id")
	private Formateur formateur;
	@OneToOne
	@JoinColumns({ @JoinColumn(name = "computer_company", referencedColumnName = "company"),
			@JoinColumn(name = "computer_code", referencedColumnName = "code") })
	private Ordinateur ordinateur;

	public Eleve() {
		super();
	}

	public Eleve(String nom, String prenom) {
		super(nom, prenom);
	}

	public Integer getNote() {
		return note;
	}

	public void setNote(Integer note) {
		this.note = note;
	}

	public Diplome getDiplome() {
		return diplome;
	}

	public void setDiplome(Diplome diplome) {
		this.diplome = diplome;
	}

	public Formateur getFormateur() {
		return formateur;
	}

	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}

	public Ordinateur getOrdinateur() {
		return ordinateur;
	}

	public void setOrdinateur(Ordinateur ordinateur) {
		this.ordinateur = ordinateur;
	}

}
