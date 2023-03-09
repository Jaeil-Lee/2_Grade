package test;

import java.util.Scanner;

public class StringTest_237p {

  public static void main(String[] args) {

    String strValue;
    Scanner scan = new Scanner(System.in); // 사용자로 부터 값을 입력 받기


    // while 반복문 
    while (true) {
      System.out.print("문자열을 입력하세요>");
      strValue = scan.next();

      // 1. 반복문 탈출 
      if (strValue.equals("quit") == true) {
        break;  // 현재 while 반복문 탈출
      } 

      // 2. www.로 시작하는 문자열인지 확인   
      //  ^ 문자열의 시작을 표시 
      if (strValue.matches("^www\\.(.+)")) {  // <=  정규표현식(regular expression)
                                                     //       : 문자열에서 패턴을 찾아내는 데 사용 
        System.out.println(strValue + " 은 'www'로 시작합니다.");
      
      } else {

        System.out.println(strValue + " 은 'www'로 시작하지 않습니다.");
        
      }

    }

  }
}