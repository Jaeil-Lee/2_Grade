package ABSTRACT;

public abstract class ShapeTest {
  private int x;
  private int y;

  // Shape를 상속받는 자식 클래스는 move 메서드를 그대로 사용하면 된다.
  public void move(int x, int y) {
    this.x = x;
    this.y = y;
    System.out.println("座標を ["+ x +","+ y +"] に移動させました！");
  }

  /*  
    Shape를 상속받는 자식 클래스는 화면에 그리는 기능을 가져야 하지만
    그려지는 모양은 다 다르다.
    따라서, shape 클래스는 그리는 기능을 수행하는 메소드의 시그니처만 선언하고
    메소드 몸체의 구현은 자식 클래스가 하도록 강제성을 부여한다.
  */

  public abstract void draw() ;
}