public class Rectangle {
  private int x, y;
  private int width, height;

  /* 생성자 Overriding */

  // ※ 생성자1 ※
  public Rectangle(){
    this(0,0,1,1);
  }

  // ※ 생성자2 ※
  public Rectangle(int x, int y, int width, int height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  // // 위에 이미 x y 초기화 하는게 있는데 굳이 코드를 반복하노?? 정신 안차릴래?
  // public Rectangle(int width, int height) {
  //   this.x = 0;
  //   this.y = 0;
  //   this.width = width;
  //   this.height = height;
  // }

  // ※ 생성자3 ※
  // this라는 키워드로 생성자내에서 또 다른 생성자를 불러 준다 
  public Rectangle(int width, int height) {
    // System.out.println("ㅋㅋㅋㅋㅋㅋㅋㅋㅋ");  /* error 발생 ! =>  Constructor call must be the first statement in a constructor */
    this( 0 , 0 , width , height ); // 반드시 this()를 사용한 다른 생성자 호출은 항상 첫 번째 문장이어야 한다
  }

  public static void main(String[] args) {

    // 위에 있는 생성자를 불러준다 
    // 생성자 내에서 다른 생성자를 부를 때 그 생성자는 반드시 첫번째에 있어어야된다
    //this 로 다른 생성자를 호출하는 코드가 바디의 첫번 쨰로 나와야한다 !!! 
    Rectangle r1 = new Rectangle (10,20); 
    Rectangle r2 = new Rectangle ( 1 , 1 , 30 ,50); 
  }
}
