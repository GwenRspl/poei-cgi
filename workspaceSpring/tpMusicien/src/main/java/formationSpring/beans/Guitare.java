package formationSpring.beans;

public class Guitare implements InstrumentCorde {

	@Override
	public String jouer() {
		return "joue de la guitare.";
	}

}
