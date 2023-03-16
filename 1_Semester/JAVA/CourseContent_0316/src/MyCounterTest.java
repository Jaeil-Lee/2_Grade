// 23.03.16 목

class MyCounter {
    int counter;
   
    // MyCounter의 생성자 -> 멤버 변수들 초기화
    MyCounter () {
         counter = 1;
        System.out.println("MyCounter가 실행되었습니다~!");
        }

}

public class MyCounterTest {
    public static void main(String[] args) throws Exception {
        System.out.println("---------------------------------------------------------------------------------------");
        
        MyCounter obj1 = new MyCounter();
        MyCounter obj2 = new MyCounter();
        System.out.println("객체 1의 counter =" + obj1.counter);
        System.out.println("객체 2의 counter =" + obj2.counter);

    }
}
