package basicfromscratch;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class DataconfigFetch {

	public static void main(String[] args)  throws Exception {
		// TODO Auto-generated method stub
		Properties p = new Properties();
		// fetch we have to use Input Stream
		File f = new File("K://DataBaseConfig.properties");
		InputStream is = new FileInputStream(f);//or we can directlt specify file location over here itself
		// for fetch we have to load the data  
		p.load(is);
		System.out.println("MS SQL Server DataBase Configurations");
		System.out.println("URL : "+ p.getProperty("URL"));
		System.out.println("UserName : " + p.getProperty("UserName"));
		System.out.println("Password : " + p.getProperty("Password"));
		// or you can print all the values using list
		p.list(System.out);
		
		
	}

}
