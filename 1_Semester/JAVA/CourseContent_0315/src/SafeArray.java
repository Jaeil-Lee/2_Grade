public class SafeArray {
  private int[] a;

  // １．Array 생성 메서드
  public void createArray(int size) {
    a = new int[size];
  }

  // ２．index get 생성 메서드
  public int get(int index) {
    if (index >=0 && index < a.length) 
      return a[index];
    System.out.println("잘못된 인덱스:"+index);
    return -1;
  }

  // ３．index・value , put 생성 메서드 
  public void put(int index, int value) {
    if (index >=0 && index < a.length) {
      a[index] = value;
      return ;
    }
    System.out.println("잘못된 인덱스:"+index);
  }

  public static void main(String[] args) {
    SafeArray array = new SafeArray();
    array.createArray(10);

    array.put(2, 100);
    array.put(10, 200);

    System.out.println(array.get(2));
  }
}