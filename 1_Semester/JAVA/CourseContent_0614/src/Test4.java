import java.util.*;

public class Test4 {

  public static void main(String[] args) {

    /* Student 인스턴스 생성 */
    Student std1 = new Student("이재일", 94);
    Student std2 = new Student("이재성", 98);
    Student std3 = new Student("김지민", 76);
    Student std4 = new Student("유수영", 80);
    Student std5 = new Student("박수정", 75);

    /* ArrayList에 Student 인스턴스 저장 */
    List<Student> list = new ArrayList<>();
    list.add(std1);
    list.add(std2);
    list.add(std3);
    list.add(std4);
    list.add(std5);

    // 정렬 전
    print(list);
    
    
    // 정렬 후 
    // Collections.sort(list,new MyComparator());  // 
    Collections.sort(list,new MyComparator(){
      public int compare(Student s1,Student s2){
        return -(s1.grade - s2.grade);
      }
    });

    /* 람다식 */
    Collections.sort(list,(Student s1,Student s2 )-> -(s1.grade - s2.grade));  // 이 때는 student가 compateto를 실현하지 않아도 된다 
    // Collections.sort(list,(Student s1,Student s2 )-> s1.name.compareTo(s2.name));

      
  

    System.out.println("정렬후");
    print(list);

  }

   public static void print(List<Student> list) {
    for (int i = 0; i < list.size(); i++) {
      System.out.println("["+list.get(i).name + "," +list.get(i).grade+"]" );
    }
    System.out.println();
  }
}

class MyComparator implements Comparator<Student> {

  @Override
  public int compare(Student o1, Student o2){
    return o1.grade - o2.grade;
  }
}
