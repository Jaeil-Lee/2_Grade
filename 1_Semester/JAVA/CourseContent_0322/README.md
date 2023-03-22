
# 정적 멤버

<aside>
❗ 메서드 → stack에 올라감→ 실행된다는 말

</aside>
<br/>
### 프로그래밍 언어의 변수를 배울 때 봐야 할 4가지 관점

1. 변수를 어떤 방법으로 정의를 하는지 
2. 제공하는 변수의 자료형이 무엇인지
3. 접근 범위 (Scope)
4. 생명 주기 (Life cycle)
<br/><br/>

# 멤버의 2 종류 ( Instance ・ class )

## Instance (객체) - heap

     `Instance 멤버 변수 (Variable)` 
         : new 연산자를 이용해 객체를 찍을 때,  그 객체에 매달려 있는 멤버들

     `Instance 멤버 메소드 (Method)`

> `Instance 멤버` ⇒ 객체가 생성될 때  생긴다
> 

## class (틀) - Code Area

     `class 멤버 변수 (Variable)`

         : class 자체에 붙어 있다, 객체를 찍지 않고 class틀을 이용해 바로 사용할 수 있다.
           객체를 찍으면 각 객체마다 `class 멤버 변수`를 독립적으로 가지고 있지 않다! 
            →   Code Area 에 만들어 두고 **공유**를 한다!

     `class 멤버 메소드 (Method)`

> `class 멤버` ⇒ 프로그램이 종료되면 죽는다  ( 한 번 올라가면 계속 메모리에 있다 )
> 

 ⭐ `class 멤버`선언하는 방법 

    ⇒  `Instance **멤버 변수**`나, `Instance멤버 메소드` 앞에 
        ⭐ ⭐ **`static`** 붙이기 ⭐⭐ ( `Instance 멤버`  → `class 멤버` )  

               

### ⭐⭐`class 멤버` 와 `Instance 멤버` 는 할당되는 메모리 구역이 다르다!⭐⭐

                                                               `class 멤버 변수`는 Code Area에 찍히게 됨.
class 멤버 변수 는 Code Area 라는 메모리 영역에 1개를 만들어 놔 놓고 그것들을 공유한다!

1개의 값을 모든 객체가 공유! ⇒ class 생성과 상관이 없다 ( class 가 한 번 사용되면 올라간다!!)

생성되는 시점, 종료되는 시점 ,메모리에 할당되는 영역 이 3가지 가 차이점이다 !! 

- 자바에서는 객체를 통하지 않고 사용할 수 있는 멤버를 생성`(static)`하는 것이 가능하다.
- 이들 멤버는 모든 객체를 통틀어서 `하나만 생성`되고 모든 객체가 이것을 공유하게 된다.
- 이러한 멤버를 `정적멤버 (static member)` or `클래스멤버 (class member)` 라고 한다.
- 멤버를 정의할 때 앞에 `static`을 붙이면 정적 멤버가된다.
  <br/>  <br/>


## 인스턴스 멤버 vs 정적 멤버 
- 클래스 멤버는 인스턴스 멤버와 정적 멤버로 나누어 진다. 
- 동일한 클래스를 이용하여 많은 객체들이 생성될 때 각각의 객체(instance)들은 자신만의 변수를 가진다. <br/>
=> 이들 변수는 인스턴스 마다 별도로 생성되기 때문에 `인스턴스 변수 (instance variable)`라고도 한다 
- 모든 객체에 공통인 변수가 필요한 경우도 있다 => `정적 변수 (class variable)`
<br/>
=>정적 변수는 하나의 클래스에 하나만 존재하고, 클래스와 연결되어 있다.
- 모든 객체들은 하나의 정적 변수를 공유한다.
- `인스턴스를 생성하지 않아도 사용이 가능하다. => 전역 변수와 마찬가지

<br/><br/>
## 정적 메소드
- 변수와 마찬가지고 메소드도 `정적 메소드로 만들 수 있다`.
- static 수식자를 메소드 앞에 붙이며 클래스 일므을 통하여 호출되어야 한다.
- 예1) Math 클래스에 들어 있는 각종 수학 메소드들이다.
- 예2) main () 메소드 앞에도 static이 붙어 있는 것 <br/>
### 정적 멤서 사용시 주의점
- 객체가 생성되지 않은 상태에서 호출 되는 메소드라 , 객체 안에서만 존재하는 `인스턴스 변수`들은 사용 `不可`, `인스턴스 메서드`도 마찬가지 !!
- `this를 사용 不可` => this가 참조할 인스턴스가 없기 때문! <br/>

## 상수
- `final`을 붙여 사용하되 앞에 `static 을 정의`하여 `클래스 변수`로 사용한다
  
<br/>

## 정적 초기화 블록
- `static{중괄호}` 의 형태로 `정적 변수를 초기화`하는데 사용된다
- 클래스는 `몇 개라도 정적 초기화 블록`을 가질 수 있다

### 순서
1. 정적 초기화 블록
2. 디폴트 생성자
3. 일반 생성자

<br/><br/><br/>
## 참조 관계 유형

```java
package test;

class Bar {
	
	int x = 3;
	
	static int y =3;
	
	static int prtSomething1() {
		prtSomething2();
	}
	
	static int prtSomething3() {
		System.out.println(x);
	}
	
	void prtSomething2() {
		System.out.println("hello");
	}
	
}

public class test4 {

	public static void main(String[] args) {
		
		System.out.println(Bar.getRandNum10());
		
	}

}
```

| class | → | class |  可能 |
| --- | --- | --- | --- |
| class | → | Instance |  不可 ⇒  Instance 는 만들어 졌는지 여부를 확인 할 수가 없다. |
| Instance | → | class |  可能 |
| Instance | → | Instance |  可能 |