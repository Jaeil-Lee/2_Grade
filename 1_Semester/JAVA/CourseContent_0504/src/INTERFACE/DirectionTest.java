package INTERFACE;

interface Direction {

  /*
     🚩interface에 정의 된 멤버 변수는 모두  🟡상수🟡 이다.
     🚩  public static final이 앞에 부터 있다고 생각하면 된다 
  */

  // 🟡상수🟡
  int NORTH = 1;
  int EAST = 1;
  int SOUTH = 1;
  int WEST = 1;
}

public class DirectionTest implements Direction {
  public static void main(String[] args) {
    
    System.out.println("NORTH: " +Direction.NORTH);
    System.out.println("NORTH: " +Direction.EAST);
    //  System.out.println("NORTH: " +Direction.SOUTH = 1);  
    //    => 상수라서 이것은 객체가 생성되었지 않기 때문에 안 된다 ❌❌❌❌


    // Direction 인터페이스를 구현하면 , 나의 상수인 것 처럼 그냥 아래와 같이 사용할 수 있다. 
    System.out.println("WEST : " + WEST);

  }
}