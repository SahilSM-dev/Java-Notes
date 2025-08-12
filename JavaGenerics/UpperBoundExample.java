package JavaGenerics;
/*
*  Upper bound
*  class ClassName<T extends SuperClass> { }
*  Upper bound restrict the type parameter to a specific class and its subclasses.
*/
class Calculator<T extends Number> {
    /*
    *  So only Number or its child/subclasses can be used as objects
    * (Integer, Double , Float)
    */
    private T num;

    public Calculator(T num){
        this.num = num;
    }

    public double getDoubleValue(){
        return num.doubleValue();
    }
}

public class UpperBoundExample {
    public static void main(String[] args) {
        Calculator<Integer> intCalc = new Calculator<>(10);
        Calculator<Double> doubleCalc = new Calculator<>(10.5);
        //Calculator<String> s = new Calculator<>("10");   // this gives compilation error

        System.out.println("Integer value as double: " + intCalc.getDoubleValue());
        System.out.println("Double value: " + doubleCalc.getDoubleValue());
    }
}
