
public class Test {
  public static void main(String[] args) {
    // String s1 = "BBC";
    // String s2 = "BBC";
    // System.out.println(s1.compareTo(s2));
    // Student std1 = new Student("일지매", "컴정");
    // Student std2 = new Student("홍길동", "컴정");
    // findLarger(std1, std2);

    Car car1 = new Car("HyunDai", "Granduer", 250, 5000);
    Car car2 = new Car("GM", "Impala", 300, 4000);
    Car car3 = new Car();
    System.out.println(car3);
    findLarger(car1, car2);
  }

  public static void findLarger(Comparable c1, Comparable c2) {  /* findLarger( car1 , car2 ) */
    if (c1.compareTo(c2) == 0) {
      System.out.println("같다.");
    } else if (c1.compareTo(c2) > 0) {
      System.out.println("첫번째가 크다.");
    } else{
      System.out.println("두번째가 크다");
    }
  }
}