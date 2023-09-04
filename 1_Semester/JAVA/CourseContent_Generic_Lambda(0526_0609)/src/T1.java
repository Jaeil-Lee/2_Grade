import javax.swing.plaf.synth.SynthStyleFactory;

/**
 InnerT1
 */
interface Add {
  int add (int a, int b);
}

class Sumfun {
  public int sum (int n1,int n2,int n3, Add add){
    int res = add.add(n1,n2);
    res = add.add(res,n3);
    return res; 
  }
}

public class T1 {
  public static void main(String[] args) {

     Sumfun s =  new Sumfun();

      int n1 = 1;
      int n2 = 2;
      int n3 = 3;
    
    int result = s.sum(n1,n2,n3,(a,b)-> a+b);

    System.out.println(result);
    
    
  }
}
