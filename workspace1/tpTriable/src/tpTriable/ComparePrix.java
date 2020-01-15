package tpTriable;

import java.util.Comparator;

public class ComparePrix implements Comparator<Article> {

	@Override
	public int compare(Article o1, Article o2) {
		return new Integer(o1.getPrix()).compareTo(o2.getPrix());
	}

}
