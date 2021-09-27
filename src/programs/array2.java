package programs;

import java.util.Arrays;
import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int firstarrsize=scan.nextInt();
		System.out.println("Enter the size of second array");
		int secondarrsize=scan.nextInt();
		int arr1[] = new int[firstarrsize+secondarrsize];
		int arr2[] = new int[secondarrsize];
		System.out.println("Enter the first array values\n");
		for(int i=0;i<firstarrsize;i++)
{
	arr1[i]=scan.nextInt();
	}
		System.out.println("Enter the second array values\n");
		
		for(int i=0;i<secondarrsize;i++)
		{
			arr2[i]=scan.nextInt();
			}	
		int k = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			
			if(i>=firstarrsize){
				arr1[i]=arr2[k];
				k++;
			}
		}
	System.out.println(Arrays.toString(arr1));
		}
		
	}
