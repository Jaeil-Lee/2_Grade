package INTERFACE;

/* 1. 여러개의 인터페이스를 동시에 구현 하는 것 ( 다중 상속의 효과를 낼 수 있다) */

// 인터페이스
interface Drivable {
	void drive();
}
  
interface Flyable {
	void fly();
}


public class FlyingCar1 implements Drivable, Flyable {  // 이렇게 동시에 여러개 인터페이스를  , 를 사용해 구현 가능함
	public void drive() {
		System.out.println("운전하고 있다 안카나");
	}
  
	public void fly() {
		System.out.println("하늘날고 있다아이가");
	}
  
	public static void main(String args[]) {
		FlyingCar1 obj = new FlyingCar1();
		obj.drive();
		obj.fly();
	}
}
