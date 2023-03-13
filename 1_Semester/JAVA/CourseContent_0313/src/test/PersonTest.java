package test;

public class PersonTest {
  public static void main(String[] args) {

    Person p = new Person();

    p.setAge(-28);

    String getDept= p.dept; // protected 사용 했을 때 가능 하다 , private쓰면 보이지 않아서 에러 뜬다 

    System.out.println(p.getAge());

    System.out.println(p.getName());
    System.out.println(p.getDept());


    // p.name = "이재일"; // private 써놓았기 때문에 외부에서 접근 불가하다
    // p.age = 28;

    // // 객체 내부에서 잘 못 된 값을 줄때 이를 막을 수가 없다;
    // p.age = -1000;   // 외부에서는 이렇게 이상하게 못하게 접근 막아야 한다
    //                  // 내부애서만 쓸 수 있게 private 쓰자
    
  }
}
