public class SafeArray {
  private int[] a;

  public void createArray(int size) {
    a = new int[size];
  }

  public int get(int index) {
    if (index >=0 && index < a.length) 
      return a[index];
    System.out.println("잘못된 인덱스:"+index);
    return -1;
  }

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