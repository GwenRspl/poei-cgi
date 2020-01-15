package model;

public class Poste {
	private String name;

	public Poste(String name) {
		this.name = name;
	}

	public void print(String str) {
		Centraliseur.getInstance()
					.print(name + " " + str);
	}

	@Override
	public String toString() {
		return "Poste [name=" + name + "]";
	}

}
