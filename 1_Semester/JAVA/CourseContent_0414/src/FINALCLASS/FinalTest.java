package FINALCLASS;

public class FinalTest {

  // 바둑 게임 관련 클래스라고 가정
  // getFirstPlayer는 바둑에서 첫 번쨰 돌을 반환한다.
  // 그런데 바둑에서는 첫번 째 돌은 무조건 흑돌이어야 한다.
  // 이런 경우 , 이 클래스를 상속받는 하위 클래스에서 절대 
  // 이 메소드를 재정의하지 못 하도록 종단 메소드로 만들 필요가 있다.
  public final String getFirstPlayer() {  
    return "黒";
  }
}
