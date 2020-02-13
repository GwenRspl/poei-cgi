package model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Version;

@Entity
public class Projet {
	@Id
	private int id;
	private String name;
	@ManyToMany(mappedBy = "projets", fetch = FetchType.EAGER)
	private Collection<Personne> personnes;
	@Version
	private int version;

	public Projet() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(Collection<Personne> personnes) {
		this.personnes = personnes;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Projet [id=" + id + ", name=" + name + ", personnes=" + personnes + ", version=" + version + "]";
	}

}
