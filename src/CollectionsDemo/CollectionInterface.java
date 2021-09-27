package CollectionsDemo;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class CollectionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList
		List a1 = new ArrayList();
		a1.add("Sathish");
		a1.add("Alpha");
		a1.add("Alpha");
		a1.add("Anish");
		// ALlow duplicates
		System.out.println("Array List");
		System.out.println(a1);

		// LinkedList
		List l1 = new LinkedList();
		l1.add("Sathish");
		l1.add("Alpha");
		l1.add("Alpha");
		l1.add("Anish");
		// ALlow duplicates
		System.out.println("Linked List");
		System.out.println(l1);
////////////////////////////////////////////////////////////////////////////

		// HashSet

		Set s1 = new HashSet();
		s1.add("Sathish");
		s1.add("Alpha");
		s1.add("Anish");
		// it won't allow duplicates
		s1.add("Alpha");
		System.out.println("Hash Set");
		System.out.println(s1);
		/// Sorted using tree set

		int count[] = { 34, 22, 10, 60, 30, 22 };

		Set<Integer> s2 = Arrays.stream(count).boxed().collect(Collectors.toSet());

//			Set<Integer> s2=new HashSet<Integer>();
//			for(int i=0;i<count.length;i++)
//			{
//				s2.add(count[i]);
//								
//			}
		System.out.println("Hash Set Integer List :" + s2);

		TreeSet<Integer> treeset = new TreeSet<Integer>(s2);

		System.out.println("Sorted order:" + treeset);
		System.out.println("Fine first element:" + treeset.pollFirst());
		System.out.println("Fine last element:" + treeset.pollLast());

		// Sorted Set

		SortedSet<String> sort = new TreeSet<String>();
		sort.add("Sathish");
		sort.add("Alpha");
		sort.add("Anish");
		System.out.println("Sort string list array  ");
		System.out.println(sort);

		// load into iterator

		Iterator<String> it = sort.iterator();

		while (it.hasNext()) {

			Object obj = it.next();

			System.out.println(obj.toString());
		}

///////////////////////////////////////////////////////////////////////////			
		// HashMap

		Map m1 = new HashMap();
		m1.put("Sathish", 24);
		m1.put("Alpha", 26);
		m1.put("Anish", 25);

		// it will overwrite in existing one
		m1.put("Anish", 27);
		System.out.println("HashMap");
		System.out.println(m1);

		// Allows keys and values and put element to add
		HashMap hm = new HashMap();

		// Put elements to the map
		hm.put("Zara", new Double(3434.34));
		hm.put("Mahnaz", new Double(123.22));
		hm.put("Ayan", new Double(1378.00));
		hm.put("Daisy", new Double(99.22));
		hm.put("Qadir", new Double(-19.08));
		System.out.println(hm);
		/// Entry set

		// the method iterator() is undefined for the type HashMap so adding into set
		/// entrySet( ) method declared by the Map interface returns a Set containing
		// the map entries. Each of these set elements is a Map.Entry object.
		Set set = hm.entrySet();
		System.out.println(set);
		Iterator it1 = set.iterator();
		while (it1.hasNext())

		{
			Map.Entry me = (Map.Entry) it1.next();
			System.out.println("Key:" + me.getKey() + ", Value:" + me.getValue());

		}

		// Create a hash map
		TreeMap tm = new TreeMap();

		// Put elements to the map
		tm.put("Zara", new Double(3434.34));
		tm.put("Mahnaz", new Double(123.22));
		tm.put("Ayan", new Double(1378.00));
		tm.put("Daisy", new Double(99.22));
		tm.put("Qadir", new Double(-19.08));

		System.out.println(tm);

		// Get a set of the entries
		Set set2 = tm.entrySet();

		// Get an iterator
		Iterator i = set2.iterator();

		// Display elements
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}

		// ----------------------learn

		System.out.println("Map implements");
		System.out.println("1. Hashmap - random order");

		Map<String, Integer> map = new HashMap<>();

		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);

		// iterate using this logic

		for (Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}

		System.out.println("2. Linkedhashmap - Order of element inserted into");
		Map<String, Integer> linkedhashmap = new LinkedHashMap<>();

		linkedhashmap.put("vishal", 10);
		linkedhashmap.put("sachin", 30);
		linkedhashmap.put("vaibhav", 20);

		for (Map.Entry<String, Integer> e : linkedhashmap.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());

		System.out.println("3. Treemap - sort by asc using key");
		Map<String, Integer> treemap = new TreeMap<>();

		treemap.put("vishal", 10);
		treemap.put("sachin", 30);
		treemap.put("vaibhav", 20);

		for (Map.Entry<String, Integer> e : treemap.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());

	}

}
