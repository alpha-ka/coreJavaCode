package Interview;


//primitive data type is faster than wrapper class still why we need? 
//because collection and some framework won't work with primitives 
public class WhyWrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Java has primitive types , eg : int,float ,double,boolean etc. These are not objects. So they cannot be referenced.
//
//1)
//
//To convert simple data types into objects, we need wrapper classes.for an example,

int i = 10;

//here i is not an object, But when we do 

Integer i1 = new Integer(i);//boxing-wrapping
int b = 55;
String str= "45";
// Construct two Integer objects
Integer x = new Integer(b);
Integer y = new Integer(str);
System.out.println(x+" "+y);
//here i1 is an object which value is 10; 

//and here Integer is a wrapper class.
//
//2)
//
// Generics don’t allow us to use primitive as the type parameters.
//for an example in the collection when we use a generic type like below
//
//ArrayList<Integer> a = new ArrayList<Integer>();
//
//Here to make your ArrayList type safe, you are using generic and 
//specifying your ArrayList is only going to store integer value and to represent it you are using of 
//Integer class(Which is a wrapper class, you can’t use primitive data types here, for an example 
//
// Arraylist<int> a = new ArrayList<int>() // compile time error )

//3)
//
//All your wrapper classes are immutable. Like string,all wrapper classes,  cache their hashcode and
//that’s why they are great candidates as a key in the map where frequent hashcode calculation is needed.
//ToKnow more about it, check the below link
//
//https://youtu.be/wytkyBx4JIc
//
//4)
//
//Using wrapper classes we can convert Strings into its respective data types (known as parsing operations), 
//here methods of type parseXXX() are used. For an example 

byte by = Byte.parseByte("10");
System.out.println(by);//Output : 10
 
 int int1 = Integer.parseInt("123");//unboxing - unwarping
 System.out.println(int1);  //Output : 123
// 
//There are so many other benefits that we get from wrapper classes as well.I will cover it in my upcoming tutorial.
//
//Thank you,for posting a comment.Have a nice day!!

	}

}
