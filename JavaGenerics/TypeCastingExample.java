package JavaGenerics;
// Raw type class
class Print1{
    Object value;
    public Object getPrintValue(){
        return value;
    }

    public void setPrintValue(Object value){
        this.value = value;
    }
}

// Generic class
class Print2<T>{
    T value;
    public T getPrintValue(){
        return value;
    }

    public void setPrintValue(T value){
        this.value = value;
    }
}

public class TypeCastingExample {
    public static void main(String[] args){
        Print1 obj1 = new Print1(); // non generic
        obj1.setPrintValue(1);
        Object printValue = obj1.getPrintValue();
        // We cannot use Print value directly
        // We have to typecast it, else it will be a compile time error.
        if ((int)printValue == 1){
            System.out.println("equal");
        }

        Print2<Integer> obj2 = new Print2<>(); // generic
        obj2.setPrintValue(1);
        Integer printValue1 = obj2.getPrintValue();
        // We don't need to type cast here the value
        if (printValue1 == 1){
            System.out.println("equal");
        }

    }
}
