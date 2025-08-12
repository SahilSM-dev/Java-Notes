package JavaStaticMethod;

interface Utility{
    // public default method calling a private instance method
    default void process(){
        log();
        System.out.println("Processing data...");
    }

    // Private instance method ( used internally )
    private void log(){
        System.out.println("Log: Staring process....");
    }

    // public static instance method calling a private static method
    static void calculate(){
        validate();
        System.out.println("Calculating result...");
    }

    // private static method ( used internally)
    private static void validate(){
        System.out.println("Validation: Parameters are valid.");
    }
}

class MyApp implements  Utility{
    // Nothing needed here
}

public class PrivateStaticMethod {
    public static void main(String[] args) {
        Utility app = new MyApp();
        app.process();        // Calls default -> private
        Utility.calculate();  // Calls static -> private static
    }
}
