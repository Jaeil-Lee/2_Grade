class MyCounter{

  private int value;
  
  /* 1 */
  // Setter
  public void setValue(int value){
    this.value = value;
  }

  /* 2 */
  // Getter
  public int getValue(){
    return value;
  }

  
  /* 3 */
  /*인스턴스 멤버에 접근하지 않는데 굳이 인스턴스 메소드의 존재는 필요 없다 */
  public static void addOne(int val){
    val = val +1;  // => addOne 메서드 안에서만 존재해서 이 메서드가 끝나면 사라진다
  }

/*  굳이 인스턴스 메서드일 필요 없다
  public void increase(MyCounter cntObj){  
    int testValue = cntObj.getValue()+1;
    cntObj.setValue(testValue);   
  }
*/  

  /* 4 */
  public static void increase(MyCounter cntObj){   // 본인class 자신을 자료형으로 사용가능! 
    int testValue = cntObj.getValue()+1;
    cntObj.setValue(testValue);
  }

}

public class MyCounterTest {
  public static void main(String[] args) {

    /* ※ 1. call by value (값에 읜한 전달) ※  => ✅전달하는 인수가 기초 변수인 경우에는 
                                                    인수의 값이 매개변수로 복사된다
      call by value 의 경우 복사본을 이용해 새롭게 생성하는 것이라 
      원본 데이터에 직접적인 영향을 주지 않는다 ❌
    */
    // int val = 10;
    // MyCounter.addOne(val);
    // System.out.println(val);

    /*------------------------------------------------------------------------------------------------------------------- */

    /* ※ 2. call by reference ※  => ✅객체를 메소드로 전달
      call by reference 의 경우 주소 값을 가지고 같은 객체로 작업을 하는 것이라 
      원본 데이터에 직접적인 영향을 준다 ⭕

      객체를 메소드로 전달하게 되면 객체가 복사되어 전달되는 것이 아니고 
      참조 변수의 값이 복사 되어서 전달 된다
      
      ❣️ 반환하는 값도 객체일 수 있다 ❣️
    */
    MyCounter mc = new MyCounter();
    mc.setValue(10);
    MyCounter.increase(mc);
    System.out.println(mc.getValue());

  }
}
