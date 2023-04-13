package BOOK;

// Employee에서 사용될 Date 클래스
public class Date {
  private int year;
  private int month;
  private int date;

  public Date (int year, int month ,int date){
    this.year = year;
    this.month = month;
    this.date = date;
  }

  // 오버라이드 
  @Override 
  public String toString () {
    return "날짜 [ 년= " + year + ",달= "+month + ", 일= "+date +"]";
  }
}
