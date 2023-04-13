package BOOK;

public class EmployeeTest {
  public static void main(String[] args) {
    
    // Date 객체  오버라이딩 내용 구현용
    Date birth = new Date(1994, 10, 01);
    // Employee 객체  오버라이딩 내용 구현용
    Employee employee = new Employee("이재일", birth);

    // 출력
    System.out.println(employee);
  }
}
