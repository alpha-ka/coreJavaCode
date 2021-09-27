package programs;

import java.io.IOException;

public class Throws {

	static void watch(String str) throws IOException{
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			watch("Java");
			} 
		catch (IOException e)// object created
			{
				e.printStackTrace();
			}
	}

}
