package animal;

/* 3. Eagle class - Super class로부터 '상속' 받는다*/
public class Eagle extends Animal {

  private int wings = 4; // Eagle 날개수를 나타내는 고유의 wings 변수

  void fly(){System.out.println("roar()가 호출되었음");}; // Eagle 나는 행동을 나타내는 고유의 fly 메서드
  
}
