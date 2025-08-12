package JavaBasics;

class Animal{

}

class Dog extends Animal{

}
public class ObjectTest {
    public static void main(String[] args) {
        ObjectTest obj = new ObjectTest();

        Object obj1 = new Animal();
        Object obj2 = new Dog();

        System.out.println(obj1.getClass());
        System.out.println(Animal.class.getSuperclass().getName());
        System.out.println(obj2.getClass());
        System.out.println(Dog.class.getSuperclass().getName());
    }
}
