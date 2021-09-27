package programs;
import java.util.Scanner;
public class Employee {
	 private String empname;
	 private String job;
	 private int empno;
	 private int salary;
	public void setEmpname(String empname){
		this.empname=empname;
	}
	public void setEmpno(int empno){
		this.empno=empno;
	}
	public void setJob(String job){
		this.job=job;
	}
	 public void setSalary(int salary){
		 this.salary=salary;
	 }
	 public String getEmpname(){
		 return empname;
	 }
		public int getEmpno(){
			return empno;
		}
		public String getJob(){
			return  job;
		}
		 public int getSalary(){
			 return salary;
	}
}
