package Interview;

import java.lang.reflect.Constructor;

public class Example {
    public static void main(final String[] args) throws Exception {
        Constructor<Foo> constructor = Foo.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Foo foo = constructor.newInstance();
        System.out.println(foo);
        foo.abc();
    }
}

class Foo {
    private Foo() {
        // private!
    }

 void abc()
 {
	 System.out.println("Hello");
 }
}