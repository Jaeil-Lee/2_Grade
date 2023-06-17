package lambda;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test2 {
  public static void main(String[] args) {
    /*
     * 1. Person 객체를 5개 이상 생성해 ArrayList에 저장하시오.
     * 2. printGender 메소드를 호출하시오. 
     *    가. printGender 메소드는 1번에서 생성한 ArrayList의 각 원소에 대해
     *        그 원소가 남자이면 "OOO은 남자입니다."
     *        그 원소가 여자이면 "OOO은 여자입니다 " 를 출력한다. 
     * 3. 구현해보시오. 지금. 
     *    가. printGender 메소드를 호출할 때, CheckPerson 객체를 인자로 넘겨줘야 하는데, 
     *       그 객체가 남자인지 여자인지를 판단해서 남자이면 true를 여자이면 false를 반환한다. 
     */
    Person p1 = new Person("고길동", LocalDate.of(2000, 1, 4), "gdhong@gmail.com", Sex.MALE);
    Person p2 = new Person("일지매", LocalDate.of(1995, 2, 12), "gmil@gmail.com", Sex.FEMALE);
    Person p3 = new Person("박문수", LocalDate.of(1988, 5, 31), "mspark@gmail.com", Sex.MALE);
    Person p4 = new Person("둘리", LocalDate.of(1985, 3, 4), "dr@gmail.com", Sex.MALE);
    Person p5 = new Person("엘사", LocalDate.of(2003, 4, 21), "elsa@gmail.com", Sex.FEMALE);

    List<Person> list = new ArrayList<>();
    list.add(p1); list.add(p2); list.add(p3); list.add(p4); list.add(p5);

    /* CheckPerson 인터페이스 객체를 만드는 방법 3가지
     * 1. 클래스를 정의하고 그 클래스의 객체를 생성
     * 2. 무명클래스로 생성
     * 3. 람다식으로 생성
     */
    // printGender(list, (p)->p.getGender()==Sex.MALE);
    printPeronsLambda(list, (p)->p.getGender()==Sex.FEMALE, (p)->{System.out.println(p.getName());;});
  }


  public static void printGender(List<Person> list, CheckGender cg) {
    for (Person p : list) {
      if(cg.isMale(p)) {
        System.out.println(p.getName() + "은 남자입니다.");
      } else {
        System.out.println(p.getName()+"은 여자입니다.");
      }
    }
  }

  /* 
   * Java에서는 유용하게 사용할 수 있는 Functional Interface를 제공하고 있다. 
   * Functional Interface는 오직 하나의 추상 메소드를 가지는 제네릭 인터페이스이다. 
   * 즉, 이 타입의 객체를 원하는 곳에는 람다식으로 전달할 수 있다. 
   */
  public static void printPerons(List<Person> list, Predicate<Person> pred) {
    for (Person p : list) {
      if(pred.test(p)) {
        System.out.println(p.getName() + "은 남자입니다.");
      } else {
        System.out.println(p.getName()+"은 여자입니다.");
      }
    }
  }

  /*
   * interface Predicate<T> {
   *    boolean test(T t);
   * }
   * 
   * Predicate<Person> 
   * 
   * interface Predicate {
   *  boolean test(Person t);
   * }
   * 
   * interface Consumer<T> {
   *  void accept(T t);
   * }
   * 
   * Consumer<Person>
   * 
   * interface Consumer {
   *  void accept(Person t);
   * }
   */

  public static void printPeronsLambda(List<Person> list, Predicate<Person> pred, 
              Consumer<Person> c) {
    for (Person p : list) {
      if(pred.test(p)) {
       c.accept(p);
       System.out.println();
      } 
    }
  }
}

interface CheckGender {
  boolean isMale(Person p);
}