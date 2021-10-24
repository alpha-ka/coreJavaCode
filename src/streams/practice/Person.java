package streams.practice;

public class Person {
	
	  private final int id;
	  private final String name;
	  private final int age;
	  private final Gender gender;
	  private final Double Salary;
	
	 
	public Person(int id, String name, int age, Gender gender, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		Salary = salary;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Gender getGender() {
		return gender;
	}
	public Double getSalary() {
		return Salary;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", Salary=" + Salary
				+ "]";
	}
	  
	  

}
