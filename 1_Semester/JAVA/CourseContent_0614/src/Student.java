public class Student implements Comparable<Student>{ /* test3의 23번 라인 참조 */
  String name; 
  int grade;


  public Student(String name , int grade){
    this.name = name;
    this.grade = grade;
  }

  // 1. 성적 순으로 
  // @Override
  // public int compareTo(Student o) {
  //   /* 
  //     이 객체의 어떤 값과 안자로 전달받은 o 객체의 어떤 값을 비교해서
  //     나의 값이 더 크면 양수, 같으면 0 , 더 작으면 음수를 반환하도록 구현
  //    */
    
  //   // return  o.grade - this.grade ; // this 값이 크면 양수 , 작으면 음수 반환

  // }

  // 2. 학생 객체를 이름의 사전 순으로 정렬 하도록 구현해라   String 은 자체 적으로 Comparable 구현하고 있다
  @Override
  public int compareTo(Student o) {
    return this.name.compareTo(o.name);
    // return -(this.name.compareTo(o.name));  // 역순 정렬
  }
}

