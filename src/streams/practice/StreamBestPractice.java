package streams.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBestPractice {

	public static void main(String[] args) {

		List<Person> persons=getList();
		
		persons.forEach(System.out::println);
		
		// Imperative approach
		System.out.println(">>>>>>>>>Imperative approach");
		List<Person> female=new ArrayList<Person>();
		for(Person person:persons)
		{
			if (person.getGender().equals(Gender.FEMALE))
			{
				female.add(person);
			}
		}
		female.forEach(System.out::println);
		
		 // Declarative approach 
		System.out.println(">>>>>>>>>Declarative approach ");
		 female=persons.stream().filter(person->person.getGender().equals(Gender.FEMALE)).collect(Collectors.toList());
		 female.forEach(System.out::println);
		
		 // Sort 
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>Sort ASC");
		persons.stream().sorted(Comparator.comparing(Person::getAge)).forEach(System.out::println);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>Sort DeSC");
		persons.stream().sorted(Comparator.comparing(Person::getAge).reversed()).forEach(System.out::println);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>Filter and Sort ASC");
		persons.stream().filter(person->person.getAge()>20).sorted(Comparator.comparing(Person::getSalary).reversed()).forEach(System.out::println);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>All match");
		// All match
		boolean allmatch=persons.stream().allMatch(person->person.getAge()>6);
		System.out.println(allmatch);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>Any match");
		// Any match
		boolean anymatch=persons.stream().anyMatch(person->person.getSalary()>30000.00);
		System.out.println(anymatch);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>None match");
		//None match
		boolean nonematch =persons.stream().noneMatch(person->person.getAge()<18);
		
		System.out.println(nonematch);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>Max age person");
		//Max
		Optional maxAgePerson=persons.stream().max(Comparator.comparing(Person::getAge));
		System.out.println(maxAgePerson);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>Min age person");		
		//Min
		
		Optional minAgePerson =persons.stream().min(Comparator.comparing(Person::getAge));
		System.out.println(minAgePerson);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>Group by person gender");		
		//Group by
		Map<Gender, List<Person>> groupedByPerson=persons.stream().collect(Collectors.groupingBy(Person::getGender));
		
		groupedByPerson.forEach((gender,peoples) ->
		{
				System.out.println(gender);
				peoples.stream().forEach(System.out::println);
		}		);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>Find oldest people in female gender");
	 
		
	Optional<String> oldestFemalePersonName=persons.stream()
		.filter(person->person.getGender().equals(Gender.FEMALE))
		.max(Comparator.comparing(Person::getAge))
		.map(Person::getName);
	oldestFemalePersonName.ifPresent(System.out::println);
	System.out.println(oldestFemalePersonName);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	static List<Person> getList()
	{
//		return Arrays.asList(
//				new Person(1, "Antonio", 20, Gender.MALE, 25000.99),
//				new Person(2, "Alina Smith", 33, Gender.FEMALE, 15000.99),
//				new Person(3, "Helen White", 57, Gender.FEMALE, 35000.99),
//				new Person(4,"Alex Boz", 14, Gender.MALE, 3440.99),
//				new Person(5, "Jamie Goa", 99, Gender.MALE, 2540.99),
//				new Person(6, "Anna Cook", 7, Gender.FEMALE, 27000.99),
//				new Person(7, "Zelda Brown", 120, Gender.FEMALE, 5000.99)
//				
//				);
		
		return Stream.of(			new Person(1, "Antonio", 20, Gender.MALE, 25000.99),
				new Person(2, "Alina Smith", 33, Gender.FEMALE, 15000.99),
				new Person(3, "Helen White", 57, Gender.FEMALE, 35000.99),
				new Person(4,"Alex Boz", 18, Gender.MALE, 3440.99),
				new Person(5, "Jamie Goa", 99, Gender.MALE, 2540.99),
				new Person(6, "Anna Cook", 22, Gender.FEMALE, 27000.99),
				new Person(7, "Zelda Brown", 120, Gender.FEMALE, 5000.99)
				).collect(Collectors.toList());
		
	}

}
