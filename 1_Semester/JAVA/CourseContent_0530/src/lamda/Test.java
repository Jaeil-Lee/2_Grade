package lamda;

import java.time.LocalDate;
// import java.util.ArrayList;
import java.util.List; // List쓸라면 import 해 와야 한다 
import java.util.*; // java의 util 에 있는 거 모두 import하겠다는 뜻  

public class Test {
  public static void main(String[] args) {

    Person p1 = new Person("이재일", LocalDate.of(1999, 10, 1), "lji@naver.com", Sex.MALE);
    Person p2 = new Person("김떙떙", LocalDate.of(2001, 06, 24), "BAE@naver.com", Sex.FEMALE);
    Person p3 = new Person("정유미", LocalDate.of(1993, 07, 7), "YOUMI@naver.com", Sex.FEMALE);

    // lIST 만들기! List는 interface
    // => 이 인터페이스를 구현하는 클래스로 ArrayList , LinkedList 등이 있다.

    
    /* 🟢 설명 🟢
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

    // printPersonOlderThan(list, 20);
    // printPersonOlderThan(list, 20);

    // printPersonsWithinAgeRange(list, 26, 31);

    // CheckPersonMale18to25 cm = new CheckPersonMale18to25();
    // printPersons(list, cm);   => 귀찮으니 아래 처럼 바로 넣어서 생성하자❗
    printPersons(list, new CheckPersonMale18to25());
    // printPersons(list, new CheckPersonFemale10to20());

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
  /* ❌ 위에 코드원래 이렇게 했는데 , 오류가 나더라  ❌*/
  // for (Person p : persons) {
  // if (p.getAge() >= age) {
  // p.printPers();
  // System.out.println();
  // }
  // }

  // }




  /*  🟢 문제  -  메소드 하나 구현 🟢
    List<Person List , int Low , int hight
    위 세개의 매개변수를 통해 Person 객체 리스트와 , 나이의 범위 (Low 이상 ,hight 미만)를
    printPersonsWithinAgeRange를 통해 구현   */
    public static void printPersonsWithinAgeRange(List<Person> list, int low, int hight) {
        for (Person p : list) {
            if (p.getAge() >= low && p.getAge() < hight) {
              p.printPerson();
              System.out.println();
            }
        }
    }



    // Person 객체의 리스트와 CheckPerson 인터페이스를 구현한 객체(tester라 하자)를 전달받고, 
    // 리스트의 각 Person 객체를 tester.test 메소드의 인자로 전달해, 그 반환 값이 true이면
    // 그 Person 객체의 정보를 출력.
    public static void printPersons (List<Person> list , CheckPerson tester) {
      for(Person p: list) {
        if(tester.test(p)) {
          p.printPerson();
          System.out.println();
        }
      }
    }
}

// 인터페이스도 클래스 처럼 
interface CheckPerson {
  boolean test(Person p);
}

// 🟡 문제 1 클래스
class CheckPersonMale18to25 implements CheckPerson {
  public boolean test(Person p) {
    return p.getGender() == Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25;
  }
  
}
// 🟡 문제 2 클래스
class CheckPersonFemale10to20 implements CheckPerson {
  public boolean test(Person p) {
    return p.getGender() == Sex.FEMALE && p.getAge() >= 10 && p.getAge() <= 20;
  }
}