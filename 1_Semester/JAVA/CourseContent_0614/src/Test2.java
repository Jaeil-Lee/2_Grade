import java.util.*;

public class Test2 {
  public static void main(String[] args) {

    // ArrayList<String> list= new ArrayList<>(); -> 우측 파라미터 생략 가능

    List<String> lists = new ArrayList<String>();
    lists.add("budou");
    lists.add("mikann");
    lists.add("Suika");
    lists.add("rinngou");
    lists.add("banana");
    print(lists);

    Collections.sort(lists);
    System.out.println("정렬후");
    print(lists);
  }

  public static void print(List<String> lists) {
    for( String list : lists){
      System.out.println(list);
    }
    System.out.println();
  }
}
