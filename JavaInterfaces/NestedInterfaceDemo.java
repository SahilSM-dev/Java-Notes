package JavaInterfaces;

// Nested interface inside a class
class Outer{
    interface  NestedInterface{
        void nestedMethod();
    }
}

class InnerClass implements Outer.NestedInterface{
    public void nestedMethod(){
        System.out.println("Nested method implementation.");
    }
}

//Interface inside interface
interface OuterInterface{
    interface NestedInterface{
        void display();
    }
}

class Demo implements OuterInterface.NestedInterface{
    public void display(){
        System.out.println("Implemented nested interface inside interface.");
    }
}

public class NestedInterfaceDemo {
    public static void main(String[] args) {
        Outer.NestedInterface obj = new InnerClass();
        obj.nestedMethod();


        OuterInterface.NestedInterface obj1 = new Demo();
        obj1.display();
    }
}
