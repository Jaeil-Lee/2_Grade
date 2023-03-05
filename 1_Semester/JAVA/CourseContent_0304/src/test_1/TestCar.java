package test_1;

// Car 클래스 정의
class Car {
	
  // 멤버 변수
	String color; 
	int speed; 
	int gear; 

  // 멤버 메소드	 
	public String toString() { 
		
		/*메소드 종료!*/
		return "Car :  color = " + color + ", speed = " + speed + ", gear = " + gear ;
	}
	
	void colorChoice(String argColor) {
		color = argColor;
	}
	
	void changeGear(int argGear) {
		gear = argGear;
	}

	void speedUp() {
		speed = speed + 10;
	}

	// 
	void speedDown() {
		speed = speed - 10;
	}
}


public class TestCar {

	public static void main(String[] args) {

		
		// 1. myCar 객체 생성
		Car myCar = new Car();
		
		// 2. myCar의 color , speed , gear 변경
		myCar.colorChoice("black");
		myCar.speedUp(); // 스피 10 추가
		myCar.speedUp(); // 스피 10 추가
		myCar.speedUp(); // 스피 10 추가  => 총 스피드 30 증가
		myCar.changeGear(1);

		// 3. 출력
		System.out.println(myCar);

	}

}
