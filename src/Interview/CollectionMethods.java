package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruitList = new ArrayList<String>();
		fruitList.add("Mango");
		fruitList.add("Banana");
		fruitList.add("Apple");
		fruitList.add("Strawberry");
		System.out.println(fruitList);
		System.out.println("------------List to Arrays------------");

		String fruits[] = fruitList.toArray(new String[fruitList.size()]);
		System.out.println(Arrays.toString(fruits));

		System.out.println("------------List sort------------");
		Collections.sort(fruitList);
		System.out.println(fruitList);
		System.out.println("------------List contains------------");
		System.out.println(fruitList.contains("Apple"));
		System.out.println("------------List containsAll------------");
		List<String> myList = new ArrayList<String>();
		myList.add("Apple");
		myList.add("Strawberry");

		System.out.println(fruitList.containsAll(myList));

		System.out.println("------------List Indexof------------");
		System.out.println(fruitList.indexOf("Banana"));
		fruitList.add("Banana");
		System.out.println(fruitList);
		System.out.println("------------List lastIndexof------------");

		System.out.println(fruitList.lastIndexOf("Banana"));

		System.out.println("------------List remove------------");
		fruitList.remove("Apple");
		System.out.println(fruitList);
		System.out.println("------------List remove All------------");
		fruitList.removeAll(myList);
		System.out.println(fruitList);

		System.out.println("------------List clear------------");
		fruitList.clear();

		System.out.println("List after calling clear() method:" + fruitList);

	}

}
