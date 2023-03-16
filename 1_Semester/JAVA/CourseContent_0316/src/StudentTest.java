class Student {
  private int number;
  private String name;
  private int age;

  /* 생성자 Overriding - 몇 개라도 Overriding 가능!! */
  
  // 생성자 1
  Student() {
    number = 100 ;
    name = "New Student";
    age = 18;
  }

  // 생성자 2
  Student (int number , String name , int age){
    this.number = number; 
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString(){
    return "Student [ number=" + number + ",  name=" + name + ",  age=" + age +" ]";
  }

}

public class StudentTest {
  public static void main(String[] args) {
    
    // 생성자1의 객체
    Student obj1 = new Student();
    System.out.println(obj1);

    // 생성자2의 객체
    Student obj2 = new Student(111,"Ichiban",28);
    System.out.println(obj2);
  }
  
}
