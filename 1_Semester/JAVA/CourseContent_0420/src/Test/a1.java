package Test;

public class a1 {
  public int a =1;
  public int b =2;
public a1 ( ) {
  this(1,2);
  System.out.println("ㅋㄹㅋㄹㅋㄹㅋㄹㅋㄹ");
}


public a1 (int arg1 ,int arg2 ) {
  System.out.println(arg1+arg2);
}


public void go () {
  System.out.println("이게 재정의 되면 자식 클래스의 메소드가 대신호출된단다");
}
}
