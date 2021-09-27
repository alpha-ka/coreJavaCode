package CollectionsDemo;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * @author ALPHA
 *
 */
public class Treest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> llt = new TreeSet<Integer>();
		llt.add(23);
		llt.add(45);
		llt.add(16);
		llt.add(1);
		llt.add(75);
		System.out.println(llt);
		System.out.println(llt.first());
		System.out.println(llt.last());
		llt.pollFirst();
		llt.pollLast();
		System.out.println(llt);
		//Important
		NavigableSet<Integer> nset = llt.descendingSet();
		System.out.println(nset);

	}

}
