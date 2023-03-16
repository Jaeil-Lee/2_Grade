class MyCounterArg {
  int counter;

  // MyCounter의 생성자 -> 매개변수로 받기
  MyCounterArg(int value) {
    counter = value;
    System.out.println("MyCounter가 실행되었습니다~!");
  }
}

public class MyCounterTestArg {
  public static void main(String[] args) throws Exception {

    System.out.println("---------------------------------------------------------------------------------------");

    MyCounterArg obj1 = new MyCounterArg(100);
    MyCounterArg obj2 = new MyCounterArg(200);
    System.out.println("객체 1의 counter =" + obj1.counter);
    System.out.println("객체 2의 counter =" + obj2.counter);

  }
}
