package tpCalculException;

public class NegatifException extends Exception {
	private String info;

	public NegatifException(String message, String info) {
		super(message);
		this.info = info;
	}

	@Override
	public String toString() {
		return this.getMessage() + " -> " + info;
	}

}
