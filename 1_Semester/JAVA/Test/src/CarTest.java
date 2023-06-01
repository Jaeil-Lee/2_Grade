public class CarTest {
  public static void main(String[] args) {
    Car c1 = new Car("bmw_520d");
    Car c2 = new Car("benz_Class");

    if (c1.equals(c2)) 
      System.out.println("같음");
     else 
      System.out.println("다름");
    

  }
}
