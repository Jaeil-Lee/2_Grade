import java.util.Scanner;

class MyScoreArrayproc {

  final int Five = 5; // 学生の数
  double sum ; // 点数の合計 
  int [] array = new int [Five] ;  // 配列生成
  Scanner scan = new Scanner(System.in); // キーボードからの入力 


  // 1. 成績の入力を受けるgetメソッド
  void getValue() {

    for (int index = 0; index < array.length; index++) {
      System.out.println("성적을 입력하시오: ");

      int inputValue = scan.nextInt();

      array[index] = inputValue;
      
    }
  }

  // 2. 点数の平均を出力するgetメソッド
  double getAverage() {
    
    for (int i = 0; i < array.length; i++) {
      sum += this.array[i] ;
    }
    System.out.println("평균은 :" + (sum/ Five) );
    return sum/ array.length;
  }
}

public class MyScoreArrayprocTest {
  public static void main(String[] args) {
    
    MyScoreArrayproc obj = new MyScoreArrayproc();
    
    // 1. 
    obj.getValue();
    
    // 2. 
    obj.getAverage();

  }
}
