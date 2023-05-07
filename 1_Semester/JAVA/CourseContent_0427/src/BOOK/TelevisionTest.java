package BOOK;

public class TelevisionTest {
  public static void main(String[] args) {

    // 🚩 １．テレビのヴァージョン
    Television terebi = new Television();
    
    terebi.turnOn();
    terebi.turnOff();
    

    // 🚩 2．冷蔵庫のヴァージョン
    Refrigerator reizoiuko = new Refrigerator();

    reizoiuko.turnOn();
    reizoiuko.turnOff();

    /* 結論
     　＝＞ interfaceを付けて同じ方法でコントロールできる
    */

  }
}
