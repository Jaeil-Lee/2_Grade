import java.util.ArrayList;

/*
  🟡 자바에서는 클래스 안에서 클래스를 정의할 수 있다 🟡
   - 외부 클래스 (outer class) : 내부에 클래스를 가지고 있는 클래스
   - 내부 클래스 (nested class) : 클래스 내부에 포함되는 클래스

  🟡 내장 클래스의 종류 🟡
    정적 내장 클래스 : 앞에 static이 붙어서 내장되는 클래스
    비정적 내장 클래스 : static이 붙지 않은 일반적인 내장 클래스
      - 내부 클래스 (inner class) : 클래스의 멤버처럼 선언되는 내장 클래스 
      - 지역 클래스 (local class) : 메서드의 몸체 안에서 선언되는 내장 클래스 
      - 무명 클래스 (anonymous class) : 수식의 중간에서 선언되고 바로 객체화되는 클래스 
 */

/*
    🟡  ArrayList<>  🟡

        Java에서 ArrayList는 가변 크기 배열을 구현한 클래스입니다.
         즉, 배열과 같이 순서가 있는 데이터를 저장하는 자료구조로, 크기가 동적으로 조정됩니다. 
         ArrayList는 java.util 패키지에 속하며, ArrayList 클래스는 List 인터페이스를 구현합니다.

         ArrayList는 배열과 비슷한 방식으로 사용할 수 있지만, 배열과는 달리 크기를 동적으로 변경할 수 있습니다.

         ArrayList에는 요소를 추가, 삭제, 검색하는 등의 메서드가 포함되어 있으며, 
         이러한 작업을 수행하는 데에는 O(1)의 시간 복잡도를 가집니다. 

         또한 제네릭을 지원하여, ArrayList 내부에 저장되는 데이터 타입을 제한할 수 있습니다.
         ArrayList는 컬렉션 프레임워크의 일부이며, 다른 컬렉션 클래스와 함께 사용하여 
         데이터를 효율적으로 저장하고 처리할 수 있습니다.
 */

class GameCharacter{

  // 내부 클래스(inner class) : 클래스의 멤버처럼 선언되는 내장 클래스 
  private class GameItem {
    String name;
    int type;
    int price;

    int getPrice() {return price;}


    // 기본으로 객체 생성시 출력하게 한다. ( Object에서 상속)
    @Override
    public String toString(){
      return "GameItem [name="+ name + ", type = " + type + ", price=" + price + "]";
    }
  } // -------내부 클래스 끝 ---------

  private ArrayList<GameItem> list = new ArrayList<>();


  public void add (String name , int type , int price){
      GameItem item = new GameItem();
      item.name = name;
      item.type = type;
      item.price = price;
      list.add(item);
  }

  public void print() {
    int total = 0;
    for (GameItem item : list) {
      System.out.println(item);
      total += item.getPrice();
    }
    System.out.println(total);
  }
}



public class GameCharacterTest {
  public static void main(String[] args) {
    GameCharacter charac = new GameCharacter();
    charac.add("Sword",1,100);
    charac.add("Gun",2,50);
    charac.print();
  }
}
