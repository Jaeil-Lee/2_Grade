package generic;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionTest2 {
   public static void main(String[] args) {


    // HashMap =?  Java 에서 javascript 객체 처럼 key : value의 쌍으로 사용할 수 있는 것
      HashMap<String,Integer> nameAge = new HashMap<>();
      nameAge.put("이재일",25);  // 키와 값의 쌍으로 데이터를 저장
      int age = nameAge.get("이재일"); // 키의 값으로 그에 대응되는 값을 인출
      


      // int age = nameAge.get["이재일"] // 이렇게 연관 배열로는 호출 불가하다.......
      System.out.println("이재일의 나이는> => "+ age );
      

      nameAge.put("이상열",58);
      age = nameAge.get("이상열");
      System.out.println("이상열의 나이는> => "+ age );
      

      nameAge.put("박은영",56);
      age = nameAge.get("박은영");
      System.out.println("박은영의 나이는> => "+ age );



      System.out.println("------------------------------------------------------------");


      //       🟡 key  :     🟢 value
      HashMap< String, ArrayList<String> > teams = new HashMap<>(); // 매개변수로 반드시 참조형이 와야한다.
      
      /* 🟢 value = ArrayList에는 add로 추가  */
      ArrayList<String> team1 = new ArrayList<>(); //  이종열네
      team1.add("이종열");
      team1.add("이현숙");
      team1.add("이규석");
      team1.add("이아현");
      team1.add("이지민");
      
      /* 🟢 value =  ArrayList에는 add로 추가  */
      ArrayList<String> team2 = new ArrayList<>();  //  이동열네
      team2.add("이동열");
      team2.add("박지헌");
      team2.add("이진혁");
      team2.add("이예랑");

       /*             🟡 key: 🟢 value =>  hashMap은 put으로 넣기 */
      teams.put("이종열네",team1);
      teams.put("이동열네",team2);

      printTeamMember("이동열네",teams);
      printTeamMember("이종열네",teams);
   }
  //                                    🟡 key      :     🟢 valu
  public static void printTeamMember(String teamName, HashMap< String , ArrayList<String>> teams) {
      ArrayList<String> members = teams.get(teamName);
      System.out.println(teamName+"의 멤버들");

      for (String member:members) {
        System.out.println(member);
      }
      System.out.println(); 
  }

}
