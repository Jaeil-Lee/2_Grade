package BANK;

// Super class
class Bank {
  double getInterestRate(){
    return 0.0;
  }
}


// Child class
class BadBank extends Bank {
  double getInterestRate () {
    return 10.0;
  }
}

class NormalBank extends Bank {
  double getInterestRate () {
    return 5.0;
  }
}

class GoodBank extends Bank {
  double getInterestRate () {
    return 3.0;
  }
}



public class BankTest {
  public static void main(String[] args) {

    // Object 生成
    BadBank badObj = new BadBank();
    NormalBank normalObj = new NormalBank();
    GoodBank goodObj = new GoodBank();

    // Objectの内容を出力
    System.out.println("BadBank의 이자율 :" + badObj.getInterestRate());
    System.out.println("NormalBank의 이자율 :" + normalObj.getInterestRate());
    System.out.println("GoodBank의 이자율 :" + goodObj.getInterestRate());

  }
}
