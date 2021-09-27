package CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Arraylt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> arrlt = new Vector<Integer>();
		System.out.println(arrlt.isEmpty());
		System.out.println(arrlt.size());
		arrlt.add(23);
		arrlt.add(45);
		arrlt.add(16);
		arrlt.add(1);
		arrlt.add(75);
		System.out.println(arrlt);
		System.out.println(arrlt.isEmpty());
		System.out.println(arrlt.size());
		System.out.println(arrlt.contains(1));
		System.out.println(arrlt.contains(55));
		arrlt.remove(3);
		System.out.println(arrlt);
		Vector<Integer> arrlt1 = new Vector<Integer>();
		arrlt1.add(23);
		arrlt1.add(55);
		arrlt1.add(16);
		arrlt1.add(10);
		arrlt1.add(75);
		System.out.println(arrlt1);
		
		
		System.out.println("retainALl it removes not contained");
		arrlt.retainAll(arrlt1);
		System.out.println(arrlt);
		
		arrlt.addAll(arrlt1);
		System.out.println(arrlt);
		arrlt.removeAll(arrlt1);
		System.out.println(arrlt);
		arrlt.addAll(arrlt1);
		System.out.println(arrlt);
		Iterator<Integer> it = arrlt.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}

	}

}
