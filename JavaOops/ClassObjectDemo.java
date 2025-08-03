package JavaOops;
// Class is a blueprint or template for creating objects it defines
// properties -> fields,attributes
// behaviors  -> methods,function
class Car{
    // properties -> fields
    String name;
    String color;
    String Type;
    String FuelType;

    // behaviour -> method
    void drive(){
        System.out.println("I am driving My "+color +" "+ name +" which is an "+ Type +" of "+FuelType+" variant");
    }
}
public class ClassObjectDemo {
    public static void main (String[] args){
        Car mycar = new Car(); // Object creation
        mycar.color="Grey";
        mycar.name="Vitara Brezza";
        mycar.Type="SUV";
        mycar.FuelType="Diesel";
        mycar.drive();
    }
}
