package streams;

import java.util.List;

public class Department {
	
	private long id;
	private String name;
	private long EmpId;
	 
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	


	
	public Department(long id, String name, long empId) {
		super();
		this.id = id;
		this.name = name;
		EmpId = empId;
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





	public long getEmpId() {
		return EmpId;
	}





	public void setEmpId(long empId) {
		EmpId = empId;
	}





	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", EmpId=" + EmpId + "]";
	}
	
	

}
