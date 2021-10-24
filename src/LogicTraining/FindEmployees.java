package LogicTraining;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindEmployees {
	
	
	public static void main(String args[])
	{
		List<Map<String, Object>> employees=new ArrayList<Map<String,Object>>();
		
		Map<String, Object> emp=new HashMap<String, Object>();
		emp.put("id", 1);
		emp.put("name", "Alpha K A");
		emp.put("age", 23);
		emp.put("email", "alphaka94@gmail.com");
		
		employees.add(emp);
		
		
		Map<String, Object> emp2=new HashMap<String, Object>();
		emp2.put("id", "2");
		emp2.put("name", "Test 2");
		emp2.put("age", 25);
		emp2.put("email", "test2@gmail.com");
		
		employees.add(emp2);
		
		Map<String, Object> emp3=new HashMap<String, Object>();
		emp3.put("id", "3");
		emp3.put("name", "Test 3");
		emp3.put("age", 18);
		emp3.put("email", "test3@gmail.com");
		
		employees.add(emp3);
		
		
		Map<String, Object> emp4=new HashMap<String, Object>();
		emp4.put("id", "4");
		emp4.put("name", "Test 4");
		emp4.put("age", 60);
		emp4.put("email", "test4@gmail.com");
		
		employees.add(emp4);
		
		
		Map<String, Object> emp5=new HashMap<String, Object>();
		emp5.put("id", "5");
		emp5.put("name", "Test 5");
		emp5.put("age", 56);
		emp5.put("email", "test5@gmail.com");
		
		employees.add(emp5);
		
		Map<String, Object> emp6=new HashMap<String, Object>();
		emp6.put("id", "55");
		emp6.put("name", "Test 6");
		emp6.put("age", 17);
		emp6.put("email", "test6@gmail.com");
		
		employees.add(emp6);
		Map<String, Object> emp7=new HashMap<String, Object>();
		emp7.put("id", "7");
		emp7.put("name", "Test 7");
		emp7.put("age", 13);
		emp7.put("email", "test7@gmail.com");
		
		employees.add(emp7);
		
		
		List<String> ids=new ArrayList<String>();
		ids.add("2");
		ids.add("5");
		
		
		for(Map<String, Object>  employee :employees)
		{
			boolean show=false;
			for(Map.Entry<String, Object> data:employee.entrySet())
			{
				if(data.getKey().equals("id") && ids.contains(data.getValue()))
				{
					show=true;
				}
				
			}
			if(show)
			{
				System.out.println(employee);
			}
		}
		
		
//employees.stream()
//		   .filter(employee -> employee.entrySet().stream().anyMatch(map -> map.getKey().equals("id") && ids.contains(map.getValue())))
//			.forEach(System.out::println);
		
	}

}
