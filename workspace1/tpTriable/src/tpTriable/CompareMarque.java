package tpTriable;

import java.util.Comparator;

public class CompareMarque implements Comparator<Article> {

	@Override
	public int compare(Article o1, Article o2) {
		return o1	.getMarque()
					.compareTo(o2.getMarque());
	}

}
