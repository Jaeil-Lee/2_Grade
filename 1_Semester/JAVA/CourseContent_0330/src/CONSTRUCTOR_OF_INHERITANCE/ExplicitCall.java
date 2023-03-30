package CONSTRUCTOR_OF_INHERITANCE;


/* 
자식 클래스는 부모 클래스에서 상속된 부분과 자식 클래스가 추가한 부분이 합쳐져 있다고 생각해야한다.
따라서  자식 클래스의 객체를 생성하면 자식 클래스 안의 부모 클래스 부분을 초기화하기 위하여
자식 클래스의 생성자가 호출 되는 것이다
*/

// 🟡 명시적인 호출 - super 키워드 사용🟡   

class Shape {
  public Shape () {
    System.out.println("Shape 생성자 ()");
  }
}
class Rectangle extends Shape {
  public Rectangle () {
    super(); // 🟡 명시적인 호출 , 부모 클래스의 호출은 반드시 생성자의 첫 번쨰 줄이어야 한다!
    System.out.println("Rectangle 생성자 ()");
  }
}


public class ExplicitCall {
  public static void main(String[] args) {
    Rectangle rectangleObj = new Rectangle(); 
  }
}
