package programs;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
public class createfile {
public static void main(String[]str)
{
//java feel difficult to search file so give 2 blackslash for that make easy to search
	File doc=new File("G:\\Qspiders\\JAVA notes\\alpha.txt");
//doc is object name assume doc=file its alpha.txt  file/doc like that 
	try {
			if(!doc.exists())//if not exsist it will create new
			{
				doc.createNewFile();
		} 
		PrintWriter pw=new PrintWriter(doc);
		Date date=new Date();
	
		pw.println("Hi!This is my World");
		pw.println("Contact us");
		pw.println(date);
		pw.print(78457);
		
		pw.print(50214);
		pw.close();
		//when create file we must close it in end so obj.close();
		}	
		catch (IOException e) {
			e.printStackTrace();
		}
	}}
