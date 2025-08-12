package JavaFunctionalInterfaces;
/*
* A functional interface is an interface that contains exactly one abstract method
* One abstract method
* Any number of default methods
* Any number of static methods
* @FunctionalInterface keyword can be used at top of the interface (But its optional).
* @FunctionalInterface Annotation restrict us and throws compilation error, if we try to add more than 1 abstract method
*/

import java.util.function.*;

@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

// Implementation using 'implements'
class GreetingImpl implements Greeting {
    @Override
    public void sayHello(String name){
        System.out.println("Hello " + name + " (from implements)");
    }
}

public class FunctionalInterface3Ways {
    public static void main(String[] args) {
        // 1. Using implements
        Greeting g1 = new GreetingImpl();
        g1.sayHello("Sahil");

        // 2. Using Anonymous Class
        Greeting g2 = new Greeting() {
            @Override
            public void sayHello(String name) {
                System.out.println("Hello " + name + " (from anonymous class)");
            }
        };
        g2.sayHello("Sankalp");

        // 3. Using Lambda Expression
        Greeting g3 = (name) -> System.out.println("Hello " + name + " (from lambda expression)");
        g3.sayHello("eashan");

        // Types of functional interface

        // 1 . Supplier (No input -> returns output)
        /*
         *  Supplier<T>
         *  Method: T get()
         */
        Supplier<String> supplier = () -> "Hello";
        System.out.println(supplier.get()); // Hello

        // 2 . Consumer (Takes input -> no output )
        /*
        *  Consumer<T>
        *  Method: void accept(T t)
        */

        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
        consumer.accept("hello");

        // 3. Predicate Interfaces (Takes input -> returns boolean )
        /*
        *  Predicate<T>
        *  Method: boolean test(T t)
        */
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(4));

        // 4. Function ( Takes input -> return output)
        /*
        * Function<T,R>
        * Method R apply(T t)
        */

        Function<String,Integer> lengthFunc = s -> s.length();
        System.out.println(lengthFunc.apply("FunctionalInterface"));


    }
}
