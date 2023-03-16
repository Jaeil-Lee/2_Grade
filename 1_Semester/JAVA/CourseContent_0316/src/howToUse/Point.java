package howToUse;

public class Point {
  private int x = 0;
  private int y = 0;

  /* 
    생성자 =>  this 매개 변수와 필드의 이름이 같은 경우에 편리하다 
              " this. " 를 붙이면 필드가 된다  
  */
        public Point (int x , int y) {
    this.x = x;
    this.y = y;
  }
}
