package CollectionsDemo;

import java.util.PriorityQueue;

import javax.swing.text.html.parser.Element;

public class PriorityQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> llt = new PriorityQueue<Integer>();
		// System.out.println(llt.poll());removing empty so null
		// System.out.println(llt.remove());removing empty so abnormal
		// nosuchelementexception error
		llt.add(23);
		llt.add(45);
		llt.add(16);
		llt.add(1);
		llt.add(75);
		System.out.println(llt);
		System.out.println(llt.peek());// print small value
		System.out.println(llt.poll());// remove small one
		System.out.println(llt.element());// print next small value
		System.out.println(llt.remove());// remove first element 
		System.out.println(llt);

	}

}
