package Interview;

public class VarArg {

	 static public void main(String ... args)//Varargs and main method in different way 
	 {
		// TODO Auto-generated method stub
		Display d=new Display();
		d.show(5,7,2,3);
		
			}
	
}
class Display
{
	void show(int ... a)
	{
		for( int i:a)
		{
		System.out.println(i);
		}
		}
}
