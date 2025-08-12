package JavaImmutableClass;

final class Person{
    private final String name;
    private final int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    // Getter methods ( no setters )

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}

public class ImmutableClass {
    public static void main(String[] args) {
        Person p = new Person("Sahil",24);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
