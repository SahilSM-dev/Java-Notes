package JavaGenerics;

class Pair<T,U>{
    private T first;
    private U second;

    public Pair(T first, U second){
        this.first=first;
        this.second=second;
    }

    public T getFirst(){
        return first;
    }

    public U getSecond(){
        return second;
    }

    public void printPair(){
        System.out.println("First: " + first + ", Second: "+ second);
    }
}
public class MultiGenericExample {
    public static void main(String[] args){
        Pair<String,Integer> pair1 = new Pair<>("Age",30);
        pair1.printPair();

        Pair<Double,Boolean> pair2 = new Pair<>(99.99,true);
        pair2.printPair();
    }
}
