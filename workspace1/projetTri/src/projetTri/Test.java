package projetTri;

public class Test {

	public static void main(String[] args) {
		tpTri();

	}
	
	static void displayTab(int[] tab) {
		for (int e : tab)
			System.out.print(e + "\t");
	}

	static void tpTri() {
		int[] tab = { 5, 8, 7, 1, 3, 5, 89, 3, 1 };
		displayTab(tab);
		tri(tab);
		System.out.println();
		displayTab(tab);

	}

	static void tri(int[] tab) {
		int passage = 0;
		boolean permuting = false;

		while (permuting) {
			permuting = false;
			passage++;
			for (int i = 0; i < tab.length - passage; i++) {
				if (tab[i] > tab[i + 1]) {
					permuting = true;
					int temp = tab[i];
					tab[i] = tab[i + 1];
					tab[i + 1] = temp;
				}
			}
		}
	}

}
