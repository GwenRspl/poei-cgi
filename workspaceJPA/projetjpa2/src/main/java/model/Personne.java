package model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Version;

@Entity
@NamedQueries({ @NamedQuery(name = "Personne.findAll", query = "select p from Personne p"),
		@NamedQuery(name = "Personne.findAll2", query = "select p from Personne p") })
public class Personne {

	private int id;
	private String nom;
	private String prenom;
	private int age;
	private Adresse adresse;

	private int version;

	public Personne() {
	}

	public Personne(int id, String nom, String prenom, int age, Adresse adresse) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresse = adresse;
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

	@Embedded
	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
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

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", adresse=" + adresse
				+ ", version=" + version + "]";
	}

}
