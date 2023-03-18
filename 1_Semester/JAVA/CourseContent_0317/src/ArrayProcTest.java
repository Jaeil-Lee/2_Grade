
/*
  ※ Call by reference ※
  
    「배열이 전달되는 경우」
    🟡 자바에서는 배열도 객체 
    🟡 배열이 전달되는 것이 아니라 배열을 가리키는 참조 값이 복사되고 
        메소드에서 매개 변수를 통하여 배열을 변경하면 원본 배열이 변경된다 
    🟡 만약 배열 원소가 메소드로 전달된다면 이것은 다른 변수들과 다르지 않다 => 복사 값으로 전달 된다
        그러나 배열 전체가 전달된다면 배열도 객체이기 때문에 배열 참조 변수를 복사하는 것이다

*/

class ArrayProc {

  void inc (int[] array){
    for (int i = 0; i < array.length; i++) {
      array[i] = array[i] +1;  
    }

  }
}


public class ArrayProcTest {
 public static void main(String[] args) {
    int [] list = { 1 , 2 , 3 , 4 , 5 };
    ArrayProc obj = new ArrayProc();

    obj.inc(list); // list의 배열 주소를 obj의 메소드에 매개변수로 대입한다 
                   //    => list와 obj는 같은 주소 값을 가르키고 있다.
 
    for (int i = 0; i < list.length; i++) {
      System.out.println(list[i] + " ");  // [ 2 , 3 , 4 , 5 , 6 ]
    }
  } 
}
