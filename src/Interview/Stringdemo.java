package Interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Char and String
		
		String so="Alpha";
		System.out.println("First Name : "+so);
		System.out.println("-------------charAt(3)----------");
		char c=so.charAt(3);
		System.out.println(c);
		System.out.println("------------length()-----------");
		System.out.println(so.length());
		String so2=" K A";
		System.out.println("Last Name : "+so2);
		System.out.println("------------concat()-----------");
		String name=so.concat(so2);
		System.out.println(name);
		
		System.out.println("------------toCharArray() -> String to char-----------");
		char c1[] =so.toCharArray();
		System.out.println("------------Arrays.toString(c)-----------");
		System.out.println(Arrays.toString(c1));
		System.out.println("------------Character.toString() -> Char to String-----------");
		String newso=Character.toString(c);
		System.out.println(newso);
		System.out.println("------------new String(char)-> Char array to String----------");
		String newso2=new String(c1);
		System.out.println(newso2);
		
		System.out.println("------------new String(char,start,end)-> Char to String with substring----------");

		String newso3=new String(c1,2,2);
		System.out.println(newso3);
		
		System.out.println("------------compare() string not immportant----------");
		
		System.out.println(so+" compare "+ so2+" "+so.compareTo(so2));
		
		System.out.println("------------contains() string important----------");
		
		System.out.println(newso2+" contains "+ newso+" "+newso2.contains(newso));
		
		String no="1,2,2,3,3,4";		
		System.out.println("------------split() string important----------");
		System.out.println(no);
		String[] strarr=no.split(",");
		
		System.out.println(Arrays.toString(strarr));
		
		System.out.println("------------toLowerCase()----------");
		newso2=newso2.toLowerCase();
		System.out.println(newso2);
		System.out.println("------------indexOf()&lastIndexOf() ---------");
		System.out.println("index of a in "+newso2+" is "+newso2.indexOf('a'));
		System.out.println("last index of a in "+newso2+" is "+newso2.lastIndexOf('a'));
		
		System.out.println("------------toUpperCase()----------");
		newso2=newso2.toUpperCase();
		System.out.println(newso2);
		
		
		Integer obj = new Integer(10);
		System.out.println("------------Integer to String----------");
		String strint=obj.toString();
		System.out.println("Integer is 10 to string : "+strint);
		
		System.out.println("------------replace()----------");
		String replace = newso2.replace('A', 'O');		
		System.out.println(replace);
		
		System.out.println("------------substring()----------");
		String substr = newso2.substring(1,3);
		System.out.println(substr);		
		
		
		
		System.out.println("------------reverse() string doesn't  have so Stringbuffer will do----------");
		
		StringBuffer sb=new StringBuffer(newso2);
		System.out.println(sb.reverse());
		
		System.out.println("-----------Join list of Strings---");
		List<String> listStr=Arrays.asList("Banana","Apple","Mango","Orange");
		System.out.println(listStr.toString());
		
		String charBwn="";
		String joined=String.join(charBwn, listStr);
		System.out.println(joined);
		System.out.println("-----------String isEmpty---");
		String test0="";
		System.out.println(test0.isEmpty());
		System.out.println("-----------String startsWith()---");
		String test="Alpha";
		System.out.println(test +" starts with A? "+test.startsWith("A"));
		
		System.out.println(test +" starts with T? "+test.startsWith("T"));
		System.out.println("-----------String endsWith()---");
		
		System.out.println(test +" ends with A? "+test.endsWith("A"));
		
		System.out.println(test +" ends with a? "+test.endsWith("a"));
		
		System.out.println("---------------String Join()-------------------");
		
		String [] more={"I","Love","you"};
		
		String more1= String.join(" ", more);
		System.out.println(more1);
		
		System.out.println("---------------String valueOf(int)-------------------");
		int value=30;  
		String s13=String.valueOf(value);  
		System.out.println(s13);
		System.out.println("------------------------toCharArray()--------------------------------");
		char c3[]=more1.toCharArray();
		System.out.println(Arrays.toString(c3));
		
		System.out.println("--------------------------char array to String------------------------------------");
		   char[] arr = { 'p', 'q', 'r', 's' };
		      String d44=String.valueOf(arr);
		      System.out.println(d44);
		
		//String s1,s2;
//		
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); it is also for user input
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter two strings : ");
//		s1=sc.nextLine();
//		s2=sc.nextLine();
//		//step1 length
//		System.out.printf("string length for both %s & %s\n",s1.length(),s2.length());
//		//step 2 concat
//		String s3=s1.concat(s2);
//		System.out.println("with concat method is : "+s3);
//		s3=s1+" "+s2;
//		System.out.println("Normal concat : " + s3);
//		//Step 3 uppercase
//		s1=s1.toUpperCase();
//		System.out.println(s1);
//		s2=s2.toLowerCase();
//		System.out.println(s2);
//		System.out.println("Comma separated values");
//		String str="Alpha,KA,Abraham";
//		String str1[]=str.split(",");
//		
//		System.out.println(Arrays.toString(str1));
//		
//		for(String val : str1)
//		{
//			System.out.println(val);
//		}
		//str1.forEach(val -> System.out.println(val));


