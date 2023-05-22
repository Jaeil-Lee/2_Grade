
public class Test {


  // 메서드
  public void test(MyInterface1 m1) {
    m1.print("헬로우 월드");
  }

  public static void main(String[] args) {

    Test t = new Test(); // 객체 생성 

    t.test(new MyInterface1() {
      public void print(String s) {
        System.out.println(s);
      }
    });
  }
}
