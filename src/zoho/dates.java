package zoho;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class dates {

	public static void main(String[] args) throws ParseException {
//		int d = 0, m = 0, y = 0, s = 0, n = 0;
//		Date dat = new Date();
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter the date:");
//		d = scan.nextInt();
//		dat.setDate(d);
//		System.out.println("enter the month:");
//		m = scan.nextInt();
//		dat.setMonth(m - 1);
//		System.out.println("enter the year:");
//		y = scan.nextInt();
//		dat.setYear(y - 1900);
//		System.out.println("add days to see which working day it is: ");
//		n = scan.nextInt();
//		System.out.println(dat);
//		for (int i = 0; i < n; i++) {
//			d = d + 1;
//			dat.setDate(d);
//			s = dat.getDay();
//			if (s == 6) {
//				d = d + 2;
//				dat.setDate(d);
//			} else if (s == 0) {
//				d = d + 1;
//				dat.setDate(d);
//			}
//
//		}
//		 
//		System.out.println(dat);
//		System.out.print(dat.getDate()+"/" + (dat.getMonth() + 1)+"/" + (dat.getYear() + 1900));
		
		
//		 String sDate3 = "12/31/1998";       
// 	DateFormat format = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
// 	Date date = format.parse(sDate3);
// 	System.out.println(date+" "+new Date());
// 	
// 			
// 		 	SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy",Locale.ENGLISH);
// 		 	String startDate = "20-02-2021";
// 			String endDate   = "23-02-2021";
// 		 	
// 		 	Date startdateformatted=dateformat.parse(startDate);
// 		 	Date enddateformatted=dateformat.parse(endDate);
//  
// 			long duration  = enddateformatted.getTime() - startdateformatted.getTime();
//
// 			long diffInSeconds = TimeUnit.MILLISECONDS.toSeconds(duration);
// 			long diffInMinutes = TimeUnit.MILLISECONDS.toMinutes(duration);
// 			long diffInHours = TimeUnit.MILLISECONDS.toHours(duration);
// 			long diffInDays = TimeUnit.MILLISECONDS.toDays(duration);
// 	
// 		 
// 			long noofdays1 = TimeUnit.MILLISECONDS.toDays(duration);
// 			int noofdays2 = (int) TimeUnit.MILLISECONDS.toDays(duration);
// 			System.out.println(noofdays1+" "+noofdays2);
// 			
		 
		String dob = "2021-02-27";
	 
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2=new SimpleDateFormat("MM/dd/yyyy");
	 
		String dateofbirth = sdf2.format(sdf1.parse(dob));
 	 
 System.out.println(dob);
 System.out.println(dateofbirth);
	 
		
	 
	}

}
