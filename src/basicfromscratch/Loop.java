package   basicfromscratch;
import java.util.Random;

public class Loop {
public static void main(String args[])
{
	int i =1;
	while(i<10)
	{
		System.out.print(i);
		i++;
	}
	System.out.println("i = "+i);
	while(i<10)
	{
		System.out.println("while="+i);
	}
	do {
		System.out.println("do...while="+i);
	}while(i<10);
	
	//unlebelled break
	
	
	for (i=1;i<=4;i++)
	{
		for(int j=1;j<=4;j++)
		{
			System.out.print("* ");
		}
		System.out.println("");
	}
	System.out.println("with break & without lebelled");
	for (i=1;i<=4;i++)
	{
		for(int j=1;j<=4;j++)
		{
			//System.out.print("1");
			if(i%2==0)
			break;
			System.out.print("* ");
		}
		System.out.println("");
	}
	
	//lebelled break
	System.out.println("with break & with lebelled");
	alpha:
	for (i=1;i<=4;i++)
	{
		for(int j=1;j<=4;j++)
		{ if(i%2==0)
			break alpha;//whole session stopped with lebbelled to terminate outer session we have to use break with label
			System.out.print("* ");
		}
		System.out.println("");
	}
	System.out.println("done");
	//Enhanced for loop
	int value[]= {1,3,6,2,4};
	for(int j=0;j<value.length;j++)
	{
		System.out.print(value[j]+" ");
	}
	//Enhanced for loop
	System.out.println("");
	System.out.println("Enhanced for loop");
	for(int j:value) {
		System.out.print(j);
		
	}
	System.out.println("");
	System.out.println("Random Value");
	//Random value
	Random r = new Random();
	int z[]=new int[50];
	for (int j=0;j<z.length;j++)
	{
		z[j]=r.nextInt(50);
	}
	
	System.out.println("Array Index Out of Bound");
	try{
		System.out.println(z[52]);
	}catch(Exception e)
	{
		System.out.println("Maximum array is 49");
	}
	for(int j:z)
	{
		System.out.print(j+" ");
	}
	System.out.println("");
	System.out.println("Array Index Out of Bound");
	}
}
