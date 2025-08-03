package JavaInheritance;

// Base class
class A{
    public void showA(){
        System.out.println("Class A method");
    }
}

// Single Inheritance: Class B extends A
class B extends A{
    public void showB (){
        System.out.println("Class B method");
    }
}

//Multilevel Inheritance: C -> B -> A
class C extends B{
    public void showC(){
        System.out.println("Class C method");
    }
}

//Hierarchical Inheritance: D and B both extend A
class D extends A{
    public void showD(){
        System.out.println("Class D method");
    }
}

// Interface for multiple inheritance
interface I {
    void showI();
}

// Class E inherits from A and implements I ( Multiple Inheritance via Interface)
class E extends A implements I{
    public void showE(){
        System.out.println("Class E method");
    }

    public void showI(){
        System.out.println("Interface I method implemented in E");
    }
}
public class InheritanceTypesDemo {
    public static void main(String[] args){
        // Single Inheritance
        B bobj = new B();
        bobj.showA(); // from A
        bobj.showB();

        System.out.println("------------------");

        // Multilevel Inheritance
        C cobj = new C();
        cobj.showA(); // from A
        cobj.showB(); // from B
        cobj.showC();

        System.out.println("-------------------");

        //Hierarchical Inheritance
        D dobj = new D();
        dobj.showA();
        dobj.showD();


        System.out.println("---------------------");

        //Multiple Inheritance via Interface
        E eobj = new E();
        eobj.showA();// from A
        eobj.showI();// from Interface.
        eobj.showE();
    }
}
