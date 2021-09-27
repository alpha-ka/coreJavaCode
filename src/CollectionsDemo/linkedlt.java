package CollectionsDemo;

import java.util.LinkedList;

//////doubly linkedlist data structure each one storing in separate obj
public class linkedlt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> llt = new LinkedList<Integer>();
		llt.add(23);
		llt.add(45);
		llt.add(16);
		llt.add(1);
		llt.add(75);
		System.out.println(llt);
		llt.addFirst(45);
		llt.addLast(77);
		System.out.println(llt);
		llt.removeFirst();
		llt.removeLast();
		System.out.println(llt);
		System.out.println(llt.getFirst());
		System.out.println(llt.getLast());
	}

}
