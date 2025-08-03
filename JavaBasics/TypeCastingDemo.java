package JavaBasics;

public class TypeCastingDemo {
    public static void main(String[] args) {
      // byte -> short -> int -> long -> float -> double
      // Widening -> Implicit -> Small to Bigger type
      // Done automatically by java
      // Narrowing -> Explicit -> Bigger to Smaller type
      // Must use (type) to cast manually

        //Widening (Implicit)
        int intVal = 100;
        long longVal = intVal;   // int to long
        float floatVal = longVal; // long to float

        System.out.println("Implicit Typecasting ");
        System.out.println("int to long: " + longVal);
        System.out.println("long to float: " + floatVal);

        // Narrowing (Explicit)
        double doubleVal = 123.456;
        int narrowedInt = (int) doubleVal; // fractional part is lost
        byte narrowedByte = (byte) narrowedInt;

        System.out.println("Explicit Typecasting ");
        System.out.println("double to int: " + narrowedInt);
        System.out.println("int to byte: " + narrowedByte);

        // Overflow example in narrowing
        int bigInt = 130;
        byte overflowByte = (byte) bigInt; // Overflow occurs here

        System.out.println("Overflow in Narrowing:");
        System.out.println("Original int: " + bigInt);
        System.out.println("After casting to byte: " + overflowByte);
    }
}
