package model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class Departement {
	private int id;
	private String name;
	private int version;
	private Collection<Personne> personnes;

	public Departement() {
	}

	public Departement(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Id
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

	@Version
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@OneToMany(mappedBy = "dept", fetch = FetchType.EAGER)
	public Collection<Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(Collection<Personne> personnes) {
		this.personnes = personnes;
	}

	@Override
	public String toString() {
		return "Departement [id=" + id + ", name=" + name + ", version=" + version + "]";
	}

}
