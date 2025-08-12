package JavaGenerics;

class PrintClass<T>{
  T value;
  public T getPrintValue(){
      return value;
  }

  public void setPrintValue (T value){
      this.value=value;
  }
}
public class RawTypeObject {
    public static void main(String[] args){
        PrintClass<String> ParameterizedTypeObject = new PrintClass<>();
        PrintClass RawTypeObject = new PrintClass(); // Raw Type Object;
        RawTypeObject.setPrintValue(1);
        System.out.println(RawTypeObject.getPrintValue());
        RawTypeObject.setPrintValue("Hello");
        System.out.println(RawTypeObject.getPrintValue());
    }
}
