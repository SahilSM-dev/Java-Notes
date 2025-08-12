package JavaInterfaces;

interface Printable{
    void Print();
}

interface Scannable {
    void Scan();
}

class MultifunctionPrinter implements Printable,Scannable {
    @Override
    public void Scan(){
        System.out.println("Scanning document");
    }
    @Override
    public void Print(){
        System.out.println("Printing document");
    }
}

public class InterfaceMultipleInheritanceDemo {
    public static void main(String[] args) {
        MultifunctionPrinter mfp = new MultifunctionPrinter();
        mfp.Scan();
        mfp.Print();
    }
}
