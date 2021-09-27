package basicfromscratch;
import static java.lang.System.out;
//import static importstatic.Alpha.show;

public class statickey {
	static String s;
	//s="Alpha";it gives error
	static {
		s="Alpha";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5;
	//	show(i);
		//s="Alpha";
	out.println("Static value : " + s);	
		
	}

}
