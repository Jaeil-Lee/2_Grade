class Time {
  private int hour;
  private int minute;
  private int second;

  @Override
  public String toString() {
    return String.format("%02d : %02d : %02d" , hour , minute , second);
  }

  // default 생성자
  public Time () {
    this(0,0,0);
  }

  // 생성자 Overloading
  public Time(int h, int m, int s) {
    hour   = (( h >= 0 && h < 24   ?  h  :  0 ));
    minute = (( m >= 0 && m < 60   ?  m  :  0 ));
    second = (( s >= 0 && s < 60   ?  s  :  0 ));
  }
}

public class Timeteset {
  public static void main(String[] args) {

    // 1. default 생성자 출력
    Time time1 = new Time();
    System.out.println("기본 생성자 호출 후 시간 :  " +  time1.toString());

    // 2. 생성자 출력
    Time time2 = new Time(8,58,35);
    System.out.println("두번째 생성자 호출 후 시간 :  " +  time2.toString());

    // 3. Overloading 생성자에서 지정한 조건을 충족하지 못 할 때의 결과 출력
    Time time3 = new Time(38,88,95);
    System.out.println("두번째 생성자 호출 후 시간 :  " +  time3.toString());
  }
}
