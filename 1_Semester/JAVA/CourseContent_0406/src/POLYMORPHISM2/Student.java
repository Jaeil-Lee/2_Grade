package POLYMORPHISM2;



// public class Student extends Comparable {   // 추상 메서드를 선언했지 않아 에러
// public class Student  {


  public class Student extends Comparable {
    private String name; 
    private String stdNum;
  
  
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name = name;
    }
    public String getStdNum() {
      return stdNum;
    }
    public void setStdNum(String stdNum) {
      this.stdNum = stdNum;
    }
  
    
    // 생성자
    public Student (String name , String stdNum ){
      this.name = name;
      this.stdNum = stdNum;
    }
  
    @Override
    public String toString() {
      return "[이름:"+ name + ", 학번:" + stdNum+ "]";
    }
  
  
    @Override
    public int compareTo(Comparable anotherVal) {
  
      // throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
  
      // 이름 순으로 정렬할 수 있도록 이름 비교를 하자.
      // 내가 가진 name과 , anotherVal 객체의 이름을 비교해서
      // 알파벳 순으로 내 이름 앞이면 -1, 이름이 같으면 0,
      // 내 이름이 뒤면 1을 반환하자
  
      Student std = (Student)anotherVal;  // 하향 형 변환
      
      //String 클래스는 이미 compareTo 메소드를 가진다
      // 인자로 전달도니 무자열과 비교해 사전 순서에 따라 1, 0 , -1을 반환한다.
  
      // 🟠 이름 순 정렬
      String youString = std.getName();
      return name.compareTo(youString); 
      
      
      // 🟠 학번 순 정렬
      // String yourStdNum = std.getStdNum();
      // return stdNum.compareTo(yourStdNum);
      
    }
  }
  