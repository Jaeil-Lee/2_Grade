import java.util.List; // List쓸라면 import 해 와야 한다 


public class Test {
  public static void main(String[] args) {
    
  }
}


package lamda;


public class Test {
  public static void main(String[] args) {
  }


  // collection framework : List , Set , Map , Stack ,Queue  (자료 구조들)
  // 여러개의 값으 저장하는 자바의 자료구조
  // 이 자료구조에 들어갈 수 있는 원소 타입을 자바의 gneric 이라는 기능을 이용해 지정할 수 있다.
  // List <Person> Set<Integer> , Map<Stringm Person> , ~~~ 
  public static void  printPersonOlderThan(List<Person> persons,int age) {

    //persons 리스트의 각 원소에 대해서 반복문을 수행한다.
    // 각 원소를 Person 타입의 변수 P에 저장. 
    for (Person p : persons) {
        if (p.getAge() >= age) {
          p.printPers();
        }
    }

  }
}
