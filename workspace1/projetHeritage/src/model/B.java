package model;

public class B extends A {

	public void m2() {
		System.out.println("je suis m2 de B");
	}

	@Override
	public void m() {
		System.out.println("je suis m de B");
	}

	public String toString() {
		return super.toString() + "toString de B: " + getClass().getSimpleName();
	}

}
