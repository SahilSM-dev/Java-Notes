package JavaBasics;

public class UnaryOperator {
    public  static void main(String[] args){
        System.out.println("Unary Operator");
        int a = 5;
        boolean flag = true;
        System.out.println("Post Increment");
        System.out.println(a++);
        System.out.println("Pre Increment");
        System.out.println(++a);
        System.out.println("Post Decrement");
        System.out.println(a--);
        System.out.println("Pre Decrement");
        System.out.println(--a);
        System.out.println("Unary Minus");
        System.out.println(-a);
        System.out.println("Unary Plus");
        System.out.println(+a);
        System.out.println("Logical Not");
        System.out.println(!flag);
    }
}
