package test2;

import test.Person; // import 를 해야 다른 패키지에 있는 것을 사용가능

public class test {
  Person p = new Person();  
  // 접근 제어자를 지정해 주지 않으면 
  // default 접근 제어 지정자가 생성되어 
  // 같은 package 안에서만 접근 가능
  // 때문에 아래의 내용은 package가 달라서 에러 난다 

 /* p.name = "이재일"; */  
}
