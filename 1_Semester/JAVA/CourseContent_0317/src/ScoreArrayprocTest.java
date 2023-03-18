import java.util.Scanner;

class ScoreArrayproc {

  public void getValues (int[] array) {
    Scanner scan = new Scanner(System.in);
    for (int index = 0; index < array.length; index++) {
      System.out.println("성적을 입력하시오 : ");
      array[index] = scan.nextInt();
    }
  }


  public double getAverage (int[] array) {
    double total = 0;
    for (int index = 0; index < array.length; index++) {
      total += array[index];
    }
      return total / array.length;
  }
}


public class ScoreArrayprocTest {
  final static int STUDENTS = 5;
  public static void main(String[] args) {
    int [] scores = new int[STUDENTS];

    ScoreArrayproc obj = new ScoreArrayproc();

    obj.getValues(scores);
    System.out.println("평균은 = " + obj.getAverage(scores));
  }
}
