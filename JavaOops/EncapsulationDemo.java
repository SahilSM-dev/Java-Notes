package JavaOops;

class Student{
    // Private data members (data hiding)
    private String name;
    private int age;

    // Public getter methods
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // Public setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
      if (age > 0) {
          this.age = age;
      }else{
          System.out.println("Age should not be Zero");
      }
    }
}
public class EncapsulationDemo {
    public static void main(String[] args){
        Student s = new Student();
        s.setName("Sahil");
        s.setAge(22);

        System.out.println("Student Name: " +s.getName());
        System.out.println("Student Age: " + s.getAge());

        s.setAge(0);
    }
}
