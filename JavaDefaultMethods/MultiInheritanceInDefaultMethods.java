package JavaDefaultMethods;
/*
* If a class implements multiple interfaces that have default methods with same name and signature
* the class  must override the method to resolve the conflict.
*/

interface A {
    default void show(){
        System.out.println("Default method in interface A");
    }
}

interface B{
    default void show(){
        System.out.println("Default method in  interface B");
    }
}

class C implements A,B{
    //Must override the conflicting method
    @Override
    public void show(){
        A.super.show();
        B.super.show();
        System.out.println("Override default method in C");
    }
}

public class MultiInheritanceInDefaultMethods {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}
