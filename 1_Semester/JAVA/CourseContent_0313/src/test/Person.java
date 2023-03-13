package test;
/*
 * member variable 은 특별한 이유가 없는한 private로 만들어라!
 * 그 member variable을 클래스 외부에서 접근해야 한다면 그를 위한
 * method를 public으로 구현해라
 * 예를 들어, myAge라는 member variable에 값을 설정해야하는 메소드는 
 * setAge로 , myAge라는 member variable 의 값을 읽어오는 메소드는 getAge로
 * public 접근 제어지정자를 명시하여 구현하면 된다.
 * 이렇게 함으로써 member variable에 잘못된 값이 설정되는 것을 막을 수도 있고
 * 향후에 그 클래스를 버전 업 하면서 member variable의 이름을 변경해도
 * 그 클래스를 사용하는 외부 클래스에는 아무 영향을 미치지 않게 된다.
  
    접근 제어 지정자 (access modifier)
     - public : public이 명시된 member (variable , method) 그 클래스 내부, 외부 어느 곳에서든 접근 가능 하다

     - protected : protected가 명시된 member는 그 클래스 내부, 그리고 ※ 그 클래스의 자식 ※, 
                   그리고 그 클래스와 같은 패키지에 속한 다른 클래스에서도 접근 가능 하다

     - default : 접근 제어 지정자가 명시되지 않은 경우 , 이를 default 접근 제어 지정자 라고 한다
                  default 접근 제어 지정자가 명시된 member는 그 클래스 내부, 그리고 그 클래스와 같은 패키지에 속한 다른 클래스에서도 접근 가능하다.

     - private : 같은 class 내에서만 접근이 가능
 
      ★★★★★ 사실상 public , private 두 개만 사용한다 , 하지만 시험에서는 전부 다 사용한다꼬.........;;;; ★★★★★
     
 */

public class Person {
  /* private - 읽기 전용 값들이다 */
  private String name = "이재성";
  private int myAge;     // private 써도 내부에서는 아무 문제가 없다 , private 쓰면 읽기 전용 멤버 변수를 만들 수 있다
  String dept = "컴정";  // 외부에서 접근 못한다 ,  private 쓰면 getDept가 못 보게 된다.   

 // 값을 설정해주는 public 메소드는 없다 !!!! 

  public String getDept() {
    return dept;
  }

  public String getName() {
    return name;
  }

  // 맴버변수 , 매개변수 구분은 this로 ! 
  public void setAge (int age) {
    if(age >=0 && age <= 150)
      this.myAge = age;
    System.out.println("나이의 범위는 0부터 150까지 입니다.");
  }

  public int getAge () {
    return myAge;
  }

  private void test() {
    System.out.println(name);
  }
}
