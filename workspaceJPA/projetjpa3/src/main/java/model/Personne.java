package model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity
public class Personne {

	private int id;
	private String nom;
	private String prenom;
	private int age;
	private Computer pc;

	private int version;

	public Personne() {
	}

	public Personne(int id, String nom, String prenom, int age) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	public Personne(int id, String nom, String prenom, int age, Computer pc) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.pc = pc;
	}

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Version
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "COMPUTER_ID")
	public Computer getPc() {
		return pc;
	}

	public void setPc(Computer pc) {
		this.pc = pc;
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", version=" + version
				+ "]";
	}

}
