



interface Comparable {
  int compareTo(Object other);
}

class Rectangle implements Comparable{
  int width ;
  int height ;
  
  public Rectangle(int width , int height) {
    this.width= width;
    this.height= height;
    System.out.println();
  }
  
  @Override
  public String toString () {
    return "width : "+ width + ","+"height : "+ height; 
  }

  public int compareTo(Object other){
    Rectangle r =  (Rectangle) other;
    return 1;
  }


}

public class T1 {
  public static void main(String[] args) {

    Rectangle r = new Rectangle(10,20);
    System.out.println(r);

  }
}
