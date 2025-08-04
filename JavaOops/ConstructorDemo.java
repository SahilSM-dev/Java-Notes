package JavaOops;

class Person {
   String name;
   int age;

   public Person(){
       name = "Unknown";
       age = 0;
   }

   public Person(String name, int age){
       this.name = name;
       this.age = age;
   }

   public void showDetails(){
       System.out.println("Name: " + name + ", Age: "+ age);
   }
}
class Calculation {
    int a;
    int b;

    Calculation(){
        this(10); // calling 2 constructor
    }
    Calculation(int a){
        this(a,15);  // calling the third constructor
    }
    Calculation(int a, int b){
        this.a=a;
        this.b=b;
    }

    public int showAddition(){
        return a + b;
    }
}

public class ConstructorDemo {
    // Using default Constructor
    public static void main(String[] args){
        // Using default constructor
        Person p1 = new Person();
        p1.showDetails();

        // Using parameterized constructor also overloaded constructor
        Person p2 = new Person("Sahil", 25);
        p2.showDetails();// Name: Sahil, Age:25

        // example of Constructor chaining
        Calculation c = new Calculation();
        System.out.println(c.showAddition());


    }
}
