package JavaGenerics;
import java.util.*;

class Fruit {
    public String toString(){
        return "Fruit";
    }
}

class Apple extends Fruit{
    public String toString(){
        return "Apple";
    }
}

class Banana extends Fruit{
    public String toString(){
        return "Banana";
    }
}

public class WildcardExample {
    // Unbounded wildcard: accepts list of any type
    public static void printItems(List<?> list){
        System.out.println("Printing items:");
        for(Object item : list){
            System.out.println(item);
        }
    }

    // Upper bounded wildcard: can read from Fruit or subclasses
    public static void printFruits(List<? extends Fruit> list){
        System.out.println("Fruits or Sub-Fruits");
        for (Fruit f : list){
            System.out.println(f);
        }
        // list.add(new Apple()); // Not allowed
    }

    // Lower bounded wildcard: can add Apple to list of Apple, Fruit, object
    public static void addApples(List<? super Apple> list){
        list.add(new Apple());
        list.add(new Apple());
        System.out.println("Apples added to the list.");
    }

    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit());
        fruits.add(new Apple());
        fruits.add(new Banana());

        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple());

        List<Banana> bananas = new ArrayList<>();
        bananas.add(new Banana());

        List<Object> objects = new ArrayList<>();

        //1. Unbounded wildcard
        printItems(fruits);
        printItems(apples);
        printItems(bananas);

        //2. Upper bounded wildcard
          printFruits(fruits);
          printFruits(apples);

        // 3. Lower bounded wildcard
        addApples(fruits);
        addApples(objects);
        addApples(apples);
        // addApples(bananas);  // gives compilation error

        // show what's inside the list after adding apples
        printItems(fruits);
        printItems(objects);
    }
}