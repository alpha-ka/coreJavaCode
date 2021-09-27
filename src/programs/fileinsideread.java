package programs;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class fileinsideread {
	public static void main(String[] args) {
		 BufferedReader br=null;
try {
   br=new BufferedReader(new FileReader("G:\\Qspiders\\JAVA notes\\alpha.txt"));
	String line;
   while((line=br.readLine())!= null)
	{
		System.out.println(line);	
	}	
} catch (IOException e) {
	e.printStackTrace();
}
finally
{
try {
	br.close();
} catch (IOException e) {
	e.printStackTrace();
}	
}
}}
