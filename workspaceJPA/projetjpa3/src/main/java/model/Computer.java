package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity
public class Computer {

	private String SN;
	private String model;
	private int version;

	private Personne personne;

	public Computer() {
	}

	@Id
	public String getSN() {
		return SN;
	}

	public void setSN(String sN) {
		SN = sN;
	}

	@OneToOne(mappedBy = "pc")
	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Version
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Computer [SN=" + SN + ", model=" + model + ", version=" + version + ", personne=" + personne + "]";
	}

}
