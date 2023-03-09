package test;

public class StringTest {
  public static void main(String[] args) {
    System.out.println("----------------------------------------------------------------------------------------------");
   
    /* 
      String 객체는 immutable 이다 , mutable이 아니다. 
        =>  String 객체의 값은 변경할 수 없다!!!

      문자열은 자주 사용되므로 new 연산자를 사용하지 안혹 문자열을 상수로 표기해도 자동적으로 객체가 생성된다
    */



/* 1 */ 
    String proverb = "A barking dog";  // 이렇게 해도 객체가 생성된다 
    String stringT1, stringT2 ,stringT3, stringT4 ;


  //     * 지것은 절대 안 바꾼다 *  

    // proverb에게 물어본다. 길이 얼마고?
    System.out.println(proverb.length()); 

    // 기존의 proverb값은 그대로 있기 때문에 새로 생성한 것을 변수에 저장해 활용해야 한다 
    stringT1= proverb.concat("never Bites!");  //  concatenate : 연결하다
    System.out.println(stringT1);

    stringT2 = proverb.replace("b", "B"); // target : b  , replacement : B
    System.out.println(stringT2);

    stringT3 = proverb.substring(2,3);  // begin - 포함  , end - 미포함 
    System.out.println(stringT3);
    
    stringT4 = proverb.toUpperCase();  // begin - 포함  , end - 미포함 
    System.out.println(stringT4);

/* 2 */
    // JVM이 내부적으로 전처리 과정을 통해 문자와 숫자를 더할 경우 숫자를 문자열로 변환시킨다, 그 값을 concatenation 시킨다
    int intValue =20;
    System.out.println("betty야" + intValue + "% 만큼 사랑한다");

    System.out.println("100" + intValue);
    System.out.println(100 + intValue);



/* 3 */
    String testValue = "12345";

    int integerValue = Integer.parseInt(testValue);  // Static Method (정적 매소드)  ! 
    double doubleValue = Double.parseDouble(testValue);  // Static Method (정적 매소드)  ! 

    System.out.println(integerValue); //int 형이 저장
    System.out.println(doubleValue);  // double 형이 저장

  }
}
