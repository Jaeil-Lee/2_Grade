
public class IndexExceeded {
  public static void main(String[] args) {
    int[] a = new int[10];
    
    for (int i = 0; i <= 10; i++) {
      if (i>= 9) {
        System.out.println("index 초과랑께 !");
        break;
      }
      a[i] = i+1;   // 인덱스를 넘어가서 실행 안됨!!
    }

    System.out.println("프로그램을 종료합니다. ");  
  }
}