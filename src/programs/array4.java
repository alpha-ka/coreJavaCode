package programs;

import java.util.Scanner;

public class array4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of Employees:");
		int n = scan.nextInt();
		int empno[] = new int[n];
		int sal[] = new int[n];
		String empname[] = new String[n];
		String job[] = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the Employee No:");
			empno[i] = scan.nextInt();
			System.out.print("Enter the Employee Name:");
			empname[i] = scan.next();
			System.out.print("Enter the job:");
			job[i] = scan.next();
			System.out.print("Enter the Salary:");
			sal[i] = scan.nextInt();
		}
		String tit[] = { "Emp.No", "Emp.Name", "Job", "Salary" };
		int temp = 0, temp1 = 0;
		String st1, st2;
		System.out.println(tit[0] + " " + tit[1] + "   " + tit[2] + "\t\t"
				+ tit[3]);
		for (int i = 0; i < n; i++) {
			System.out.println(empno[i] + "\t" + empname[i] + "\t" + job[i]
					+ "\t" + sal[i]);
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (sal[i] > sal[j]) {
					temp = sal[i];
					sal[i] = sal[j];
					sal[j] = temp;
					temp1 = empno[i];
					empno[i] = empno[j];
					empno[j] = temp1;
					st1 = empname[i];
					empname[i] = empname[j];
					empname[j] = st1;
					st2 = job[i];
					job[i] = job[j];
					job[j] = st2;
				}
			}
		}
		System.out.println(tit[0] + " " + tit[1] + "   " + tit[2] + "\t\t"
				+ tit[3]);
		for (int i = 0; i < n; i++) {
			System.out.println(empno[i] + "\t" + empname[i] + "\t" + job[i]
					+ "\t" + sal[i]);
		}
	}
}
