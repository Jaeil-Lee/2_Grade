package animal;

/* 1. Animal class - Super class */
public class Animal {
  private double weight; // 자손이라도 접근 불가
  private String picture; // 자손이라도 접근 불가

  protected void eat(){System.out.println("eat()가 호출 되었음");}
  void sleep(){System.out.println("sleep()가 호출 되었음");}


    // 1.1. weight 의 get , set 메서드
    public double getWeight() {
      return weight;
    }

    public void setWeight(double weight) {
      this.weight = weight;
    }

    // 1.2. picture 의 get , set 메서드
    public String getPicture() {
      return picture;
    }

    public void setPicture(String picture) {
      this.picture = picture;
    }


}
