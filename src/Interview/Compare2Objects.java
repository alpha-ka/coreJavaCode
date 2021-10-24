package Interview;

import java.util.Comparator;
import java.util.Objects;

public class Compare2Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Employee e1 = new Employee(100,"Jhon", 30);

	        Employee e2 = new Employee(100,"Jhony", 30);

	        // Compare two employee e1, e2 objects
	        System.out.println( e1.hashCode() + " " +e2.hashCode());

	        boolean isSame = e1.equals(e2);
	        System.out.println(isSame);
	        
	        if(doCompare(e1,e2))
	        {
	        	System.out.println("fine");
	        }
	     
	}
	
 private static boolean doCompare(Employee e1,Employee e2)
		  {
	 	
	 int value=Comparator.comparing(Employee::getId)
			    .thenComparing(Employee::getName)
			    .thenComparing(Employee::getSalary)
			    .compare(e1, e2);
	 
	 
		if(value!=0)
		{
			 return false;
		}
		 return true;

	 
		  }
 

}
