package programs;
import java.util.*;

public class larg2nd {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number:");
		int n=scan.nextInt();	int  count;
		  for (int i = 1; i <= n; i++)
		 {  //n =20
		   count = 0;
		   for (int j = 2; j <= i / 2; j++) 
		  {//i=7  2<=3
		    if (i % j == 0) 
		   {//2%3
		     ++count;
		     break;
		    }   }
		   if (count == 0) {
		    System.out.println(i);
		   }}
		count=0;
		Scanner scann = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n1 = scann.nextInt();
		for (int i=2;i<= n1/2;++i)
		{if(n1%i==0)
				{
				++count;
				break;		}
		}
		if (count==0) {
		    System.out.println("prime");}
		else
		{	System.out.print("not prime");   }
	}
}
