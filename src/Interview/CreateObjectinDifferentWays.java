package Interview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class CreateObjectinDifferentWays   {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException, IOException {
		// TODO Auto-generated method stub
		
		
		//Create object in normal way with new key word
		System.out.println("Different ways of creating object");
		System.out.println();
		System.out.println("1.\tCreate object using 'new' key word");
		Human human=new Human();
		System.out.println(human.print());
		
		//Create object with newInstance method that is exists class called "Class"
		System.out.println("******************************************************************");
		System.out.println("2.\tCreate object using newInstance method of class called 'Class'");
		
		Human human2=(Human) Class.forName("Interview.Human").newInstance();
		
		
		System.out.println(human2.print());
		System.out.println("******************************************************************");
		System.out.println("\t\tAnither way of Creating object with newInstance method that is exists class called 'Class'");
		//another way to load class
		Human humanx=Human.class.newInstance();
		System.out.println(humanx.print());
		
		
		//Creating object using newInstance() method of constructor class
		System.out.println("******************************************************************");
		System.out.println("3.\tCreating object using newInstance() method of constructor class ");
		Constructor<Human> constructor=  Human.class.getConstructor();
		Human human3=constructor.newInstance();
		
		System.out.println(human3.print());
		
		
		System.out.println("******************************************************************");
		System.out.println("4.\tCreating new object using clone method ");
		
		
		human.get(1, "Alpha");
		System.out.println(human.str+" "+human.value);
		
		
		
		System.out.println("\t\tAfter clone method ");
		
		Human human4=(Human) human.clone();
		
		
		System.out.println(human4.str+" "+human4.value);
		System.out.println(human4.print());
		System.out.println("\t\tNote: Class constructor doesn't get call");
		 
		
		System.out.println("******************************************************************");
		System.out.println("5.\tCreating new object using deserialization ");
		
		System.out.println("\t\tSerailization (not required just for reference) ");
		
		FileOutputStream fos=new FileOutputStream("text.txt");//filename
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Human human5=new Human(2,"Anish");
		oos.writeObject(human5);
//		
		
		System.out.println("\t\tDeSerailization ");
		
		FileInputStream fis=new FileInputStream("text.txt");//without creating object file then we can't implement this
		ObjectInputStream ois=new ObjectInputStream(fis);
		//needs type casting
		Human human6=(Human) ois.readObject();
		
		System.out.println(human5.str+" "+human5.value);
		
		System.out.println(human5.print());
		
				
		

	}

}
