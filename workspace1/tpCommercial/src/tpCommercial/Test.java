package tpCommercial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		test1();

	}

	private static void test1() {
		HashMap<Commercial, ArrayList<Client>> map = new HashMap<>();
		Commercial c1 = new Commercial("Haddock", "Capitaine", 123);
		Commercial c2 = new Commercial("Tournesol", "Professeur", 456);
		Commercial c3 = new Commercial("EtMilou", "Tintin", 789);

		Client cl1 = new Client("Baba Yaga", 30, EPole.ASSURANCE);
		Client cl2 = new Client("John Wick", 30, EPole.AUTO);
		Client cl3 = new Client("Gargamel", 30, EPole.ASSURANCE);
		ArrayList<Client> a1 = new ArrayList<>();
		a1.add(cl1);
		a1.add(cl2);
		a1.add(cl3);

		Client cl4 = new Client("Vercingetorix", 30, EPole.BANQUE);
		Client cl5 = new Client("Assurancetourix", 30, EPole.ASSURANCE);
		ArrayList<Client> a2 = new ArrayList<>();
		a2.add(cl4);
		a2.add(cl5);

		Client cl6 = new Client("Jafar", 30, EPole.AUTO);
		Client cl7 = new Client("Abou", 30, EPole.BANQUE);
		ArrayList<Client> a3 = new ArrayList<>();
		a3.add(cl6);
		a3.add(cl7);

		map.put(c1, a1);
		map.put(c2, a2);
		map.put(c3, a3);

		// =====================================================

		Scanner scanner = new Scanner(System.in);

		System.out.println("Liste des commerciaux: ");
		Set<Commercial> commerciaux = map.keySet();
		for (Commercial commercial : commerciaux) {
			System.out.println(commercial);
		}
		System.out.println();
		System.out.print("Taper le numéro de sécu du commercial souhaité : ");
		int input = scanner.nextInt();

		Commercial chosen = new Commercial("", "", input);
		// for (Commercial commercial : commerciaux) {
		// if (commercial.getSecu() == input)
		// chosen = commercial;
		// }
		ArrayList<Client> clients = map.get(chosen);

		System.out.println();
		for (Client client : clients) {
			System.out.println(client);
		}

	}

}
