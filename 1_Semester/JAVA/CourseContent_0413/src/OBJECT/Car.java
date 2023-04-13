package OBJECT;

public class Car {

  // 필드 생성
  String brand;
  String model;

  // 🟡 생성자 생성 🟡 ->
  public Car(String brand, String model) {
    this.brand = brand;
    this.model = model;
  }

  // this로 같은 클래스内의 생성자 불러옴
  public Car() {
    this("Unknown", "Unknown");
  }

  // 이 클래스에 정의된 것만 정의할 수 있다.
  @Override
  public boolean equals(Object obj) { // 변환할 수 없는 것을 변환하라고 하면 에러가 난다. thread ~~ 에러 뜬다!

    // 어떤 클래스의 인스턴스인지를 확인한 다음에 다음으로 넘어간다
    // 사용자가 입력 잘못한 경우 이렇게 null 이 들어오면 바로 false를 반환해야한다
    if (obj == null)
      return false;

    /*
     * 🟡 obj가 Car 클래스의 인스턴스가 아니면 바로 false를 반환
     * 자바에는 이 목적으로 사용할 수 있느 연산자(+,-,*,/,%,.....)가 있다
     * 
     * 🟢 📌instanceof📌 가 있다 => 이것도 연산자 이다 🟢
     * 
     * 연산자 사용 예) 3+4 ⭕ , +(3,4)❌
     */

    if (obj instanceof Car == false)
      return false;

    /*
     * obj는 Car 클래스의 객체라 가정한다.
     * 그래야 , Car 클래스의 인스턴스의 brand , model 멤버에 접근할 수 있다.
     */
    Car yourCar = (Car)obj; // 🟡 Car형으로 하향 형변환
    if (yourCar.brand.equals(brand) && yourCar.model.equals(model)) {
      return true;
    }
    return false;
  }

}
