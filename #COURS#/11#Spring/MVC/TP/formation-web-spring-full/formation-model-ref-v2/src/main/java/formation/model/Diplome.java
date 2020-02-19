package formation.model;

public enum Diplome {
	BAC("Bac"), BAC_2("Bac + 2"), BAC_3("Bac + 3"), BAC_5("Bac + 5"), BAC_8("Docteur");

	private final String label;

	private Diplome(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
