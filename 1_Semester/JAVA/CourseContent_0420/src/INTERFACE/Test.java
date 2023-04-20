package INTERFACE;

public class Test {
  public static void main(String[] args) {

    // String s1 = "BBC";
    // String s2 = "ABD";
    // String s2 = "ABDdfaa";  // 앞에 첫 글자 순서로 본다
    // System.out.println(s1.compareTo(s2));  // 2개의 값만 비교할 수 있으면 정렬이 가능하다.
    Student std1 = new Student("일지매", "컴정");
    Student std2 = new Student("홍길동", "컴정");

    findLarger(std1, std2);
    
  }
    public static void  findLarger (Comparable c1 , Comparable c2) {
      
      if (c1.compareTo(c2) == 0) {
        System.out.println("같다");

      } else if (c1.compareTo(c2) > 0) {
        System.out.println("첫 번째가 크다");

      } else {
        System.out.println("두 번째가 크다");
      }

  }
}
