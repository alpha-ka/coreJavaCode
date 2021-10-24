package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> values=new ArrayList<Integer>();
		values.add(45);
		values.add(34);
		values.add(50);
		//Before  Java 7
		for(int value:values)
		{
			if(value>40)
				System.out.println(value);
			
		}
	
		//After Java 8
		//Stream Filter
		Stream<Integer> s=values.stream();//Elements/Sequential of Stream with this collection 
		s=s.filter(i -> i>45 );//Stream is a interface which as some methods. like Filter,Map
		s.forEach(x->System.out.println(x));
		//values=values.stream().filter(value -> (value>40)).collect(Collectors.toList());
		//values.stream().forEach(value->System.out.println(value));
		//Strem Map
		Stream<Integer> s2=values.stream();
		s2=s2.map(i -> i*i);
		s2.forEach(x->System.out.println(x));
		values.stream().map(i->i*i).forEach(i->System.out.println(i));
		System.out.println("Stream -> Count()");
		//Stream count
		System.out.println(values.stream().count());
		//Stream sort
		
		System.out.println("Stream -> Sort()");
		
		values.stream().sorted().forEach(value->System.out.println(value));

		System.out.println("Stream -> Sort() Ascending using compareTo");
		
		values.stream().sorted((o1,o2) -> o1.compareTo(o2)).forEach(value -> System.out.println(value));
		System.out.println("Stream -> Sort() descending using compareTo");
		values.stream().sorted((o1,o2) -> o2.compareTo(o1)).forEach(value -> System.out.println(value));
		
		
		System.out.println("Stream -> Min() AND Also need compareTo to achieve");		
		System.out.println(values.stream().min((o1,o2) -> o1.compareTo(o2)));
		
		System.out.println("Stream -> Min() AND Also need compareTo to achieve descending Order and fetches first one so it is max value");		
		System.out.println(values.stream().min((o1,o2) -> o2.compareTo(o1)));
		
		System.out.println("Stream -> Max() AND Also need compareTo to achieve and also ascending Order ");		
		System.out.println(values.stream().max((o1,o2) -> o1.compareTo(o2)));
		
		System.out.println("Stream -> Max() AND Also need compareTo to achieve and also descending Order so fetches min value ");		
		System.out.println(values.stream().max((o1,o2) -> o2.compareTo(o1)));
		
		System.out.println("Stream -> toArray() AND copies element in stream into array ");		
		Object[] objs=values.stream().toArray();
		for(Object obj : objs) {System.out.println(obj);}
		 
		System.out.println("Stream -> of()  Any group of elements converts into element of the stream ");		
		Stream.of(1,22,3,3,4445,5,798,5).forEach(x -> System.out.println(x));
		String[] strs= {"Dog","Apple","Carrot","Bannana"};
		Stream.of(strs).sorted((o1,o2) -> o1.compareTo(o2)).forEach(str->System.out.println(str));
		
		String str=null;
		String str2="Hello";
		Optional<String> opt=Optional.ofNullable(str2);
		System.out.println(opt);
		//Optional<String> opt2=Optional.of(str);
		//System.out.println(opt2);
		
		
		
		Employee emp=new Employee(1, "Sathish", 25735);
		Employee emp2=new Employee(2, "Alpha K A", 15735);
		Employee emp3=new Employee(3, "Alpha K A", 10735);
		
		Employee emp4=new Employee(4, "Anish R", 35735);
		
		List<Employee> listEmps=new ArrayList<Employee>();
		listEmps.add(emp);
		listEmps.add(emp2);
		listEmps.add(emp3);
		listEmps.add(emp4);
		System.out.println(listEmps);
		
		listEmps.stream().sorted(Comparator.comparing((Employee e )-> e.getName()).thenComparing(Comparator.comparing((Employee e2) -> e2.getSalary() ).reversed())).forEach(e->System.out.println(e));
		System.out.println("Stream with ::");
		listEmps.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Comparator.comparing(Employee::getSalary).reversed())).forEach(e->System.out.println(e));

		System.out.println("new");
		
		listEmps.stream().filter(e -> (e.getId()%2==0 && e.getSalary()>15000) ).sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(e->System.out.println(e));
		
		
		
		listEmps.parallelStream().filter(e -> (e.getId()%2==0 && e.getSalary()>15000) ).sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(e->System.out.println(e));
		
		
		
		
		
		List<String> newstr=Arrays.asList("Apple","Orange","Banana","ice","Soup");
		
		newstr.stream().map(st -> st.length()).forEach(System.out::println);
		System.out.println(":: -> way");
		newstr.stream().map(String::length).forEach(System.out::println);
		System.out.println("uppercase");
		newstr.stream().map(String::toUpperCase).forEach(System.out::println);
		
		
		
		
		
		
	}

}
