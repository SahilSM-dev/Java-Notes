package JavaStrings;
import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        String str = "Java is fun to learn";

        // Default delimiter: whitespace
        StringTokenizer st1 = new StringTokenizer(str);
        System.out.println("Tokens using default delimiter:");
        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }

        // Custom delimiter
        String data = "Apple,Orange,Banana,Mango";
        StringTokenizer st2 = new StringTokenizer(data, ",");
        System.out.println("\nTokens using ',' as delimiter:");
        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }

        // With returnDelims = true
        StringTokenizer st3 = new StringTokenizer("A,B,C", ",", true);
        System.out.println("\nTokens including delimiters:");
        while (st3.hasMoreTokens()) {
            System.out.println(st3.nextToken());
        }

        // Count tokens
        StringTokenizer st4 = new StringTokenizer("One Two Three");
        System.out.println("\nToken count: " + st4.countTokens());
        while (st4.hasMoreTokens()) {
            System.out.println(st4.nextToken());
        }
    }
}


