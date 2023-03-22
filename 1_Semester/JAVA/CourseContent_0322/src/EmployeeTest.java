class Employee {
  
  // 변수
  private String name;
  private double salary;

  private static int count = 0; // 직원 수=> 정적 변수 🟡정적 메서드가 유일하게 호출시킬 수 있음

  // 생성자
  public Employee (String argName , double argSalary ) {
    name = argName;
    salary = argSalary;

    // Q. 객체가 하나씩 생성될 때마다 생성자에서 정적 변수 count를 증가
    ++count; // 전위형 (증가 먼저 시키고 어딘가에 대입이지만 여기서는 그렇게 의미가 없다)
  }

  // 정적 메서드 => private인 static 메소드 "count"를 호출하기 위한 용도
  //  🟡정적 메서드에서는 인스턴스 변수와 인스턴스 메소드에 접근할 수 없다🟡 
  public static int getCount() { 
    return count;
  }

  // 객체가 소멸될 때 호출된다.
  @Override
  protected void finalize() {
    count--; 

  /*
    finalize() 메서드는 Java에서 객체가 소멸될 때 자동으로 호출되는 메서드!! 
    이 메서드는 객체가 소멸되기 전에 실행되며, 객체가 소멸되는 시점을 알리는 역할을 한다

    Employee 클래스에서 finalize() 메서드는 객체가 소멸될 때 count 변수를 1 감소시켜서 
    현재 직원 수를 업데이트하는 역할을 한다
    finalize() 메서드가 호출되는 시점은 Java의 가비지 컬렉션에 의해 결정되며, 
    정확한 시점은 보장되지 않음!!!
    
    따라서 finalize() 메서드에서 수행되는 작업은 객체 소멸 시 필요한 정리 작업에만 사용해야 한당
  */ 
    
  }
}
public class EmployeeTest {
  public static void main(String[] args) {
    Employee e1, e2 ,e3;
    e1 = new Employee("美空ひばり", 35000);
    e2 = new Employee("桑田佳祐", 50000);
    e3 = new Employee("ちあきなおみ", 70000);

    int numbers = Employee.getCount();
    System.out.println("現在の職員= " + numbers);
  }
}
