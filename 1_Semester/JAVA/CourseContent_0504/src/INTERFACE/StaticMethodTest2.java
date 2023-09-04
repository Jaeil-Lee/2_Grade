package INTERFACE;

import javax.swing.plaf.synth.SynthSpinnerUI;


/* 인터페이스 */
interface Employable {
  String getName();


  // ⭐이름 검사 유틸리티 - static 메소드라 바로 호출이 가능하다⭐
  static boolean isEmpty(String str) {
    if (str == null || str.trim().length() == 0) {  // trim()은 문자열의 앞뒤 공백을 제거하는 메소드 , 문자열의 앞뒤에 있는 모든 공백 문자(공백, 탭, 개행 등)을 제거
      return true;
    } else {
      return false;
    }
  }
}

/* 클래스 */
class Employee implements Employable {

  private String name;

  // Employee의 생성자
  public Employee(String name) {
    if (Employable.isEmpty(name) == true) { // 정적 메소드를 if문의 조건절에 넣음
      throw new RuntimeException("이름은 반드시 입력해라 마"); // 예외 발생 문장 
    }

    this.name = name;
  }

  @Override
  public String getName() {
    return this.name;
  }

}

public class StaticMethodTest2 {
  public static void main(String[] args) {
    Employable employee1 = new Employee ("이재일");
    System.out.println(employee1.getName());
     Employable employee2 = new Employee ("");  // 이름 없으면 에라 발생
  }
}
