package model;

public class TroisD extends DeuxD {
	private int z;

	public TroisD(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	@Override
	public String toString() {
		return super.toString() + "[z=" + z + "]";
	}

}
