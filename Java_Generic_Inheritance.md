# Inheritence In Generic Classes

### 1. Non-Generic Sub-class

Generic Parent
```Java
// Generic Parent
class GenericParent<T>{
    T data;

    GenericParent(T data){
        this.data = data;
    }

    void show(){
        System.out.println("Generic Parent data: " + data);
    }
}
```

```Java
// Non-Generic Child
class NonGenericChild extends GenericParent<String>{
    NonGenericChild(String data){
        super(data);
    }

    void display(){
        System.out.println("Non Generic Child accessing parent data: " + data);
    }
}
```
So here above we have extended/Inherited a generic class to a non-generic sub-class.

While extending/Inheriting a generic class to a non-generic sub-class, we have to define the type of **T** at the time of extending itself.

```java
// 1. Generic to Non-Generic
NonGenericChild ngChild = new NonGenericChild("Hello Generic Parent From Non generic class!");
ngChild.show();
ngChild.display();
```

### 2. Generic Sub-class

```java
// Generic Child
class GenericChild<T> extends GenericParent<T>{
    GenericChild(T data){
        super(data);
    }

    void showValue(){
        System.out.println("Generic Child value: " + data);
    }
}
```
```java
// 2. Generic to Generic
GenericChild<String> gcChild = new GenericChild<>("Hello Generic Parent from Child generic class");
gcChild.show();
gcChild.showValue();
```

So, for a generic subclass, we can specify the type of **T** at the time of object creation.

Program :-
```java
// Generic Parent -> Non Generic Child
// Generic Parent
class GenericParent<T>{
    T data;

    GenericParent(T data){
        this.data = data;
    }

    void show(){
        System.out.println("Generic Parent data: " + data);
    }
}
// Non-Generic Child
class NonGenericChild extends GenericParent<String>{
    NonGenericChild(String data){
        super(data);
    }

    void display(){
        System.out.println("Non Generic Child accessing parent data: " + data);
    }
}

// Generic Child
class GenericChild<T> extends GenericParent<T>{
    GenericChild(T data){
        super(data);
    }

    void showValue(){
        System.out.println("Generic Child value: " + data);
    }
}

public class InheritanceGenericsDemo {
    public static void main (String[] args){
        // 1. Generic to Non-Generic
        NonGenericChild ngChild = new NonGenericChild("Hello Generic Parent From Non generic class!");
        ngChild.show();
        ngChild.display();

        // 2. Generic to Generic
        GenericChild<String> gcChild = new GenericChild<>("Hello Generic Parent from Child generic class");
        gcChild.show();
        gcChild.showValue();

    }
}
```




