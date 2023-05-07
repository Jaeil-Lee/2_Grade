package BOOK;

public interface OperateCar {

  // public abstract 생략 가능!!
  void start();
  void stop();
  void setSpeed(int speed);
  void turn(int degree);
  
} 

class AutoCar implements OperateCar{

  public void start() {
    System.out.println("車が発車いたします。");
  }
  
  public void stop() {
    System.out.println("車が停車いたします。");
  }
  
  public void setSpeed(int speed) {
    System.out.println("車がスピードを"+ speed +"km/hに変えます。");
  }
  
  public void turn(int degree) {
    System.out.println("車が方向を"+ degree +"度、変えます。");
  }
  
}
