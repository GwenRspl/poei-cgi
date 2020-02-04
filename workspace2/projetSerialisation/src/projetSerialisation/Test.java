package projetSerialisation;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		testSerialListXml();
		testDeserialListXml();
	}

	private static void testDeserialBinaire() throws IOException, ClassNotFoundException {
		Personne p1 = null;
		File f = new File("test1.txt");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		p1 = (Personne) ois.readObject();
		ois.close();
		fis.close();

		System.out.println(p1.getNom());

	}

	private static void testSerialBinaire() throws IOException {
		Personne p = new Personne("Haddock", "Capitaine", 40);
		System.out.println(p);

		File f = new File("test1.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p);
		oos.close();
		fos.close();

	}

	private static void testSerialXml() throws IOException {
		Personne p1 = new Personne("Haddock", "Capitaine", 40);
		System.out.println(p1);

		File f = new File("test1.xml");
		FileOutputStream fos = new FileOutputStream(f);
		XMLEncoder oos = new XMLEncoder(fos);
		oos.writeObject(p1);

		oos.close();
		fos.close();

	}

	private static void testDeserialXml() throws IOException, ClassNotFoundException {
		Personne p1 = null;
		File f = new File("test1.xml");
		FileInputStream fis = new FileInputStream(f);
		XMLDecoder ois = new XMLDecoder(fis);
		p1 = (Personne) ois.readObject();
		ois.close();
		fis.close();

		System.out.println(p1.getNom());

	}

	private static void test2SerialXml() throws IOException {
		Personne p1 = new Personne("Haddock", "Capitaine", 40);
		Personne p2 = new Personne("Tournesol", "Professeur", 60);
		System.out.println(p1);
		System.out.println(p2);

		File f = new File("test2.xml");
		FileOutputStream fos = new FileOutputStream(f);
		XMLEncoder oos = new XMLEncoder(fos);
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.close();
		fos.close();

	}

	private static void test2DeserialXml() throws IOException {
		Personne p1 = null;
		Personne p2 = null;
		Personne p3 = null;
		File f = new File("test2.xml");
		FileInputStream fis = new FileInputStream(f);
		XMLDecoder ois = new XMLDecoder(fis);
		Object o1 = ois.readObject();
		if (o1 instanceof Personne)
			p1 = (Personne) o1;
		// p1 = (Personne) ois.readObject();
		p2 = (Personne) ois.readObject();
		p3 = (Personne) ois.readObject();
		ois.close();
		fis.close();

		System.out.println(p1.getNom());
		System.out.println(p2.getNom());

	}

	private static void testSerialListXml() throws IOException {
		Personne p1 = new Personne("Haddock", "Capitaine", 40);
		Personne p2 = new Personne("Tournesol", "Professeur", 60);
		ArrayList<Personne> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);

		File f = new File("list.xml");
		FileOutputStream fos = new FileOutputStream(f);
		XMLEncoder oos = new XMLEncoder(fos);
		oos.writeObject(list);
		oos.close();
		fos.close();
	}

	private static void testDeserialListXml() throws IOException {
		ArrayList<Personne> list = null;
		File f = new File("list.xml");
		FileInputStream fis = new FileInputStream(f);
		XMLDecoder ois = new XMLDecoder(fis);
		list = (ArrayList<Personne>) ois.readObject();
		ois.close();
		fis.close();

		System.out.println(list);

	}
}
