package JavaStaticMethod;

interface A{
    static void greet(){
        System.out.println("Hello from interface A(static).");
    }
}

class B implements A{
    // Not an override! this is an instance method with same name
    // here using override will give compile error.

    public void greet(){
        System.out.println("Hello from Class B (non-static).");
    }
}

public class StaticMethodDemo {
    public static void main(String[] args) {
        // Calling static method from interface
        A.greet();

        // Calling instance method from class
        B obj = new B();
        obj.greet();
    }
}
