package ABSTRACT;

public class Rectangle extends ShapeTest {

  // 반드시 ShapeTest 에서 부여되어있는 draw 라는 abstract 메서드를 구현해야한다!!
  @Override
  public void draw() {
    System.out.println("正方形を書きますね！");
  }
}
