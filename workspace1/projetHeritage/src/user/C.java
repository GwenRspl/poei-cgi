package user;

import model.A;

public class C extends A {

	public void m3() {
		System.out.println("je suis m3 de C");
	}

	@Override
	public void m() {
		System.out.println("je suis m de C");
		super.m();
	}

}
