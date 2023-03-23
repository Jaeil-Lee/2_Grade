  /* 동물예제 상속 306p ~ 307p */

/* 1. 📁Car 클래스 (Super class) */
  class Car {
    int speed; // 속도 ( 상속을 받기 위해 private로 설정하지 않음)

    public void setSpeed(int speed){
      this.speed = speed; 
      System.out.println(speed);
    }
  }


/* 2. 📁SportsCar 클래스 (Subclass class) - Car로부터 '상속' 받는다 */
  class SportsCar extends Car{
    
    // 2.1 추가된 variable
    boolean turbo; 

    // 2.2 추가된 method
    public void setTurbo (boolean flag) {
      turbo = flag;
      System.out.println(turbo);
    }

    @Override
    public String toString() {
      return "SportsCar는";
    }

  }


/* 3. 📂SportCarTest 클래스 - 🟡public class🟡 */
  public class SportCarTest{
    public static void main(String[] args) { 

      SportsCar obj = new SportsCar(); // 자식 "SportsCar class" 객체 생성

      obj.speed = 10;  // 부모 클래스의 필드와 method 사용 => line 6 

      obj.setSpeed(60);  // line 9 
      obj.setTurbo(true); // line 23 

    }
  }