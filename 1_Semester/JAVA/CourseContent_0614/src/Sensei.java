public class Sensei implements Comparable<Sensei> {

    
    String name;
    int age;

    public Sensei (String name , int age) {
      this.name = name;
      this.age = age;
    }
    
    @Override
    
    public int compareTo(Sensei o) {
      // return this.age - o.age;
      return -(this.age - o.age);  // 역순 정렬
    }

   
}
