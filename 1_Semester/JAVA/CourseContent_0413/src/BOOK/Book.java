package BOOK;

/* 
   toString ( ) 메소드 

   📌 
     - toString 메소드도  Object 클래스에서 정의된 메소드이다
     - 객체가 가진 정보를 한준의 문자열로 만들어서 반환한다 
*/

public class Book {
  private String title;
  private String isbn;

  public Book(String title, String isbn) {
    this.title = title;
    this.isbn = isbn;
  }

  // toString으로 재정의  => 객체가 가진 정보를 한준의 문자열로 만들어서 반환
  @Override
  public String toString() {
    return "ISBN: " + isbn + "; TITLE : " + title + ";";
  }

  public static void main(String[] args) {
    Book myBook = new Book("자바 튜토리얼", "7777777777");
    System.out.println(myBook);
  }

  
}
