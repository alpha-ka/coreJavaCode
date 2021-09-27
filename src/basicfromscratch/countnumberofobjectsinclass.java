package   basicfromscratch;

public class countnumberofobjectsinclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1=new A();
		A a2=new A();
		A a3=new A();
		a1.count();
	}

}

class A
{
static int i;
//int i while creating new object it will depend on object
//so it will become zero each time instead use static it depends on class
public A(){
	i++;
	
}
public void count()
{System.out.println("Number of object in a class "+i);
	}

}
