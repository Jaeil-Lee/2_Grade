package POLYMORPHISM2;

/*  
             2023.04.06
   🟡교수님 성함 내림차순 정리하기 🟡 

*/


 // 🚩 무조건 추상 메서드 compareTo ( ) 를 구현해야한다 🚩 
public class ProfessorDescending extends Comparable {

  private String name; 
  private String professorsNum;

// 1. getterr , setter
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getprofessorsNum() {
    return professorsNum;
  }
  public void setprofessorsNum(String professorsNum) {
    this.professorsNum = professorsNum;
  }

  // 2. 생성자
  public ProfessorDescending (String name , String professorsNum ){
    this.name = name;
    this.professorsNum = professorsNum;
  }

  // 3. 오버라이드 ( 추상메서드 compareTo () )
  @Override
  public int compareTo(Comparable anotherVal) {

    ProfessorDescending professors = (ProfessorDescending)anotherVal;  // 하향 형 변환
    

    // 3.1. 교번 순으로 정렬
    String youString = professors.getName();

    return professorsNum.compareTo(youString); // 알파벳 순으로 이름을 비교해서 값을 반환

    // 3.2. 이름 순으로 정렬
    // String professorsNam = professors.getName();
    // return name.compareTo(professorsNam);   // 숫자 순으로 교번을 비교해서 값을 반환
    
  }

  // 4. 객체 이름만 반환하기 보다는 사람이 알아볼 수 있게 toString으로 나타내기 
  @Override
  public String toString() {
    return "[이름:"+ name + ", 교번:" + professorsNum+ "]";
  }


}