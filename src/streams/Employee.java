package streams;


public class Employee{
	private long id;
	private String name;
    private long salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(long id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
    
	
	@Override
	public boolean equals(Object obj) {
 
		if(obj instanceof Employee)
		{
			return ((Employee) obj).getId()==getId() &&  ((Employee) obj). getName()==getName();
		}
		return false;
	}
    
   @Override
public int hashCode() {
	// TODO Auto-generated method stub
	return (int) this.getId();
}
 
}