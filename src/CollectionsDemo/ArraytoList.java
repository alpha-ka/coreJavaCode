package CollectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArraytoList {

	public static void main(String[] args) {
		 
		
		int n[]= {2,3,1,4,245,6};
		
		System.out.println(Arrays.toString(n));
		for(int i:n)
		{
			System.out.println(i);
		}
		
		Integer wrapint[]= Arrays.stream(n).boxed().toArray(Integer[]::new);
		
		for(int i:wrapint)
		{
			System.out.print(i);
		}
		//int to list
		List<Integer> list =Arrays.stream(n).boxed().collect(Collectors.toList());
		
		list.forEach(num -> System.out.print(num));
		
		
		//Integer to list
		List<Integer> list2=Arrays.asList(wrapint);
		
		list2.forEach(System.out::print);
		
		List<Integer> list3=new ArrayList<Integer>();
			    Collections.addAll(list3,wrapint);
		
		
		

	}

}
