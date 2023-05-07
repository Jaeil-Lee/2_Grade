package INTERFACE;

interface MyInterface {
  public void myMethod1(); // 추상 메소드


  // 🚩 default 메소드 , 메소드 안의 내용은 제공할 수 있다  
  //    => 인터페이스를 구현하는 클래스가 메소드의 몸체를 구현하지 않아도 메소드를 호출할 수 있다
  default void myMethod2() {
    System.out.println("myMethod2()");
  }

}

public class DefaultMethodTest implements MyInterface {

  public void myMethod1() {
    System.out.println("myMethod1()");
  }

  /* 🚩  myMethod2 구현하지 않았는데도 에러 안뜸! */

  public static void main(String[] args) {
    DefaultMethodTest obj = new DefaultMethodTest();
    obj.myMethod1();
    obj.myMethod2(); // 🚩 default 메소드는 구현하지 않고도 바로 사용 가능
  }

}
