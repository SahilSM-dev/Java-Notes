package JavaFunctionalInterfaces;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.*;

@FunctionalInterface
interface Calculator {
    int calc(int a,int b);
}

@FunctionalInterface
interface StringFormatter {
    String format(String s);
}

public class LambdaExpressionPractice {
    public static void main(String[] args) {

        //1. Square of a number
        Function<Integer,Integer> sqOfNum = s -> (s * s);
        System.out.println(sqOfNum.apply(5));

        //2. Check if string is empty
        Predicate<String> isempty = s -> s.equals(" ");
        System.out.println(isempty.test(" " ));

        //3. Print a message
        Consumer<String> printValue = s -> System.out.println(s);
        printValue.accept("Hello Java World");

        //4. Get current date-time as String
        Supplier<String> printDtTime = () -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss");
            return LocalDateTime.now().format(formatter);
        };

        System.out.println("Current Date-Time: " + printDtTime.get());

        // Custom Functional Interfaces
        Calculator AddNum = (a,b) -> a + b;
        System.out.println(AddNum.calc(5,3));
        Calculator Subtraction = (a,b) -> a - b;
        System.out.println(Subtraction.calc(10,5));
        Calculator Multiplication = (a,b) -> a * b;
        System.out.println(Multiplication.calc(5,3));

        StringFormatter StringUpper = s -> s.toUpperCase();

        System.out.println(StringUpper.format("sahil"));

        StringFormatter StringReverse = s -> new StringBuilder(s).reverse().toString();

        System.out.println(StringReverse.format("Mumbai"));

    }
}
