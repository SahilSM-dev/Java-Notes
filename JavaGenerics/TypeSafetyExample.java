package JavaGenerics;
import java.util.ArrayList;

public class TypeSafetyExample {
    public static void main(String[] args){
        ArrayList list = new ArrayList(); // raw type
        list.add("Hello");
        list.add(123); // compiler allows this

        for (Object obj : list) {
            String str = (String) obj; // Runtime error: Class CastException
            System.out.println(str);
        }

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Hello");
        // list2.add(123);  // Gets compilation error

        for (String str : list2){
            System.out.println(str);  // No casting needed
        }

    }
}
