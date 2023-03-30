package CONSTRUCTOR_OF_INHERITANCE;


// 🟡 묵시적인 호출 🟡 
/*
  부모 클래스의 생성자를 호출해 주지 않아도 자식 클래스의 객체가 생성될 때 
  자동적으로 부모 클래스의 매개 변수가 없는 생성자가 호출된다  
*/
class Shape {
  public Shape () {
    System.out.println("Shape 생성자 ()");
  }
}
class Rectangle extends Shape {
  public Rectangle () {
    // 🟡 컴파일러가 Shape(); 를 자동적으로 생성해 준다
    System.out.println("Rectangle 생성자 ()");
  }
}

public class ImplyingCall {
  public static void main(String[] args) {
    // Rectangle 객체를 생성하면  Rectangle 클래스의 생성자가 호출되기 전에 Shape 클래스의 생성자가 호출 된다
    Rectangle rectangleObj = new Rectangle(); 
  }
}
