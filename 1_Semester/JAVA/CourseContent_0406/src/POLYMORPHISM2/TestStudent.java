package POLYMORPHISM2;

public class TestStudent {
  public static void main(String[] args) {

    Student[] stds = new Student[5];
    stds[0] = new Student("이재일", "10131501");
    stds[1] = new Student("김지수", "10131499");
    stds[2] = new Student("배지현", "10132573");
    stds[3] = new Student("이다슬", "10111584");
    stds[4] = new Student("최은희", "10107574");

    Util2.selectionSort(stds);

    for (Student std : stds) {
      System.out.println(std);
    }

  }
}
