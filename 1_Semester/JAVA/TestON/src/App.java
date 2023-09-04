public class App {
    public static void main(String[] args) throws Exception {
           /* 🟢 String */
    StrBox sb1 = new StrBox();
    sb1.setValue("동해물과");

    StrBox sb2 = new StrBox();
    sb2.setValue("백두산이");

    String result = sb1.getValue() + sb2.getValue();
    System.out.println(result);

    int indexOfValue = result.indexOf("백두산이");
    System.out.println(indexOfValue);
    System.out.println(result.substring(indexOfValue));
    }
}
class StrBox {
  private String value;

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
