package   basicfromscratch;
public class thiskey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a=new A1(5);
		System.out.println(a.get());
	}

}

class A1
{
	static int x;//instance variable
	
	public A1(int x)//local variable
	{
		this.x=x;//current to use this keyword will help to access
	}
public int get()
{
	return x;
	}
}