package JavaBasics;

public class SwitchStatement {
    public  static void main(String[] args){
        int a = 1;
        int b = 2;

        switch (a+b) {
            case 1:
                System.out.println("a+b is 1");
                break;
            case 2:
                System.out.println("a+b is 2");
                break;
            case 3:
                System.out.println("a+b is 3");
            case 4:
                System.out.println("a+b is 4");
                break;
            default:
                System.out.println(a+b);
        }
    }
}
