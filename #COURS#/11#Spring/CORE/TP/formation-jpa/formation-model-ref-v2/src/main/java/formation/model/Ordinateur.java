package formation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "computer")
@IdClass(OrdinateurId.class)
public class Ordinateur {
	@Id
	@Column(name = "company", length = 50)
	private String societe;
	@Id
	@Column(length = 50)
	private String code;
	private Integer ram;
	private Boolean ssd;
	@OneToOne(mappedBy = "ordinateur")
	private Eleve eleve;

	public Ordinateur() {
		super();
	}

	public Ordinateur(String societe, String code) {
		super();
		this.societe = societe;
		this.code = code;
	}

	public String getSociete() {
		return societe;
	}

	public void setSociete(String societe) {
		this.societe = societe;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getRam() {
		return ram;
	}

	public void setRam(Integer ram) {
		this.ram = ram;
	}

	public Boolean getSsd() {
		return ssd;
	}

	public void setSsd(Boolean ssd) {
		this.ssd = ssd;
	}

	public Eleve getEleve() {
		return eleve;
	}

	public void setEleve(Eleve eleve) {
		this.eleve = eleve;
	}

}
