package JavaBasics;

public class DataTypesDemo {
    public static void main(String[] args){
        // Integer Types
        byte byteVal = 100;
        short shortVal = 10000;
        int intVal = 100000;
        long longVal = 10000000000L;
        // Floating-point Type
        float floatVal = 10.5f;
        double doubleVal = 20.99;
        // Character Type
        char charVal = 'A';

        // Boolean Type
        boolean boolVal = true;

        System.out.println("Demonstration of Datatypes");
        System.out.println("byte value: " + byteVal); // 1 byte
        System.out.println("short value: " + shortVal); // 2 bytes
        System.out.println("int value: " + intVal); // 4 bytes
        System.out.println("long value: " + longVal); // 8 bytes
        System.out.println("float value: " + floatVal); // 4 bytes
        System.out.println("double value: " + doubleVal); // 8 bytes
        System.out.println("char value: " + charVal); // 2 bytes
        System.out.println("boolean value: " + boolVal); // 1 but

        System.out.println("------------------------");

        System.out.println("Overflow concept ");

        byteVal= 127;
        shortVal = 32766;
        intVal = Integer.MAX_VALUE;
        longVal = Long.MAX_VALUE;

        // Display original values
        System.out.println("Original byte: " + byteVal);
        System.out.println("Original short: " + shortVal);
        System.out.println("Original int: " + intVal);
        System.out.println("Original long: " + longVal);

        // Cause overflow
        byteVal++;
        shortVal++;
        intVal++;
        longVal++;
        // After overflow
        System.out.println("Overflowed byte: "+ byteVal);
        System.out.println("Overflowed short: "+ shortVal);
        System.out.println("Overflowed int: "+ intVal);
        System.out.println("Overflowed long: "+ longVal);

        System.out.println("Floating Point variable Demo");

        // Precison difference

        floatVal = 1.123456789f;
        doubleVal = 1.123456789123456789;

        System.out.println("float value: " + floatVal); // Precision up to 7 digits
        System.out.println("double value: " + doubleVal); // Precision up to 15-16 digits

        // Demonstrate rounding error
        double result = 0.1 + 0.2;
        System.out.println("0.1 + 0.2 = " + result); // Not 0.3 exactly

        // Infinity and NaN
        double posInf = 1.0 / 0.0;
        double negInf = -1.0 / 0.0;
        double nanVal = 0.0 / 0.0;

        System.out.println("Positive Infinity: " + posInf); //Infinity
        System.out.println("Negative Infinity: " + negInf); //-Infinity
        System.out.println("NaN (Not a Number): " + nanVal); //NaN

        if (Double.isNaN(nanVal)) {
            System.out.println("nanVal is Not a Number");
        }
    }
}
