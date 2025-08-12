package JavaGenerics;

interface Identifiable {
    String getId();
}

interface Workable {
    void doWork();
}

class Person {
    String name;
    Person(String name){
        this.name = name;
    }

    public void introduce(){
        System.out.println("Hi, I am " + name);
    }
}

class Employee extends Person implements Identifiable,Workable{
    private  String empId;
    Employee(String name,String empId){
        super(name);
        this.empId = empId;
    }

    public String getId(){
        return empId;
    }

    public void doWork(){
        System.out.println(name + " is working.");
    }
}

public class MultiBoundDemo {

    public  static  <T extends Person & Identifiable & Workable> void process(T obj){
        obj.introduce(); // from person
        System.out.println("ID: " + obj.getId()); // from Identifiable
        obj.doWork();  // from Workable
    }

    public static void main(String[] args){
        Employee e = new Employee("Sahil","2149952");
        process(e); // Valid: Employee extends Person and implements both interfaces
    }
}
