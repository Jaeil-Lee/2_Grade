package lambda;
import java.time.LocalDate;
import java.time.Period;  // Period는 import 해서 사용해야 한다.


public class Person {

  // 변수
  private String name;
  private LocalDate birthDate;
  private String emailAddress;
  private Sex gender;

  // 생성자 
  public Person(String name, LocalDate birthDate, String emailAddress, Sex gender) {
    this.name = name;
    this.birthDate = birthDate;
    this.emailAddress = emailAddress;
    this.gender = gender;
  }

  // getter 
  public String getName() {
    return name;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public Sex getGender() {
    return gender;
  }

  public int getAge() {
    // Period p = Period.between(birthDate,LocalDate.now() );
    // return p.getYears();

    return Period.between(birthDate, LocalDate.now()).getYears();

    // method chaining : 메소드 호출을 쇠사슬이 연결된 것처럼, 이어서 쭉 호출하는 것. 
    // ex: this.getName().substring(1, 2);
  }

 // 문자열은  s  ,  정수는 d  로 표현 
  // public void printPers () {
  //   String.format("Name :%s, Email: %s, Gender: %s , BirthDate: %d",
  //   name ,
  //   emailAddress,
  //   gender.toString(),
  //   birthDate);
  // }


  //  🟢 print 출력용 메소드 🟢
  public void printPerson() {
    System.out.printf("Name : %s, Email: %s, Gender : %s, BirthDate: %s", 
                      name, emailAddress, gender.toString(), birthDate.toString());
  }

  
}


