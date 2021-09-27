package CollectionsDemo;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMp {

	public static void main(String[] args) {
		TreeMap<Integer, String> tmp = new TreeMap<Integer, String>();
		tmp.put(155, "physics");
		tmp.put(143, "chemistry");
		tmp.put(175, "computer");
		tmp.put(165, "maths");
		tmp.put(135, "physics");
		tmp.put(105, "null");
		tmp.put(25, "null");
		tmp.put(25, "hj");
		System.out.println(tmp);
		System.out.println(tmp.firstEntry());
		System.out.println(tmp.lastEntry());
		tmp.pollFirstEntry();
		System.out.println(tmp);
		tmp.pollLastEntry();
		System.out.println(tmp);
		
		//Important
		NavigableMap<Integer, String> nmap = tmp.descendingMap();
		System.out.println(nmap);

	}

}
