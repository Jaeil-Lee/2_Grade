package lambda;

import java.time.LocalDate;
// import java.util.ArrayList;
import java.util.List; // List쓸라면 import 해 와야 한다 
import java.util.*; // java의 util 에 있는 거 모두 import하겠다는 뜻  


/* 🟢 인터페이스 정의 */  
interface CheckPerson {
  boolean test(Person p);
}

// 🟢 문제 1 클래스
class CheckPersonMale18to25 implements CheckPerson { 
  public boolean test(Person p) {
    return p.getGender() == Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25;
  }
}

// 🟢 문제 2 클래스
class CheckPersonFemale10to20 implements CheckPerson {
  public boolean test(Person p) {
    return p.getGender() == Sex.FEMALE && p.getAge() >= 10 && p.getAge() <= 20;
  }
}

// 🟢 문제 3 클래스
/* 
CheckPerson 인터페이스를 implements 하는 클래스를 하나 생성해서
printPersons메소드를 호추해라 
단 ❗ 이 메소드에 의해 출력되는 Person 객체는 성별이 남자인 객체이어야 한다.
*/
class ImprelemtedByCheckPersonForSex implements CheckPerson { 
  public boolean test(Person p) {
    return p.getGender() == Sex.MALE;  // 성별이 남자인 객체만 반환!!! 
  }
}






/* 🟠 람다식이란❓🟠
    * 오직 하나의 추상 메소드만 가지는 인터페이스 타입의 객체를 람다식으로 생성할 수 있다
    * 람다식은 이름없는 메소드라 할 수 있다.
    * 람다식을 이용하는 이유는 간결하기 때문이다.
    * 람다식을 이용하는 메소드가 필요한 곳에 간단히 메소드를 보낼 수 있다.
    * 람다식은 함수형 프로그래밍을 자바에 도입한 것 이다.
    * 람다식은 오직 하나의 추상 메소드를 가지는 인터페이스 타입의 객체를 요구하는 메소드의 인자로 전달될 수 있다.
    * 람다식의 body가 return 문 하나만으로 구성되어 있으면 return 키워드 , { } ,문장 끝의 세미콜론(;)도 생략할 수 있다
   - 람다식의 문법 - 
   (arg1 , arg2 , ...) -> {body}
   (type1 arg1 , type2 arg2, ...) -> {body}

*/
  