//--------------Create enclosed with double quotes
		System.out.println("String Immutable");
	String s1="Alpha";//Stores in String Constant pool with hashcode 
	String s2="Alpha";//checks in String constant pool and it refers same object of the same string
	 
	System.out.println(s1==s2);
	System.out.println("s1 -> "+s1+ " -> " +s1.hashCode());
	System.out.println("s2 -> "+s2+ " -> " +s2.hashCode());
	String s3=s1;
	System.out.println("s3 -> "+s3+ " -> " +s3.hashCode());
	s1="Alpha K A";
	s2="Alpha K A";
	System.out.println("s1 -> "+s1+ " -> " +s1.hashCode());
	System.out.println("s2 -> "+s2+ " -> " +s2.hashCode());
	System.out.println("s3 -> "+s3+ " -> " +s3.hashCode());
	
	s1="Alpha";
	System.out.println("s1 -> "+s1+ " -> " +s1.hashCode());
	
	
	String h1="hello";
	System.out.println("h1 -> "+h1+ " -> " +h1.hashCode());
	String h2=h1;
	System.out.println("h2 -> "+h2+ " -> " +h2.hashCode());

	h1="alpha";
	System.out.println("h1 -> "+h1+ " -> " +h1.hashCode());
	String h3=h2;
			System.out.println("h3 -> "+h3+ " -> " +h3.hashCode());
	
			//Important hashcode is same for both h1 and h2
	h1="FB";
	h2="Ea";
	System.out.println("h1 -> "+h1+ " -> " +h1.hashCode());
	
	System.out.println("h2 -> "+h2+ " -> " +h2.hashCode());

System.out.println(h1==h2);//false
			
////-------------Create string object with new key word
//			
//
String str=new String("Alpha") ;//String Object stores in Heap memory
System.out.println("str -> "+str+ " -> " +str.hashCode());
String str3="Alpha";//String object stores in String constant pool memory			
System.out.println("str3 -> "+str3+ " -> " +str3.hashCode());
System.out.println(str==str3);//string in Heap memory == SCP memory so false

String str6="Alpha";
System.out.println(str6==str3);//SCP object == Scp object so iti's true


String str1=new String("Alpha").intern();//Instead of creating object in heap memory using intern we can use SCP object of same string 

System.out.println(str3==str1);//SCP memory === SCP memory
System.out.println("str1 -> "+str1+ " -> " +str1.hashCode());
str1.concat("K A");//it won't change the str1 value instead it create new object with unknown so it goes garbage belowe is example
String s=str1.concat("K A");
System.out.println("str1 -> "+str1+ " -> " +str1.hashCode());
System.out.println("Concat string create new state of the string -> "+s+ " -> " +s.hashCode());
System.out.println("String is immutable");
System.out.println();
System.out.println("With String Buffer/Builder we can overcome from string immutable. String Buffer is thread safe(Syncronized)");
StringBuffer str2=new StringBuffer("Alpha");
System.out.println("str2 -> "+str2+ " -> " +str2.hashCode());
str2.append(" K A");
System.out.println("str2 -> "+str2+ " -> " +str2.hashCode());
str2.replace(0, 5, "ALPHA K A");
System.out.println("str2 -> "+str2+ " -> " +str2.hashCode());
str2.delete(5, 9);
System.out.println("str2 -> "+str2+ " -> " +str2.hashCode());



// 
//
//
//Java 8 String join() below statement is import array and arraylist initialize
 
String strarray[]={"Alpha","is","a","Software Engineer"};
//or
//String strarray[]=new String[]{"Alpha","is","a","Software Engineer"};
List<String> list=Arrays.asList(strarray);
System.out.println(list);
String output=String.join(" ", strarray);

System.out.println(output);
////
//////Java 9 String Methods 
////
//String s2 = "ABCD";
//
//s2.codePoints().forEach(x -> System.out.println(x));
//
//s2.chars().forEach(x -> System.out.println(x));
////
////
//////Java 11 features & methods
////// isBlank()
////String s0 = "abc";
////System.out.println(s0.isBlank());
////s0 = "";
////System.out.println(s0.isBlank());
////
////// lines()
////String s11 = "Hi\nHello\rHowdy";
////System.out.println(s11);
////List lines = s11.lines().collect(Collectors.toList());
////System.out.println(lines);
////
////// strip(), stripLeading(), stripTrailing()
////String s12 = "                                 Java,      \t Python\t           ";
////System.out.println("#" + s12 + "#");
////System.out.println("#" + s12.strip() + "#");//it will remove white space left trim and right trim
////System.out.println("#" + s12.stripLeading() + "#");//left trim
////System.out.println("#" + s12.stripTrailing() + "#");//right trim
////
////// repeat()
////String s13 = "Hello\t";
////System.out.println(s13.repeat(3));
////s13 = "Co";
////System.out.println(s13.repeat(2));
//
//String substr="Java";
//
////Substring with inbuild method
//String substr2=substr.substring(1,3);
//System.out.println(substr2);
//
////substring with my own method
//char value[] =substr.toCharArray();
//int begin=1;
//int end=3;
//String substr3=new String (value,begin,end-begin);
//System.out.println(substr3);

}

 

}

			
	 

