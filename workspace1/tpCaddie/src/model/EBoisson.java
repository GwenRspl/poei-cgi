package model;

public enum EBoisson {
	petit(1),
	moyen(2),
	grand(3);

	private int volume;

	private EBoisson(int volume) {
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

}
