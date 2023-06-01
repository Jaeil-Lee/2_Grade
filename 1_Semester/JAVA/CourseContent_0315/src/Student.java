import java.time.LocalDate;
// 사용자가 필요하는 모든 기능은 입캡슐레이션(캡슐화) 시켜 놔야하지 , 사용자가 만들게 해서는 안된다
public class Student {
  private String name;
  private int birthYear;

  // name set 메서드
  public void setName(String name) {
    this.name = name;
  }

  // birthYear set 메서드
  public void setBirthYear(int birthYear) {
    if (birthYear >= 1900) {
      this.birthYear = birthYear;
      return;
    }
  }

  // name get 메서드
  public String getName() {
    return name;
  }

  // age get 메서드
  public int getAge() {
    LocalDate d = LocalDate.now();
    int year = d.getYear();
    return (year - birthYear);
  }
}

