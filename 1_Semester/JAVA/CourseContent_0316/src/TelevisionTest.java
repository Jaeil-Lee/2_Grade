class Television {

  private int channel; // 채널번호
  private int volume; //  볼륨
  private boolean ofOff; // 전원 on , off

  // Television 생성자
  Television (int c , int v ,boolean o ) {
    channel = c; // 채널번호
    volume = v; //  볼륨
    ofOff = o; // 전원 on , off
  }
  
  void print () {
    System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
  }

}

public class TelevisionTest {
  public static void main(String[] args) {
    Television myTv = new Television(7, 10, true);
    myTv.print();
    Television ichibanTv = new Television(11, 20, true);
    ichibanTv.print();
  }
}
