package BOOK;


public class CarBook {

  private String model;


  public CarBook(String model) {
    this.model = model;
  }


  // equals를 재정의 
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof CarBook) 
      return model.equals(((CarBook)obj).model);
    else 
      return false;
  }
}