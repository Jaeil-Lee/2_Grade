import javax.swing.plaf.synth.SynthSpinnerUI;

class Car {
  private String model;

  public Car(String model) {
    this.model =model;
  }

  public boolean equals(Object obj) {
    if (obj instanceof Car) {
      return model.equals( ((Car) obj).model);
    } else {
      return false;
    }
  }
}


public class Test_euals {
  public static void main(String[] args) {
    Car f1 =new Car("BMW1");
    Car f2 =new Car("BMW2");

    if (f1.equals(f2)) {
      System.out.println("같은차");
    } else {
      System.out.println("다른차");
    }
  }
}
