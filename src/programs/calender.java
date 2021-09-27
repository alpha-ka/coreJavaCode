package programs;


	import java.util.*;

	public class calender
	{
	public static void main(String args[])
	{
	Date d = new Date();
	System.out.println(d);
	System.out.println(d.getYear());
	System.out.println(d.getMonth());
	System.out.println(d.getDate());

	System.out.println("----------------------------------------------------");

	Calendar d1 = Calendar.getInstance();
	System.out.println(d1.get(d1.DATE));
	System.out.println(d1.get(d1.MONTH));
	System.out.println(d1.get(d1.YEAR));
	System.out.println(d1.get(d1.HOUR));
	System.out.println(d1.get(Calendar.MINUTE));
	System.out.println(d1.get(Calendar.SECOND));

	System.out.println("--------------------------------------------------");

	d1.set(d1.YEAR , 2003);
	d1.set(d1.MONTH,5);
	d1.set(d1.DATE,25);

	System.out.println(d1.get(Calendar.DAY_OF_WEEK));
	System.out.println(d1.get(Calendar.DAY_OF_YEAR));
	System.out.println(d1.get(d1.DATE));
	System.out.println(d1.get(d1.MONTH));
	System.out.println(d1.get(d1.YEAR));

	System.out.println("-------------------------------------------------");

	GregorianCalendar g = new GregorianCalendar();
	System.out.println(g.get(Calendar.YEAR));
	System.out.println(g.get(Calendar.MONTH));
	System.out.println(g.get(Calendar.DATE));
	System.out.println(g.isLeapYear(2000));
	System.out.println(g.isLeapYear(2005));
	System.out.println(g.after(d1));
	System.out.println(g.before(d1));
	}
	}
