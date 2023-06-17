



class Betty <S,I> {
  private S name;
  private I age;


  public Betty (S name , I age) {
    this.name = name;
    this.age = age;
  }

  public <T> void method1 (T[] onlyArray ) {
    for (T arr : onlyArray) {
      System.out.println(arr);
    }
    System.out.println();
  }
}

public class Ni {
  public static void main(String[] args) {
      Betty<String,Integer> b = new Betty<>("이재일",30); 
      String[] arr = {"이재일","니 소뱅 합격이다 마 ㅋㅋㅋㅋㅋ"};
      b.method1(arr);
  }
}
