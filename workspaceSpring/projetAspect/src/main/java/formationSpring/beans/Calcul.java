package formationSpring.beans;

public class Calcul {

	public void add(int a, int b) {
		int res = a + b;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(res);
	}

}
