import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Test5 {
  public static void main(String[] args) {
    Sensei s1 = new Sensei("홍길동", 40);
    Sensei s2 = new Sensei("박길동", 34);
    Sensei s3 = new Sensei("고길동", 46);
    Sensei s4 = new Sensei("이길동", 53);
    Sensei s5 = new Sensei("최길동", 28);

    List<Sensei> lists = new ArrayList<>();
    lists.add(s1);
    lists.add(s2);
    lists.add(s3);
    lists.add(s4);
    lists.add(s5);

    /*
     * Sensei 클래스를 변경하지 말고, list에 들어 있는 Sensei 객체들을
     * 1. 나이의 오름차순으로 정렬하여 출력하시오.
     * 2. 유명,무명,람다 3가지 방법으로 각각 구현
     * 3. Collections.sort(List); 이 코드는 컴파일 오류가 발생한다. 이유는?
     */

    print(lists);
    System.out.println("정렬 후");

    /* 1.나이의 오름차순으로 정렬하여 출력하시오. */
    Collections.sort(lists);
    print(lists);

    Collections.sort(lists,new SenseiComparator()) ;


    Collections.sort(lists,new SenseiComparator(){
      // public void compareTo{
        
      } 
    }) ;


    /* 람다, */
    Collections.sort(lists, (Sensei o1 ,Sensei o2 )->{
      return o1.age-o2.age;
    }) ;

  }

  /* 내용 출력 print 메소드 */
  public static void print(List<Sensei> lists) {
    for (int i = 0; i < lists.size(); i++) {
      System.out.println("[" + lists.get(i).name + "," + lists.get(i).age + "]");
    }
    System.out.println();
  }

}


class SenseiComparator implements Comparator<Sensei> {
  @Override
  public int compare(Sensei o1,Sensei o2){
    // return o1.age - o2.age;
    return  o1.age- o2.age;
  }
}
