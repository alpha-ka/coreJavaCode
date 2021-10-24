package Interview;
import java.util.Scanner;
import java.util.regex.*;

public class Emailregex {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    String str=scan.next();
    boolean b=false;
    b=Pattern.matches("[a-zA-Z0-9.-]+@[a-zA-Z0-9]+.[a-zA-Z0-9]{3}",str);
    if(b){
    System.out.println("Gmail Valid");
    }
    else{
    	System.out.println("Not Valid");
    	
    }
    }
	

}
