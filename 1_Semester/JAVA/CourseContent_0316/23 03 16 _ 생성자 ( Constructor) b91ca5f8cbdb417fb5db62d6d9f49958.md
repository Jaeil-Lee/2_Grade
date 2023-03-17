# 23.03.16 _ 생성자 ( Constructor)

## 왜 **`접근자 제어자(Access Modifier)`**들을 설정하는가❓
_______________________________

- 멤버 변수에 잘못된  값 설정을 방지할(막아줄) 필요가 있다.
- 읽기 전용 멤버 변수를 만들 수 있다.
- 멤버 변수를 이용해 계산된 값을 반환 할 수 있다.
- “class” 변경으로 인한 영향을 최소화 할 수 있다.
- “class” UPDATE 시 용이하다


# **`생성자 ( Constructor)`**

<aside>
<img src="https://cdn-icons-png.flaticon.com/512/9906/9906541.png" alt="https://cdn-icons-png.flaticon.com/512/9906/9906541.png" width="40px" />  객체가 생성될 때 객체를 초기화하는 특수한  method

</aside>

- class 내부에 작성하는 특별한 `**method**`
- 모든 class에 **반드시 1개 이상 존재**
- ⭐ class의 instance를 생성할 때 개발자가 구현해 주지 않으면 
     JAVA가 기본으로 `**default 생성자**`를 생성해 준다    ⇒  보이지는 않음❗ 
     `생성자`가  하나라도 정의되어 있으면`**default 생성자**`를 자동으로 추가하지 않는다
     ( 기본 생성자에서는 필드가 int와 같은 수치형 변수라면 0으로 , 
     참조형 변수라면 null로 , boolean은 false로 초기화 한다)
- `생성자`의 이름은 class 이름과 같다 ( 첫 글자가 반드시 대문자 )
- `생성자`는 반환 값 (return 값)을 가지지 않는다 , 반환 형 ( return type )이 없다)
- `생성자`는  반드시 `private`❗ ( `생성자`가 불려져야 객체가 생성된다 )
- `생성자`도 `**Overloading**`이 가능하다 ⭐
- 해당 되는 인자 값이 일치하지 않는 `생성자` 호출 시 error ( `생성자`가 일치 하지 않으면)
- 객체 생성과 동시에 객체의 프로퍼티들을 **`초기화`**를 시킬 때 사용된다
( 매개 변수를 가지면서, 외부에서 전달되는 값 ( 인수 )이 매개변수로 전달된다)
    
    ex)
    
    ![https://cdn-icons-png.flaticon.com/512/6188/6188613.png](https://cdn-icons-png.flaticon.com/512/6188/6188613.png)
    
    ```java
    public class Betty {
    
    	private String name;
    	private int year;
    	private int month;
    	private String region;
    
    	public Betty ( ) {  } ;
    
    	public Betty ( String name , int year , int month , String region ) {
    			this.name = name ;
    						.
    						.
    			this.region = region 
    	};
    
    }
    ```
    
    ```java
    Betty std_youmi = new Betty ("정유미" , 2007 , 6 , "울산")
    Betty std_yearim = new Betty ("신예림" , 2007 , 3 , "울산")
    Betty std_sora = new Betty ("최소라" , 2018 , 1 , "대구")
    
    Betty std = new Betty ( ) // 이건 error , 
                              // => 이미 다른 생성자가 있으면 default 생성자는 안 만든다
    ```
    
    <aside>
    ⭐ this 는 매개 변수와 필드의 이름이 같은 경우에 편리하다 , `this.`을 붙이면 필드가 된다
    
    </aside>
    
    # `**생성자**` 안에서 다른 생성자를 호출할 수 있다
    
    `this`라는 키워드로 `**생성자**` 안에서 또 다른 `**생성자**` 를 불러 준다
    
    ```java
    public class Rectangle {
      private int x, y;
      private int width, height;
    
      /* 생성자 Overriding */
    
      public Rectangle(int x, int y, int width, int height) {
    
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    
      }
    
      // // 위에 이미 x y 초기화 하는게 있는데 굳이 코드를 반복하노?? 정신 안차릴래?
      // public Rectangle(int width, int height) {
      //   this.x = 0;
      //   this.y = 0;
      //   this.width = width;
      //   this.height = height;
      // }
    
      // this라는 키워드로 생성자내에서 또 다른 생성자를 불러 준다 
      public Rectangle(int width, int height) {
        // System.out.println("ㅋㅋㅋㅋㅋㅋㅋㅋㅋ");  /*  Constructor call must be the first statement in a constructor */
        this( 0 , 0 , width , height ); // 반드시 this()를 사용한 다른 생성자 호출은 항상 첫 번째 문장이어야 한다
      }
    
      public static void main(String[] args) {
    
        // 위에 있는 생성자를 불러준다 
        // 생성자 내에서 다른 생성자를 부를 때 그 생성자는 반드시 첫번째에 있어어야된다
        //this 로 다른 생성자를 호출하는 코드가 바디의 첫번 쨰로 나와야한다 !!! 
        Rectangle r1 = new Rectangle (10,20); 
        Rectangle r2 = new Rectangle ( 1 , 1 , 30 ,50); 
      }
    }
    ```
    

<aside>
⭐ 멤버 변수의 자료형은 꼭 원시형일 필요는 없다!  내가 만든 class여도 된다!

</aside>

 

## **`toString()`**

조상 타입의 변수로는 후손 타입의 객체를 받아줄 수 있다. 오브젝트면 어떤 객체든 다 받을 수 있다.

```java
public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

Person person = new Person("John", 30);
System.out.println(person); // Person{name='John', age=30}
```

 메소드는 `Person` 클래스의 인스턴스를 문자열로 반환합니다. 
이렇게 반환된 문자열은 `System.out.println()` 메소드를 통해 콘솔에 출력할 수 있습니다.

# `Override`

```jsx
package test;

public class Point {
  private int x, y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  // 부모로부터 상속받은 메소드를 재정의 하는 것을 오버라이딩이라고 한다. 
  // overriding
  @Override
  public String toString() {
    return "x:" +x + ", y:"+y;
  }
}
```