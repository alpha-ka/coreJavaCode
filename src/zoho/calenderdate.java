package zoho;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class calenderdate {

	public static void main(String[] args) {
		int d=0,m=0,y=0,n=0,e=0;
		Date dat = new Date();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the date:");
		d = scan.nextInt();
		dat.setDate(d);
		System.out.println("enter the month:");
		m = scan.nextInt();
		dat.setMonth(m-1);
		System.out.println("enter the year:");
		y = scan.nextInt();
		dat.setYear(y-1900);
		System.out.println(dat+""+dat.getDay());
		
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(dat);
		System.out.println(cal.getTime());
		System.out.println("add days to see which working day it is: ");
		n = scan.nextInt();
		e=cal.get(Calendar.DAY_OF_WEEK );
		System.out.println(e);
		for (int i = 0; i < n; i++) {
			cal.add(Calendar.DATE,1);
			 e=cal.get(Calendar.DAY_OF_WEEK);
			if ( e== 7) {
				cal.add(Calendar.DATE,2);
			} else if (e  == 1) {
				cal.add(Calendar.DATE,1);
			}
	}
		System.out.println(cal.getTime());
}}
