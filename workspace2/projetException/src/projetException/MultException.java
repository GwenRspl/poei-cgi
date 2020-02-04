package projetException;

public class MultException extends Exception {

	private String info;

	public MultException(String message, String info) {
		super(message);
		this.info = info;
	}

	@Override
	public String toString() {
		return "MultException [info=" + info + ", getMessage()=" + getMessage() + "]";
	}

}
