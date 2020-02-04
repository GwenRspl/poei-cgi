package tpCalculException;

public class OperateurException extends Exception {
	private String info;

	public OperateurException(String message, String info) {
		super(message);
		this.info = info;
	}

	@Override
	public String toString() {
		return this.getMessage() + " -> " + info;
	}

}
