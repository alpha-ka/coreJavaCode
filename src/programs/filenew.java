package programs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filenew {

	public static void main(String[] args) {
FileWriter file= null ;
try {
	file=new FileWriter("F:\\alpha\\alpha1.txt");

file.write("hi");	
file.flush();
}
 catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
finally{
	try {
		file.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
}