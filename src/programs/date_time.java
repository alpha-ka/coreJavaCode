package programs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date_time {

	public static void main(String[] args) {
Date date=new Date();
System.out.println(date);
System.out.println(date.toString());
//milliesecind from the january 1 1970
System.out.println(date.getTime());
System.out.println(date.getDate());//date
System.out.println(date.getDay());//daymeans 0S,1M,2T,3W,4T,5F,6S
System.out.println(1+date.getMonth());
//month stored in index like 0-11 so sep comes in 8
System.out.println(1900+date.getYear());
//year display after 1900 so we 1900 when we print year
System.out.println(date.getHours());//hour
System.out.println(date.getMinutes());//minute
System.out.println(date.getSeconds());//second
System.out.println(date.getTimezoneOffset());//timezone
//date to string format
SimpleDateFormat sdf =new SimpleDateFormat("w W E dd M Y yy"
		+ " yyyy/MM/dd F u HH:MM:SS a");
String stringformat=sdf.format(date);
System.out.println(stringformat);
//string to date format
SimpleDateFormat df =new SimpleDateFormat("w W E dd M Y yy"
		+ " yyyy/MM/dd F u HH:MM:SS a");
try {
	date=df.parse(stringformat);
	System.out.println(date);
} catch (ParseException e) {
	e.printStackTrace();
}


	}

}
