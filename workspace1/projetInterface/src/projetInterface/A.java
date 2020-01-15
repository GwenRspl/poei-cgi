package projetInterface;

public class A extends X implements I1, I2 {

	public void mA() {
		System.out.println("je suis mA de A");
	}

	@Override
	public void m1() {
		System.out.println("je suis m1 de A");
	}

	@Override
	public void m2() {
		System.out.println("je suis m2 de A");

	}

	@Override
	public String mString() {
		return "mstring de A";
	}

}
