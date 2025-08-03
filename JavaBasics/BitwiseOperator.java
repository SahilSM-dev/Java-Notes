package JavaBasics;

public class BitwiseOperator {
    public static void main (String[] args){
        System.out.println("Bitwise Operator");
        int a = 4;
        int b = 6;
        System.out.println("Bitwise AND");
        System.out.println(a & b);
        System.out.println("Bitwise OR");
        System.out.println(a | b);
        System.out.println("Bitwise XOR");
        System.out.println(a ^ b);
        System.out.println("Bitwise NOT");
        System.out.println(~a);

        System.out.println("Bitwise Shift Operator");
        System.out.println(a);
        System.out.println("Signed Left Shift");
        System.out.println(a << 1);
        System.out.println(a << 2);
        int c = -4;
        System.out.println(c << 1);
        System.out.println(c << 2);
        System.out.println("Signed Right Shift");
        System.out.println(a >> 1);
        System.out.println(a >> 2);
        System.out.println(c >> 1);
        System.out.println(c >> 2);
        System.out.println("Unsigned Left Shift");
        System.out.println(a >>> 1);
        System.out.println(a >>> 2);
        System.out.println(c >>> 1);
        System.out.println(c >>> 2);

    }
}