/* ----------------------------------------------------------------------------------------------------------------- */
public class Test {
  public static void main(String[] args) {

    Person p1 = new Person("이재일", LocalDate.of(1999, 10, 1), "lji941001@naver.com", Sex.MALE);
    Person p2 = new Person("김지현", LocalDate.of(2001, 06, 24), "BAE64@naver.com", Sex.FEMALE);
    Person p3 = new Person("정유미", LocalDate.of(1993, 07, 7), "YOUMI77@naver.com", Sex.FEMALE);
    Person p4 = new Person("유홍준", LocalDate.of(1994, 5, 31), "hong99@naver.com", Sex.MALE);
    Person p5 = new Person("한승빈", LocalDate.of(1994, 12, 5), "sungbean12@naver.com", Sex.MALE);

    // lIST 만들기! List는 interface
    // => 이 인터페이스를 구현하는 클래스로 ArrayList , LinkedList 등이 있다.

    
    /* 🟡 설명 🟡
    List는 인터페이스, 이 인터페이스를 구현하는 클래스로
    ArrayList, LinkedList 등이 있다. 
    List<Person> list = new ArrayList<Person>();
    Person 타입의 객체를 원소로 가질 수 있는 리스트를 생성
    */

    /* Person 타입의 객체를 원소로 가질 수 있는 리스트를 생성 */
    // List<Person> list = new ArrayList<Person>();
    List<Person> list = new ArrayList<>(); // 왼쪽에 <Person> 이라고 표시를 했기 때문에 우측에서는 생략이 가능하다.
    list.add(p1); // 이재일
    list.add(p2); // 배지현
    list.add(p3); // 정유미
    list.add(p4); // 유홍준
    list.add(p5); // 한승빈

   


    


    // printPersonOlderThan(list, 20);
    // printPersonOlderThan(list, 20);

    // printPersonsWithinAgeRange(list, 26, 31);

    // CheckPersonMale18to25 cm = new CheckPersonMale18to25();
    // printPersons(list, cm);   => 귀찮으니 아래 처럼 바로 넣어서 생성하자❗
    // printPersons(list, new CheckPersonMale18to25());
    // printPersons(list, new CheckPersonFemale10to20());
    

    // 남자만 생성
    // printPersons(list, new ImprelemtedByCheckPersonForSex());
    
   // 🟢 문제 4 클래스
    /*
      위와 똑같이 성병이 남자인 객체만 출력하도록 
      printPersons 메서드를 호출하되, 무명클래스를 이용해봐라
      CheckPerson 인터페이스를 구현하는 무명클래스를 생성해 printPersons 메서드를 호출하면 된다.
      => 클래스의 선언(정의)과 객체생성을 동시에 할 수 있는 방법이 ⭐무명클래스⭐
    */
    // => 위의 남자만 생성하는 내용을 무명클래스로 생성
        // printPersons(list,  new CheckPerson() {
        //   public boolean test(Person p) {
        //     return p.getGender() == Sex.MALE;  // 성별이 남자인 객체만 반환!!! 
        //   }
        // });
      
    
    // 무명 클래스를 람다식으로 구현해 보자
        // // 1. 타입 준 것
        // printPersons(list, (p)->{return p.getGender()==Sex.MALE;});
        // // 2. 타입 안 준 것   
        // printPersons(list, (Person p)->{return p.getGender()==Sex.MALE;});  
      
      
      
    // 람다식의 매개변수가 오직 하나일 때는 매개변수를 둘러싸는 () 생략할 수 있다.
        // printPersons(list, (p)-> {
        //   System.out.println( p.getGender());
        //   return p.getAge() >30;
        // });

        // printPersons(list, p-> {
        //   System.out.println( p.getGender());
        //   return p.getAge() >=30;
        // });
        
    /* 🟢 문제 🟢 */    
    // 람다식을 이용해서 printPersons 메소드를 호출하고, 
    // 그 결과로 나이 20에서 30살 사이의 여자만 출력되도록 구현

        // 1.version (타입 arg)
        printPersons(list, (Person p)-> {
          System.out.println("1.version (타입 arg)");
          return p.getAge() >=20 && p.getAge() <=30 && p.getGender()==Sex.FEMALE; 
        });
        // 2.version (arg)
        printPersons(list,  (p)-> {
          System.out.println("2.version (arg)");
          return p.getAge() >=20 && p.getAge() <=30 && p.getGender()==Sex.FEMALE; 
        });
        // 3.version arg     -> 이렇게 arrowFunction 사용하는 것 처럼 사용할 수 있다
        printPersons(list,  p-> {
          System.out.println("3.version arg");
          return p.getAge() >=20 && p.getAge() <=30 && p.getGender()==Sex.FEMALE; 
        });
  }
  
 

    /* 🟡 설명 🟡   */
    // collection framework : List , Set , Map , Stack ,Queue (자료 구조들)
    // 여러개의 값으 저장하는 자바의 자료구조
    // 이 자료구조에 들어갈 수 있는 원소 타입을 자바의 gneric 이라는 기능을 이용해 지정할 수 있다.
    // List <Person> Set<Integer> , Map<Stringm Person> , ~~~
    // public static void printPersonOlderThan(List<Person> persons, int age) {

    public static void printPersonOlderThan(List<Person> persons, int age) {
    // // persons 리스트의 각 원소에 대해서 반복문을 수행한다.
    // // 각 원소를 Person 타입의 변수 P에 저장.
    for (Person p : persons) {
      if (p.getAge() >= age) {
        p.printPerson();
        System.out.println();
        }
      }
    }


    /*  🟢 문제  -  메소드 하나 구현 🟢  */
    // Person 객체의 리스트와 CheckPerson 인터페이스를 구현한 객체(tester라 하자)를 전달받고, 
    // 리스트의 각 Person 객체를 tester.test 메소드의 인자로 전달해, 그 반환 값이 true이면
    // 그 Person 객체의 정보를 출력.
    public static void printPersons (List<Person> list , CheckPerson tester) {  
      for(Person p: list) {                       //   ⭐ 로직을 전달하는 것 ⭐ =>  CheckPerson tester
        if(tester.test(p)) {
          p.printPerson();
          System.out.println();
        }
      }
    }

    /*  🟢 문제  -  메소드 하나 구현 🟢
    List<Person List , int Low , int hight
    위 세개의 매개변수를 통해 Person 객체 리스트와 , 나이의 범위 (Low 이상 ,hight 미만)를
    입력으로 받아, 저 나이 범이의 person 정보만 출력하는
    printPersonsWithinAgeRange를 통해 구현   */
    public static void printPersonsWithinAgeRange(List<Person> list, int low, int hight) {
      for (Person p : list) {
        if (p.getAge() >= low && p.getAge() < hight) {
          p.printPerson();
          System.out.println();
        }
      }
    }


  
   

}

