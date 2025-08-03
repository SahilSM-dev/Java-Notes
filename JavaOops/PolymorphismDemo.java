package JavaOops;

class A {
    void show(){
        System.out.println("A: show()");
    }
    void show(String msg){
        System.out.println("A: show(String) - " + msg);
    }

    void show(int msg){
        System.out.println("A: show(int) - " + msg);
    }

    void show (String msg, int count){
        System.out.println("A: show(String,int)");
    }

    void show (int count,String msg){
        System.out.println("A: show(String,int)");
    }

    void display(){
        System.out.println("A: display()");
    }
}
class B extends A{
    @Override
    void display(){
        System.out.println("B: display()");
    }
}

class C extends A {
    @Override
    void display(){
        System.out.println("C: display()");
    }
}

class D extends A {
    void print(){
        System.out.println("In class D");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args){
        // Compile-time Polymorphism
        System.out.println("=== Compile time Polymorphism (Overrloading) ===");
        A a1 = new A();
        a1.show();
        a1.show("Hello");
        a1.show(5);
        a1.show("Hello",5);
        a1.show(5,"Hello");

        // Runtime Polymorphism
        System.out.println("\n=== Runtime Polymorphism (Overriding) ===");
        A a2 = new B(); // Parent reference, child object
        a2.display(); // Calls B's version


        A a3 = new C(); // Parent reference, another child object
        a3.display(); // Calls C's version

        A a4 = new D();
        a4.display();
    }
}
