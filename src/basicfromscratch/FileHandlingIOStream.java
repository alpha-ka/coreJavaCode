package basicfromscratch;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileHandlingIOStream {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Creating new file and writing data.");
		File f = new File("K://demo.txt");
		FileOutputStream fos = new FileOutputStream(f);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("Demo Content\r\n"	+ "Cursor\r\n" +"\r\n" + 
				"View\r\n" + 
				"\r\n" + 
				"Trigger\r\n" + 
				"\r\n" + 
				"JSON\r\n" + 
				"\r\n" + 
				"XML\r\n" + 
				"\r\n" + 
				"Dynamic table creation\r\n" + 
				"\r\n" + 
				"Bulk insert\r\n" + 
				"\r\n" + 
				"Temp table\r\n" + 
				"\r\n" + 
				"Declare table\r\n" + 
				"\r\n" + 
				"CTE\r\n" + 
				"");
		System.out.println("Read content inside the data.");
		FileInputStream fis = new FileInputStream(f);
		DataInputStream dis = new DataInputStream(fis);
		String Str = dis.readUTF();
	System.out.println(Str);

	}

}
