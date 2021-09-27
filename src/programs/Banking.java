package programs;
import java.io.IOException;
import java.lang.Exception;

public class Banking {
	static int balance=500;
	 static void withdrawal(int amt)throws IOException{
		if(balance<amt)
		{
		//NoBalanceException ref =new NoBalanceException("No Avai Balance");
		}
		else{
			System.out.println("Amount withdrawan");
		}
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	try{
	withdrawal(100);
	}
	catch (IOException e){
		e.printStackTrace();
	}
		}

}


 
