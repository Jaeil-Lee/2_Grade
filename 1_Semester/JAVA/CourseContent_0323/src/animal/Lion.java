package animal;

/* 2. Lion class - Super class로부터 '상속' 받는다*/
public class Lion extends Animal {

  private int legs = 4; // Lion 발개수를 나타내는 고유의 legs 변수

  void roar(){System.out.println("roar()가 호출되었음");}; // Lion 으르렁 거리는 행동을 나타내는 고유의 roar 메서드

  @Override
  public String toString(){
    System.out.println("Lion객체 생성 완료");
    return "Lion객체 생성 완료";
  }
}