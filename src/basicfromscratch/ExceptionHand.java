package   basicfromscratch;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int i,j,k=0;
 //int a[] = new int[4];
// BufferedReader BR=new BufferedReader(new InputStreamReader(System.in));
 	i=8;
 	System.out.println("Enter a number : ");
 	//j=Integer.parseInt(BR.readLine());//this is checked exception it will fetch string so convert into integer
 	//it mate throw an error
 			try ( BufferedReader BR=new BufferedReader(new InputStreamReader(System.in)))// we don't require any catch/ finally to close the resource 
 			{
 			j=Integer.parseInt(BR.readLine());//
 		 k=i/j;//if anywhere  error occurs it will stop execute below statements
 		System.out.println("Output is " + k);
// 		 for(int c=0;c<4;c++)
// 		 {
// 			 a[c]=c+1;
// 		 }
 		 
 		 
 			}
 		catch(IOException ioe)
 			{
 			System.out.println("Input should be Integer value");
 			}
 			
// 			catch(ArrayIndexOutOfBoundsException e)//catch(ArithmaticException ae)
// 		 	{
// 		 		System.out.println(e);
// 		 		System.out.println("Array Index Out " + e);
// 		 		
// 		 	}
 			catch(ArithmeticException ae)//catch(ArithmaticException ae)
 		 	{
 		 		System.out.println(ae.getMessage());
 		 		System.out.println("Cannot divide by Zero '" + ae+"'");
 		 		
 		 	}
 			catch(Exception e)// it should be at last because it will catch all type of exception 
 			{
 				System.out.println("Unknown Exception");
 			}
 	   finally// it will execute when error occurs or not
 	   {
 		  // BR.close();
 		   System.out.println("BYE");
 	   }
 			
 			//User defined Exception
 			
 			
 			
	}

}
