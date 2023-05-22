package Anonymous;

import CourseContent_0504.INTERFACE.RemoteControl.java;
import INTERFACE.RemoteControl;

public class CallbackTest3 {
  public void RemoteControl(RemoteControl rc) {
    rc.turnOn();
  }

    public static void main(String[] args) {
      CallbackTest3 cb = new CallbackTest3();

      // 무명 클래스로 RemoteControl 객체를 인다로 전달하시오
      /* 
       * 1. 변수 사용해서 전달해보고 
       * 2. 변수 사용하지 않고 전달해보고
       * 화면에는 파나소닉 테레비가 켜졌습니다.
       */
      cb.RemoteControl(null);

    }
}
