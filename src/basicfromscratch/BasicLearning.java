package   basicfromscratch;
public class BasicLearning {
	public static Double multiply(double a, double b)
{
return a*b;		
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5; //4byte
		float f=5.5f;  //8byte
		double d=5.5;  //16byte
		char c='A'; //2byte
System.out.println("Println "+a+" - "+f+" - "+d+" - "+c);
System.out.printf("Printf %d %f %f %c \n",a,f,d,c);

System.out.println((int)c);//cast converting to int getting ASCII vallue
System.out.println(multiply(5.5,6.5));
//short hand operator
byte b =8;
//b=b*2.5;//it occurs error double to byte but can overcome with short hand
b*=2.5;
System.out.println("Double to byte ="+b);
int z=1522222222;
	z=999999999;
System.out.println(z);
int i=5;
//int j=i++;-->Post increment j=5
//int j=++i;-->Pre increment j=6
i=i++;
System.out.println(i);
//Boolean
boolean bo=true;
System.out.println(bo);
bo = !bo;
System.out.println(bo);
// Ternary Operator
i=1;
int j;
//if (i==1)
//	j=6;
//else 
//	j=7;
j=i==1?6:7;
System.out.println(j);

//Bitwise Operator
String binary[] = {
        "0000",
        "0001",
        "0010",
        "0011",
        "0100",
        "0101",
        "0110",
        "0111",
        "1000",
        "1001",
        "1010",
        "1011",
        "1100",
        "1101",
        "1110",
        "1111"
    };
a=6;
b=7;
int k = a | b;
int l = a & b;
int m = a ^ b;
int n = (~a & b) | (a & ~b);
int g = ~a & 0x0f;

System.out.println("a="+binary[a]+" b="+binary[b]);
System.out.println("OR-> a | b ="+binary[k]);
System.out.println("AND-> a & b = "+binary[l]);
System.out.println("Exclusive OR or diff on both value-> a ^ b = "+binary[m]);
System.out.println("(~a & b) | (a & ~b) = "+binary[n]);
System.out.println("~a & 0x0f = "+binary[g]);


//Equality and Relational Operators
int value1 = 1;
int value2 = 2;
if (value1 == value2)
    System.out.println("value1 == value2");
if (value1 != value2)
    System.out.println("value1 != value2");
if (value1 > value2)
    System.out.println("value1 > value2");
if (value1 < value2)
    System.out.println("value1 < value2");
if (value1 <= value2)
    System.out.println("value1 <= value2");
//Conditional Operator
//&& Conditional-AND
//|| Conditional-OR

//Ternary Operator
//expression1 ? expression2 : expression3
////Instanceof operator.. an object can access this class like wise  

Parent obj1 = new Parent();
Parent obj2 = new Child();

System.out.println("obj1 instanceof Parent: " +
    (obj1 instanceof Parent));
System.out.println("obj1 instanceof Child: " +
    (obj1 instanceof Child));
System.out.println("obj1 instanceof MyInterface: " +
    (obj1 instanceof MyInterface));
System.out.println("obj2 instanceof Parent: " +
    (obj2 instanceof Parent));
System.out.println("obj2 instanceof Child: " +
    (obj2 instanceof Child));
System.out.println("obj2 instanceof MyInterface: " +
    (obj2 instanceof MyInterface));

	}

}
class Parent {}
class Child extends Parent implements MyInterface {}
interface MyInterface {}