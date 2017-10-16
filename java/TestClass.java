public class TestClass {
public static void main(String args[]){
  print("hello world");
  PrivateTestClass obj = PrivateTestClass.getInstance();
  print(obj);
}



private static class PrivateTestClass {
    String namee;
    String valuee;
    private static PrivateTestClass instance ;
    static boolean isInitialized;
    private PrivateTestClass() {

    }
    private PrivateTestClass (String name, String value){
      this.namee = name;
      this.valuee = value;
    }
    public static PrivateTestClass getInstance (){
      if (!isInitialized){
        isInitialized = true;
        instance = new PrivateTestClass("Hello","World");
        return instance;
      }else{
        return instance;
      }
    }

    @Override
    public String toString(){
      return this.name+"     "+this.value;
    }
}

public static void print(Object obj){
    System.out.println(obj);
}
}