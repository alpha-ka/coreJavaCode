package basicfromscratch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1,s2;
		
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); it is also for user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings : ");
		s1=sc.nextLine();
		s2=sc.nextLine();
		//step1 length
		System.out.printf("string length for both %s & %s\n",s1.length(),s2.length());
		//step 2 concat
		String s3=s1.concat(s2);
		System.out.println("with concat method is : "+s3);
		s3=s1+" "+s2;
		System.out.println("Normal concat : " + s3);
		//Step 3 uppercase
		s1=s1.toUpperCase();
		System.out.println(s1);
		System.out.println("Comma separated values");
		String str="Alpha,KA,Abraham";
		String str1[]=str.split(",");
		for(String val : str1)
		{
			System.out.println(val);
		}
		//str1.forEach(val -> System.out.println(val));
		System.out.println("String Muttable");
		StringBuffer str2=new StringBuffer("Alpha");
		str2.append(" K A");
		str2.replace(0, 5, "ALPHA K A");
		str2.delete(5, 9);
		System.out.println(str2);
		
	}

}
