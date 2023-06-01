
class Car {
  private String 회사;
  private String 차종;
  private int 최대속력;
  private boolean 에어백;
  private String 옵션;
  

public Car (String 회사 ,String 차종 , int 최대속력 , boolean 에어백 ){
  this.회사 = 회사;
  this.차종 = 차종;
  this.최대속력 = 최대속력;
  this.에어백 = 에어백;
}
public Car (String 회사 ,String 차종 , int 최대속력 , boolean 에어백, String 옵션 ){
  this.회사 = 회사;
  this.차종 = 차종;
  this.최대속력 = 최대속력;
  this.에어백 = 에어백;
}

public void set옵션(String 옵션) {
  this.옵션 = 옵션;
}

@Override
public String toString () {
  return "[ 회사: " +회사+ " , 차종: "+차종+ ", 최대속력: " + 최대속력+ ", 에어백 :" + 에어백 + ", 옵션 :"+옵션+"] ";
}
  
}


public class test {
  public static void main(String[] args) {
    Car g1 = new Car("현대","Genesis",300, true );
    g1.set옵션("엉따추가");
    Car g2 = g1;

    System.out.println(g1);
    
    g2.set옵션("타이어 개조");
    System.out.println(g2);
    System.out.println(g1);
  }
}
