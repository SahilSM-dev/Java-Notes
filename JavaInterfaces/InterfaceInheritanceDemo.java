package JavaInterfaces;

interface A{
    void methodA();
}
interface B extends A{
    void methodB();
}
class MyClass implements B {
    @Override
    public void methodA(){
        System.out.println("methodA from interface A");
    }
    @Override
    public void methodB(){
        System.out.println("methodB from interface B");
    }
}

// Multiple inheritance in interface
interface X{
    void showDetails();
    void xMethod();
}
interface Y{
    void showDetails();
    void yMethod();
}
interface Z extends X,Y{
    void showDetails();
    void zMethod();
}
class MyClass2 implements Z{
    @Override
    public void xMethod(){
        System.out.println("xmethod from interface X");
    }
    @Override
    public void yMethod(){
        System.out.println("ymethod from interface y");
    }
    @Override
    public void zMethod(){
        System.out.println("zmethod from interface Z");
    }
    @Override
    public void showDetails(){
        System.out.println("method showDetails");
    }
}

class MyClass3 implements X,Y{
    public void xMethod(){
        System.out.println("xMethod from interface X implemented in MyClass3.");
    }
    public void yMethod(){
        System.out.println("yMethod from interface Y implemented in MyClass3.");
    }
    public void showDetails(){
        System.out.println("method showDetails common in both interface.");
    }
}

public class InterfaceInheritanceDemo {
    public static void main(String[] args) {
        //Interface with single inheritance
        MyClass obj = new MyClass();
        obj.methodA();
        obj.methodB();

        //Interface with Multiple inheritance
        MyClass2 obj2 = new MyClass2();
        obj2.xMethod();
        obj2.yMethod();
        obj2.zMethod();
        obj2.showDetails();

        // Example 2
        MyClass3 obj3 = new MyClass3();
        obj3.xMethod();
        obj3.yMethod();
        obj3.showDetails();
    }
}
