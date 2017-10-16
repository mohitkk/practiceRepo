public class TestClass {
public static void main(String args[]){
  print("hello world");
  PrivateTestClass obj = PrivateTestClass.getInstance();
  print(obj);
}



private static class PrivateTestClass {

    String firstName;
    String value;
    private static PrivateTestClass instance ;
    static boolean isInitialized;
    private PrivateTestClass() {

    }
    private PrivateTestClass (String name, String value){
      this.firstName = name;
      this.value = value;
    }
    public static PrivateTestClass getInstance (){
      if (!isInitialized){
        isInitialized = true;
        instance = new PrivateTestClass("Hello","Kansas");
        return instance;
      }else{
        return instance;
      }
    }

    @Override
    public String toString(){
      return this.firstName+" "+this.value;
    }
}

public static void print(Object obj){
    System.out.println(obj);
}
}