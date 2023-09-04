package INTERFACE;

/* 2. 하나의 클래스를 상속받고 또 하나의 인터페이스를 구현하는 것 ( 다중 상속의 효과를 낼 수 있다) */


interface Flyable {
	void fly();
}


class Car {
  int speed;
  void setSpeed (int speed){
    this.speed = speed;
  }
}


public class FlyingCar2 extends Car implements Flyable {  // 상속과 인터페이스를 동시에 갖는다
	
	public void fly() {
		System.out.println("하늘날고 있다아이가");
	}
  
	public static void main(String args[]) {
		FlyingCar2 obj = new FlyingCar2();
		obj.setSpeed(300);
		obj.fly();
	}
}