package SHAPE_REORGANAZATION;

public class ShapeTest3 {
  public static void main(String[] args) {

    // 🟡 객체 생성 🟡
    Rectangle rt = new Rectangle();
    Triangle tg = new Triangle();
    Circle cc = new Circle();


    // 위에서 생성한 각 객체들을 static 메서드 호출 
    print(rt);
    print(tg);
    print(cc);
  }

  // 🟡 1. Shape라는 객체가 자료형으로 들어온다 !
  public static void printLocation(Shape shape) {
    System.out.println("x = " + shape.getX() + ", " + shape.getY());
  }


  // 2. static 메서드
  public static void print(Object obj) {
    if (obj instanceof Shape) {
      printLocation((Shape) obj);
    } else {
      System.out.println("I can't handle this object!");
    }
  }
}
