package JavaBasics;

public class AssignmentOperator {
   public static void main (String[] args){
       System.out.println("Assignment Operator");
       int a = 5; // assigned value 5 to variable a using =
       int b;
       System.out.println(a);
       b = 0;
       b += a; // b = b + a
       System.out.println(b);
       b -= 3; // b = b- 3
       System.out.println(b);
       b *= a; // b = b * 3;
       System.out.println(b);
       b /=a; // b = b / a
       System.out.println(b);
   }
}
