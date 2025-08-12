package JavaStrings;

public class StringDemo {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello"; // refers to the same object as s1 in String constant pool
        String s3 = new String("Hello"); // Creates a NEW object in heap again
        // Difference between .equals() and ==
        // == check object are equal or not
        // .equals check value is same or not
        if (s1 == s2){ // true same pool object
            System.out.println("Both strings s1 and s2 are equal using ==");
        }
        if(s1 == s3){ // false different object
            System.out.println("Both strings s1 and s3 are equal using ==");
        }else{
            System.out.println("Both strings s1 and s3 are not equal using ==");
        }
        if (s1.equals(s3)){ // true same value
            System.out.println("Both strings s1 and s3 are equal using .equals()");
        }


        // 1. String (Immutable)
        System.out.println("STRING");
        String str = "Hello";
        System.out.println("Original: "+ str);

        // Concatenation
        String str2 = str.concat(" World");
        System.out.println("After concat: "+ str2);
        System.out.println("Original remains: "+ str);

        // Substring
        System.out.println("Substring(0,5): "+ str2.substring(0,5));

        // Replace
        System.out.println("Replace 'World' with 'Java': "+ str2.replace("World","Java"));

        // Compare
        System.out.println("Equals 'Hello World': "+str2.equals("Hello World"));
        System.out.println("Ignore case equals: " +str2.equalsIgnoreCase("hello world"));

        // Length
        System.out.println("String Length: "+ str2.length());
    }
}
