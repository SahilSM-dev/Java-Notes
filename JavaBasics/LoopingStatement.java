package JavaBasics;

public class LoopingStatement {
    public static void main(String[] args){
        /*
        * for( initialization of variable ; condition check ; increment/decrement of variable){ // statement block }
        */
        System.out.println("For Loop");
        for(int i = 1; i<=10 ; i++){
            System.out.println(i);
        }

        /*
        * Initialize variable
        * While(condition check){
        *  // block of statements
        *   increment/decrement variable
        * }
        */
        System.out.println("While Loop");
        int val = 1;
        while(val <= 5){
            System.out.println(val);
            val++;
        }

        /*
        *  Initialize variable
        *  do{
        *     // block of statements
        *     increment/decrement variable
        *  }while(condition check);
        */
        System.out.println("do while");
        int  j = 1;
        do{
            System.out.println(j);
            j++;
        }while (j <=5);

        System.out.println("for each loop");
        String valArray[] = {"Apple","Banana","chikoo","pear","pineapple"};
        for (String x : valArray) {
            System.out.println(x);
        }
        System.out.println("Break statement");
        for(int a=1; a<=10 ; a++){
            if(a == 3){
                break;
            }
            System.out.println(a);
        }
        System.out.println("Continue statement");
        for(int b=1; b<=10 ; b++){
            if(b == 3){
                continue;
            }
            System.out.println(b);
        }

    }
}


