package JavaOops;
// Using Abstract class
abstract class Animal {
    // abstract method
    String name;
    abstract void sound();

    // regular method
    void sleep(){
        System.out.println(name + " is sleeping...");
    }
}
// Subclass that implements abstract method
class Dog extends Animal {
    void sound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound(){
        System.out.println("Cat meows");
    }
}
// Using Abstraction
interface Vehicle{
    void start();
}

class Bus implements Vehicle{
    @Override
    public void start(){
        System.out.println("Bus is starting");
    }
}


public class AbstractionDemo {
    public static void main (String[] args){
        Animal myDog = new Dog();
        myDog.name="Dog";
        myDog.sound();
        myDog.sleep();
        Animal myCat = new Cat();
        myCat.name="Cat";
        myCat.sound();
        myCat.sleep();

        Vehicle myBus = new Bus();
        myBus.start();
    }
}
