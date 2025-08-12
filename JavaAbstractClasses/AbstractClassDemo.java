package JavaAbstractClasses;

abstract class Car{
    int mileage;

    Car (int mileage){
        this.mileage = mileage;
    }

    public abstract void pressBreak(); // Abstract method 1

    public abstract void pressClucth(); // Abstract method 2

    public int getNumberofWheels(){  // Non-abstract method
        return 4;
    }
}

abstract class LuxuryCar extends Car{
    LuxuryCar(int mileage){
        super(mileage);
    }

    public abstract void pressDualBreakSystem(); // Additional abstract method

    @Override
    public  void pressBreak(){  // implemented one of the abstract method
        System.out.println("Applied Break");
    }
}

class Audi extends LuxuryCar{
    Audi(int mileage){
        super(mileage);
    }

    @Override
    public void pressClucth(){
        System.out.println("Applied Clucth");
    }

    @Override
    public  void pressDualBreakSystem(){
        System.out.println("Applied Dual Break");
    }

    public void pressAccelerator(){
        System.out.println("Applied Accelerator");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Audi mycar = new Audi(8);
        System.out.println("Mileage : " + mycar.mileage);
        mycar.pressClucth();
        mycar.pressAccelerator();
        mycar.pressBreak();
        mycar.pressAccelerator();
        mycar.pressDualBreakSystem();
    }
}
