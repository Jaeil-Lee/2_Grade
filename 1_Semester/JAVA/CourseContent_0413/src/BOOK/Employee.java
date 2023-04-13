package BOOK;

/* 상속은 is-a관계  : ~은 ~이다 */

/*
  has-a관계를 구현  : 구성관계 또는 집합 관계 
    => 하나의 객체가 다른 객체의 부품이됨
    => 객체 안에 하나라도 다른 객체가 포함되면 has-a관계
*/

public class Employee {
  private String name;
  private Date birthDate; // has-a 관계를 구현!! , Date 클래스가 자료형으로 사용되었다

  //            String 객체형    Date 클래스 객체형
  public Employee(String name, Date birthDate) {
    this.name = name;
    this.birthDate = birthDate;
  }

  // 오버라이드로 구현
  @Override
  public String toString() {
    return "Employee [name=" + name + ", birthDate=" + birthDate + "]";
  }

}
