package INTERFACE;

interface OperateCar {

  // public abstract 생략 가능!!
  void start();
  void stop();
  void setSpeed(int speed);
  void turn(int degree);

  // 🚩 인터페이스에 새롭게 추가된 메소드
  default public void fly() {  // default 메소드 -> 메소드의 몸체를 넣을 수 있다
    System.out.println("하늘을 날고 있음");
  } 

}

class OldCar implements OperateCar { // 🚩 예전 클래스의 구현 내용을 변경하지 않아도 된다 => 인터페이스에 추가된 메소드들을 구현하지 않아도 됨
  public void start(){};
  public void stop(){};
  public void setSpeed(int speed){};
  public void turn(int degree){};
}


public class DefaultMethodTest2 {
 public static void main(String[] args) {

    OldCar obj = new OldCar();

    obj.fly(); //🚩  이전 객체에서도 새롭게 추가된 메소드를 호출할 수 있다.
 }
}
