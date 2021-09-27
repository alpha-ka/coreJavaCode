package basicfromscratch;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class DataConfig {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// to config any value with key we use properties
		
		Properties p = new Properties();// it has key and value format
		//to create a file we need outputstream its abstract class and
		//mention file direct or we can create object for file class
		
		OutputStream os = new FileOutputStream("K://DataBaseConfig.properties");
		// first we need to specify key and value using Set
		
		p.setProperty("URL", "localhost:1433/Alpha");
		p.setProperty("UserName", "alphaka");
		p.setProperty("Password", "Skylalpha1");
		//for storing we use store
		
		p.store(os,null);
		
		

	}

}
