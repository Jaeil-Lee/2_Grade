class A {
  private int privateValue; // 전용
  int defaultValue; // 전용
  public int publicValue; // 전용
}
public class Test {
  
  public static void main(String[] args) {
    A obj  = new A(); 

    // obj.privateValue = 10; private는 다른 클래스에서는 접근 안됨
    obj.defaultValue = 20; //  default는 접근 가능
    System.out.println(obj.defaultValue);
    obj.publicValue = 30;  //  public은 접근 가능
    System.out.println(obj.publicValue);
  }
}
