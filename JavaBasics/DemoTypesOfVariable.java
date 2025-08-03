package JavaBasics;

class Demo{
    int instanceVar = 10;  // Instance variable
    static int staticVar = 5; // static variable

    public void DemoMethod(){
        int localVariable = 15; // Local variable scope only till this method
        System.out.println("Inside Show Non-static method");
        System.out.println("Instance variable : "+instanceVar);
        System.out.println("Static variable : "+staticVar);
        System.out.println("Local variable : "+localVariable);

    }

    public void show(){
        System.out.println("Inside Show Non-static method");
        System.out.println("Instance variable : "+instanceVar);
        System.out.println("Static variable : "+staticVar);
    }


    public  static void staticMethod(){
        System.out.println("Inside Static method");
        //    System.out.println(instanceVar);  // Error as it can't be access in Static method
        System.out.println("Static variable : "+staticVar);
    }
}
public class DemoTypesOfVariable {
    public static void main(String[] args){
        Demo obj = new Demo();
        obj.DemoMethod();
        System.out.println("---------------------");
        obj.show();
        System.out.println("---------------------");
        Demo.staticMethod();// can be access by class name not by object
        System.out.println("---------------------");
        System.out.println("Accesing static variable using Class Name");
        System.out.println("Static Variable : "+Demo.staticVar);
    }
}
