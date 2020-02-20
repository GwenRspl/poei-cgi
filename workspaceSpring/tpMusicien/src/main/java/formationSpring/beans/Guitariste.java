package formationSpring.beans;

public class Guitariste implements Musicien {
	private String nom;
	private InstrumentCorde instrumentCorde;

	public Guitariste() {
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public InstrumentCorde getInstrumentCorde() {
		return instrumentCorde;
	}

	public void setInstrumentCorde(InstrumentCorde instrumentCorde) {
		this.instrumentCorde = instrumentCorde;
	}

	@Override
	public void performer() {
		System.out.println(this.nom + " est un guitariste.\nIl " + instrumentCorde.jouer());
	}

}
