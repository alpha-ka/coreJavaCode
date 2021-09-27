package programs;

import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;
public class Empdata {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Total Number of Employees:");
		int n=scan.nextInt();
	Employee emparr[]=new Employee[n];
	TreeMap<Integer, String> tmap=new TreeMap<Integer , String>();
	for (int i = 0; i < emparr.length; i++) {
		emparr[i]=new Employee();
		System.out.print("Employee No:");
		emparr[i].setEmpno(scan.nextInt());
		System.out.print("Employee Name:");
		emparr[i].setEmpname(scan.next());
		System.out.print("Job:");
		emparr[i].setJob(scan.next());
		System.out.print("Salary:");
		emparr[i].setSalary(scan.nextInt());
	}		
	System.out.println("EMPNO"+"\t"+"EMPNAME"+"\t"+"JOB"+"\t"+"SALARY");
	for (int i = 0; i < emparr.length; i++) {
		System.out.println(emparr[i].getEmpno()+"	"+emparr[i].getEmpname()+"	"+emparr[i].getJob()+"	"+emparr[i].getSalary());
		tmap.put(emparr[i].getSalary(),emparr[i].getEmpname());	
	  //tmap.put(emparr[i].getEmpno(),emparr[i].getEmpname());	
	}
	NavigableMap<Integer, String> nmap=tmap.descendingMap();
	System.out.println(nmap);
	}
}
