package CourseContent_0315;


class Account {
  Account(){
     super();
  }
  // 전부 private로 선언 했기 때문에 해당 class 안에서만 접근 가능! 
  private int regNumber;
  private String name;
  private int balance;

  /* getter setter */
  public String getName () { return name; }                         // name 을 get 하기 위한 메서드
  public void setName (String name) { this.name = name; }           // name 을 set 하기 위한 메서드
  public int getBalance () { return balance; }                      // balance 을 get 하기 위한 메서드
  public void setBalance (int balance) { this.balance = balance; }  // balance 을 set 하기 위한 메서드
}

public class AccountTest {
   public static void main(String[] args) {
      Account obj = new Account();
      obj.setName("Ibiban");
      obj.setBalance(1000);
      System.out.println("이름은" + obj.getName() + " 통장 잔고는" + obj.getBalance() + "입니다");


   }
}
