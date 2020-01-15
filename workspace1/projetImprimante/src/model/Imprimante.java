package model;

public class Imprimante {

	private String name;

	public Imprimante(String name) {
		this.name = name;
	}

	public void print(String str) {
		str += " " + name;
		System.out.println(str);
	}

	@Override
	public String toString() {
		return "Imprimante [name=" + name + "]";
	}

}
