package projetCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		testHashMapv2();

	}

	private static void testHashMapv2() {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, String> hmHashMap = new HashMap<>();
		hmHashMap.put("haddock", "0606060606");
		hmHashMap.put("tournesol", "0678459825");
		hmHashMap.put("tintin", "0647784512");
		hmHashMap.put("dupond", "0648784552");
		Set<String> keys = hmHashMap.keySet();
		System.out.println("choisir: " + keys);
		String input = scanner.nextLine();
		System.out.println(hmHashMap.get(input));

	}

	private static void testHashMap() {
		HashMap<String, String> hmHashMap = new HashMap<>();
		hmHashMap.put("haddock", "0606060606");
		hmHashMap.put("tournesol", "0678459825");
		hmHashMap.put("tintin", "0647784512");
		hmHashMap.put("dupond", "0648784552");
		System.out.println(hmHashMap.get("haddock"));
		Set<String> keys = hmHashMap.keySet();
		System.out.println(keys);

	}

	private static void testLinkedListv1() {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		System.out.println(list.poll());
		System.out.println(list);
		System.out.println(list.peek());
		System.out.println(list);
		list.clear();
		System.out.println(list.poll());

	}

	private static void test4() {
		ArrayList<Personne> al1 = new ArrayList<>();
		al1.add(new Personne("Haddock", "Capitaine"));
		al1.add(new Personne("Tournesol", "Professeur"));
		al1.add(new Personne("Etmilou", "Tintin"));
		System.out.println(al1);
		ArrayList<Personne> al2 = (ArrayList<Personne>) al1.clone();
		System.out.println(al2);
		Personne p = al1.get(0);

	}

	private static void test3() {
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(10);
		al1.add(20);
		System.out.println(al1);
		ArrayList<Integer> al2 = (ArrayList<Integer>) al1.clone();
		System.out.println(al2);

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
