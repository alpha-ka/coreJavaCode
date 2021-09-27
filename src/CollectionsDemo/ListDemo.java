package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> value = new ArrayList<>();
		value.add(10);
		value.add(4);
		value.add(1);
		value.add(9);
		Collections.sort(value);//collections will sort only list interface not collection interface
		value.forEach(System.out::println);
		
	}

}
