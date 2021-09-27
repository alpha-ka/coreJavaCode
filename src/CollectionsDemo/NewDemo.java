package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class NewDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection value = new ArrayList();
		value.add(007);
		value.add("Alpha");
		value.add(160694);
		value.add("K A");
		value.remove(160694);
//		Iterator i = value.iterator();
//		while(i.hasNext())
//		{System.out.println(i.next());
//		//System.out.println(i.next());
//		//System.out.println(i.next());
//		}
		
		for (Object i : value)//here we don't know the datatype so we can go with object
		{
			System.out.println(i);
		}
		System.out.println("Stream API");
	
		
		value.forEach(System.out::println);
	}

}
