package SELF;
public class RemoteControlTest {
  public static void main(String[] args) {
  
   /*  RemoteControl rm = new SansungTv();
   rm.turnOn();
   rm.volumeControl(3);
   
   System.out.println("-------------------------------------------------------");
   
   rm = new LgTv();
   rm.turnOn();
   rm.volumeControl(-2); */
   
   
   
  RemoteControl rm = new SamsungTv();
    turnOnAndControlVolume(rm,-3);
    
    rm = new LgTv();
    turnOnAndControlVolume(rm,-2);
    
  

  
  }
  public static void turnOnAndControlVolume(RemoteControl rm, int vol) {
    rm.turnOn();
    if (rm instanceof AdvancedRemoteControl) {
      ((AdvancedRemoteControl)rm).volumeControl(vol);
    } else {
      System.out.println("이 기기는 원격 볼륨제어를 지원하지 않습니다.");
    }
  }
}