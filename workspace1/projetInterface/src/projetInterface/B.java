package projetInterface;

public class B implements I1 {

	@Override
	public void m1() {
		System.out.println("je suis m1 de B");

	}

	public void mB() {
		System.out.println("je suis mB de B");

	}

	@Override
	public String mString() {
		return "mstring de B";
	}

}
