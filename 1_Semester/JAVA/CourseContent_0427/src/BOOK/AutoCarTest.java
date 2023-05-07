package BOOK;

public class AutoCarTest {
  public static void main(String[] args) {

    OperateCar obj = new AutoCar(); // 🟡 interface도 class처럼 부모형으로 사용가능 🟡
    obj.start();
    obj.setSpeed(300);
    obj.turn(180);
    obj.stop();
    
  }
}
