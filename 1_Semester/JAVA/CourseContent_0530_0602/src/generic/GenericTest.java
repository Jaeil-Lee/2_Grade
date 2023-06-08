package generic;

public class GenericTest {
  public static void main(String[] args) {
    
    /* 1. Integer */
    GenericBox<Integer> box1 = new GenericBox<Integer>();
    box1.setValue(100);
    /* ⭐ 잘못된 타입의 값을 주면 컴파일 타임 때 그 오류를 잡아준다 ⭐ */
    // 🔴 box1.setValue("ㅋㄹㅋㄹㅋㄹㅋㄹㅋㄹㅋㄹ");
    int val = box1.getValue(); // 명시적인 타입 캐스팅이 필요 없다
    System.out.println("박스에 저장된 값은["+val+"]입니다");


    /* 2. String */
    GenericBox<String> box2 = new GenericBox<String>();
    box2.setValue("이것은 String으로 생성한 generic CLASS라네");
    /* 잘 못된 타임의 값을 주면 컴파일 타임 때 그 오류를 잡아 준다 */
    // 🔴 box2.setValue(100);
    String sval = box2.getValue(); // 명시적인 타입 캐스팅이 필요하다
    System.out.println("박스에 저장된 값은["+sval+"]입니다");
    
    
    /* 3. 커스터마이징 내가 함*/    
    // 완쪽 Generic 클래스의 적용할 타입이 명시되어 있기 때문에
    // new 다음의 ()에서 객체를 생성할 때는 타입 파라미터를 생략 가능하다
   
    // GenericBox<Student> box3 = new GenericBox<>();
    // Student std = new Student("이재일","컴정");
    // box3.setValue(std);
    
    // Student val3 = box3.getValue;
    // System.out.println("박스에 저장된 값은["+val3.getName()+"]입니다");

  }
}
