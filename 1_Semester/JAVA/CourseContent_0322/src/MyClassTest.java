class MyClass {

  // 1. 정적(static) 변수
  static int x;
  int y;

  // 2. 정적(static) 초기화 블록
  static {
    x = 10; // <=정적 변수를 초기화 
    System.out.println("정적 블록이 호출되었음!");
  }

}

public class MyClassTest {
  public static void main(String[] args) {
    
    // 정적 변수가 사용되기 때문에 정적 블록에 의해 초기화!
    System.out.println(MyClass.x); 
    
    /*
      이처럼 직접적으로 객체를 생성하지 않고
      Code Area라는 메모리 영역에 있는 것을 공유하여 사용!
    */ 
  }
}


/*

정적 초기화 블록을 사용하지 않고 정적 변수를 초기화 하려면 정적 메소드로 작성하면 된다


  class Sample {
    public static int myVar = initialize();

    private static int initialize() {
      //정적 변수를 초기화
      return 7777
    }
  }

*/