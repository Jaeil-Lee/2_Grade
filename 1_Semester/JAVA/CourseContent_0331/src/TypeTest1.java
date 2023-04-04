class A {
  A(){}
}
class B {
  B(){}
}

public class TypeTest1 {
  public static void main(String[] args) {
    // A a = new B();     🟡 클래스 A의 참조 변수로 클래스 B의 객체를 참조할 수는 없음! 🟡
  }
}
