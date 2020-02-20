package formationSpring.beans;

import java.util.Date;

public class Trace {

	public void avant() {
		System.out.println("avant >> " + new Date());
	}

	public void apres() {
		System.out.println("apres >> " + new Date());
	}

}
