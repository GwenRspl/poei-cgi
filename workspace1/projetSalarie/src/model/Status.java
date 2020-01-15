package model;

public class Status {

	private int experience;
	private boolean isCadre;

	private final int cadreXp = 3;

	public Status(int experience) {
		this.experience = experience;
		this.isCadre = this.experience >= cadreXp;
	}

	@Override
	public String toString() {
		return "Status [experience=" + experience + ", isCadre=" + ((isCadre) ? "cadre" : "non cadre") + "]";
	}

}
