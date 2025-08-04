package JavaBasics;

class SampleMethod{
    public static void display(){
        System.out.println("Static method inside another class");
    }

    public void displayGreet(){
        System.out.println("Normal method inside another class");
    }
}
public class MethodExamples {

    // Static method without parameters
    public static void greet(){
        System.out.println("Hello from static method!");
    }

    // Non-static method with parameters
    public void displayMessage(String message){
        System.out.println("Message:" + message);
    }

    // Method with return value
    public int add(int a,int b){
        return a + b;
    }

    // Overloaded methods
    public void printInfo(String name){
        System.out.println("Name: " + name);
    }

    public  void printInfo(String name, int age){
        System.out.println("Name: " + name +", Age: "+ age);
    }

    // Main method to call
    public  static  void main(String[] args){

        SampleMethod sm = new SampleMethod();

        SampleMethod.display(); // static method is called with class name
        sm.displayGreet();

        // Calling static method
        greet();

        // Creating object to call non-static methods
        MethodExamples obj = new MethodExamples();

        // Calling non-static methods
        obj.displayMessage("Java is powerful!");

        int result = obj.add(10,20);
        System.out.println("Sum is: " + result);

        obj.printInfo("Sahil");
        obj.printInfo("Sahil", 25);
    }
}
