package tpCalculException;

public class ConversionException extends Exception {

	private String info;

	public ConversionException(String message, String info) {
		super(message);
		this.info = info;
	}

	@Override
	public String toString() {
		return this.getMessage() + " -> " + this.info;
	}

}
