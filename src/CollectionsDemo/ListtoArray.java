package CollectionsDemo;

import java.util.ArrayList;
import java.util.List;

public class ListtoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(23);
		list.add(12);
		list.add(4);
		list.add(124);
		list.add(33);
		
		Integer num[]=list.toArray(new Integer[list.size()]);
		 
		int n[]=list.stream().mapToInt(Integer :: intValue).toArray();
		//or
		int n2[]=list.stream().mapToInt(i->i).toArray();
				
		
	}

}
