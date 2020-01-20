package projetCollection;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		test2();

	}

	private static void test2() {
		ArrayList<Personne> aList = new ArrayList<>();
		aList.add(new Personne("Haddock", "Capitaine"));
		aList.add(new Personne("Tournesol", "Professeur"));
		aList.add(new Personne("Etmilou", "Tintin"));
		System.out.println(aList);
		aList.clear();
		System.out.println(aList);

	}

	private static void test1() {
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		System.out.println(al1);

	}

}
