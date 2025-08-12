package JavaGenerics;
import java.util.ArrayList;
import java.util.List;

public class LowerBoundExample {
    public static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        addNumbers(numbers);
        System.out.println(numbers);
    }
}
