package streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee emp=new Employee(1, "Sathish", 25735);
		Employee emp2=new Employee(2, "Alpha K A", 15735);
		Employee emp3=new Employee(2, "Alpha K A", 10735);
		
		Employee emp4=new Employee(4, "Anish R", 35735);
		
		List<Employee> listEmps=new ArrayList<Employee>();
		listEmps.add(emp);
		listEmps.add(emp2);
		listEmps.add(emp3);
		listEmps.add(emp4);
		
		listEmps.stream().forEach(i->System.out.println(i));
		HashSet<Employee> hashSet = new HashSet(listEmps);      // create has set. Set will contains only unique objects
	       System.out.println("Employee List(Unique)");
	       for (Employee employee : hashSet) {
	           System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getSalary());
	       }
	       
	       
	       listEmps.stream().distinct().forEach(i->System.out.println(i));
	       
	}

}
