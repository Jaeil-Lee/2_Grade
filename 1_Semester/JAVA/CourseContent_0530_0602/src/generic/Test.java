package generic;

public class Test {
  public static void main(String[] args) {

    /* 🟢 Integer */
    // Intbox ib1 = new Intbox();
    // ib1.setValue(10);
    // // System.out.println(ib1.getValue());

    // Intbox ib2 = new Intbox();
    // ib2.setValue(20);
    
    // int result = ib1.getValue() + ib2.getValue();
    // System.out.println(result); 
    
    


    /* 🟢 String */
    // StrBox sb1 = new StrBox();
    // sb1.setValue("동해물과");

    // StrBox sb2 = new StrBox();
    // sb2.setValue("백두산이");

    // String result = sb1.getValue() + sb2.getValue();
    // System.out.println(result);

    // int idx = result.indexOf("백두산이");
    // System.out.println(result.substring(idx));
    




    /* ❓❓❓❓❓❓❓❓❓❓❓❓❓❓  에러가 난다? ❓❓❓❓❓❓❓❓❓❓❓❓*/
    // Box b1 = new Box();
    // b1.setValue(20);

    // Box b2 = new Box();
    // b2.setValue(20);

    // // int result = b1.getValue() + b2.getValue();  -> 이건 에러가 난다.
    // int result = (int)b1.getValue() + (int)b2.getValue(); 
    // System.out.println(result);
    


//  🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻
//  🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻




/* ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐  
    오브젝트 타입은 다좋은데 가져와 쓰려면 반드시 형 변환을 해야 한다 
  ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐ */


    Box strBox = new Box();
    strBox.setValue("마르고 닳도록 하느님이 보우하사 우리나라 만세!");

    // ⭐⭐⭐⭐시험⭐⭐⭐⭐
    Object v = strBox.getValue();
    int idx = ((String)v).indexOf("우리나라");  //Object에 있는 값을 사용하려면 형 변환을 해줘야 한다
    System.out.println(((String)v).substring(idx));   //get value로 얻어지는 것은 Object이다 
                                                           // 문자로 다시 바꿔줘야 한다

    int val = (int)strBox.getValue(); // 실행 전까지는 error가 나지 않는다 
    // 컴파일시에 여기에 뭐가 들어있는거 까지는 체크하지 않는다, 문법만 확인 한다.
    // 사용자가 타입 케스팅 본의로 한것이기 때문에 이건 컴파일 할때 문제가 없다고 생각함 ㅇㅇ


    // ⭐⭐⭐⭐⭐⭐⭐하지만 여기서 실행 시켜보니 죽어버리더라...;;⭐⭐⭐⭐⭐⭐⭐
    System.out.println(val); 
    System.out.println("프로그램을 종료합니다."); 

  }
}
