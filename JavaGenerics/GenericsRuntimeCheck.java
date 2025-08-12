package JavaGenerics;

import java.util.ArrayList;
import java.util.List;
/*
* Type erasure is concept where type parameters are removed at compile time
* Type information is not available at run time
*/
public class GenericsRuntimeCheck {

    public static void main(String[] args) {
     // Example of Type erasure
        // Generic type list
        List<String> names = new ArrayList<>();
        addToName(names,"Sahil");
        addToName(names, "Sankalp");
        System.out.println(names);
        incorrectAssNames(names, 100);
        System.out.println(names);
        //String name3 = names.get(2); // this will not give error at compile time
                                     // At run time it will throw ClassCastException
    }

    // Accepts only generic list of type String
    private static void addToName(List<String> names, String s){
        names.add(s);
    }

    // Accepts Raw list without generic
    private static void incorrectAssNames(List list, Integer i){
        list.add(i);
    }
}
