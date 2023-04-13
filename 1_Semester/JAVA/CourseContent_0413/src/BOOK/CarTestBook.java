package BOOK;

/*
   🚩String 클래스에서는 Object 클래스에 정의된 equals()를 그대로 사용하지 않고 
      "오버라이드" 하여서 객체 안에 저장된 문자열이 동일하면 true를 반환하도록 수정하여 사용한다
 */

public class CarTestBook {
  public static void main(String[] args) {

    /* getClass 메소드 구현 */
    // Car obj = new Car();
    // System.out.println("obj is of type " + obj.getClass().getName()); // 객체를 생성한
    // 클래스 이름을 반환! getClass의 getName

    /* equals 메소드 구현 */
    CarBook firstCar = new CarBook("G80");
    CarBook secondCar = new CarBook("G80");

    if (firstCar.equals(secondCar)) {
      System.out.println("같은 종류의 차다 => G80");
    } else {
      System.out.println("같은 차종이 아니다!!!");
    }

  }
}
