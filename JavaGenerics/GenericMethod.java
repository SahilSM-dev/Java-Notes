package JavaGenerics;

class KeyPair<K,V>{
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
class Utility{
    public <A,B> void printTypes(A a, B b){
        System.out.println("Type A: " + a + ", Type B: " + b);
    }

    public <K,V> void printValue(KeyPair<K,V> pair1,KeyPair<K,V> pair2){
        if (pair1.getKey().equals(pair2.getKey())){
            System.out.println("Keys are equal");
        }else{
            System.out.println("Keys are different");
        }
    }

    public <T> void Display(T value){
        System.out.println("Value: " + value);
    }
}
public class GenericMethod {
    public static void main(String[] args) {
        Utility util = new Utility();
        util.<String, Integer>printTypes("ID", 1001);
        util.printTypes(3.14,false); // Type inference works too

        KeyPair<Integer,String> p1 = new KeyPair<>();
        KeyPair<Integer,String> p2 = new KeyPair<>();
        KeyPair<Integer,String> p3 = new KeyPair<>();
        KeyPair<Integer,String> p4 = new KeyPair<>();
        p1.setKey(1);
        p2.setKey(2);
        p3.setKey(3);
        p4.setKey(2);
        p1.setValue("A");
        p2.setValue("B");
        p3.setValue("C");
        p4.setValue("D");

        util.printValue(p1,p3); //Keys are different
        util.printValue(p2,p4); // Keys are equal

        util.Display("Hello");
        util.Display(123);
        util.Display(45.67);
        util.Display(true);
        util.Display(p1.getKey());
        util.Display(p1.getValue());

    }
}