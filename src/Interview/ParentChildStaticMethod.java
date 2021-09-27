package Interview;

//Static methods can be Overloaded but can't be overridden it always calls Base class method
//Base Class 
class Parent2{
	
	static void run()
	{
		System.out.println("I'm in Parent class");
	}
	static void run(int i)
	{
		System.out.println("I'm in Parent class"+ i);
	}
}
///Drived Class
 class Child2 extends Parent2{
		
	static void run()
	{
		System.out.println("I'm in Child class");
	}
	
}

public class ParentChildStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent2 p=new Child2();
		p.run();
	}

}
