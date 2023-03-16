import javax.sql.rowset.spi.SyncResolver;

class Date {
  private int year;
  private String month;
  private int day;

  // 1. default 생성자
  public Date(int year, String month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  // 2. 생성자 Overloading  
  public Date (int year) {
    this(year,"10월",1);
  }

  // 3. 생성자 Overloading
  public Date() {
    this(1994, "10월", 1);
  }

  @Override
  public String toString() {
    return "Date [year=" + year + ", month=" + month + ", day=" + day +"]";
  }

}

public class DateTest {
  public static void main(String[] args) {

    Date date1 = new Date(1966, "08월", 9);
    System.out.println(date1);
    Date date2 = new Date(1969);
    System.out.println(date2);
    Date date3 = new Date();
    System.out.println(date3);
  }
}
