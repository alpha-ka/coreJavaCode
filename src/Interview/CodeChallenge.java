package Interview;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;




public class CodeChallenge {
	public static void main(String[] args) {
	

String str="Hello";
 
Map<String,Integer> m= new HashMap<String, Integer>();	

for(int i =0;i<str.length();i++)
{
int c=1;
String str2= Character.toString(str.charAt(i))  ;
for(int j=0;j<str.length();j++)
{	
	
	if(j!=i &&  str.charAt(i)==str.charAt(j))
	{
	c++;
	}	
}

m.put(str2,c);
	}

//TreeMap<String, Integer> treemap = new TreeMap<String, Integer>(m); 
//Set<Map.Entry<String, Integer>> set=m.entrySet();
 
List<Map.Entry<String, Integer>> list=new ArrayList<Map.Entry<String,Integer>>(m.entrySet());

Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
	
	@Override
	public  int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2)
	{
		return o2.getValue().compareTo(o1.getValue());
		
	}
});

 
for(Map.Entry<String ,Integer> entries: list)
{
	
	System.out.println(entries.getKey()+" "+entries.getValue());
	}
 


//Simplest way of doing above logic
String strp= "I am am learning java core java";
String arr[]=strp.split(" ");
Map<String,Integer> map=new HashMap<String, Integer>();
for (String tempstr : arr)
{
	if(map.get(tempstr)!=null)
	{
		map.put(tempstr,map.get(tempstr)+1);
	}
	else
	{
	map.put(tempstr, 1);
	}
}
System.out.println(map);

Iterator<String> it=map.keySet().iterator();
while(it.hasNext())
{
	String temp=it.next();
	 if(map.get(temp)>1)
	 {
		 System.out.println("The word "+temp+" appeared "+map.get(temp)+" times" );
	 }
	
	
	}



String[] animalNames = {"cat", "rabbit", "horse0000000000000000000", "goat", "rooster", "ooooooooooooooo"};
List<String> strings = Arrays.asList(animalNames);    
String longest = strings.stream().max(Comparator.comparingInt(String ::length)).get();
System.out.println(strings);
System.out.println(longest);


String s1 = "Hello";
String s2 = "World";
String s3 = s1 + s2;
//using + operator
System.out.println("Using + operator: ");
System.out.println(s3);

//using concat method
System.out.println("Using concat method: ");
System.out.println(s1.concat(s2));

System.out.println("s1 -> "+s1+ " -> " +s1.hashCode());

System.out.println("s2 -> "+s2+ " -> " +s2.hashCode());

System.out.println("s3 -> "+s3+ " -> " +s3.hashCode());



}
}
