package JavaBasics;

public class ReturnTypeDemo {

    public int add(int a, int b){
        return a + b;
    }

    public  boolean isEven(int num){
        return num % 2 == 0;
    }

    public String getGreeting(String name){
        return "Hello, " + name + "!";
    }

    public void showInfo(){
        System.out.println("This is a void method");
    }

    public static void main(String[] args){
        ReturnTypeDemo obj = new ReturnTypeDemo();

        int sum = obj.add(10,20);
        System.out.println("Sum: " + sum);

        String greeting = obj.getGreeting("Sahil");
        System.out.println(greeting);

        boolean even = obj.isEven(4);
        System.out.println("Is 4 even? "+ even);

        obj.showInfo(); // returns nothing
    }
}
