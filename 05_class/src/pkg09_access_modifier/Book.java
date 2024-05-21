package pkg09_access_modifier;

/*
 * 접근지시자
 * 1. 클래스의 멤버(필드, 메소드)에 접근할 수 있는 권한을 부여할 수 있다.
 * 2. 일반적으로 필드는 접근을 막고, 메소드는 접근을 허용한다.
 * 3. 종류
 *   1) private   : 같은 클래스 내부에서만 접근할 수 있다.
 *   2) default   : 같은 패키지 내부에서만 접근할 수 있다.
 *   3) protected : 같은 패키지 내부 또는 상속 관계의 다른 클래스에서만 접근할 수 있다.
 *   4) public    : 누구나 접근할 수 있다.
 *       private, public 둘만 알면 된다.
 */

public class Book {
  
  // field
  private String title;
  private String writer;
  private int price;
  
  
  // constructor
  public Book(String title, int price) {
    //this.title = title;
    //this.price = price;
    //this.writer = "작가미상";
    this(title, "작가미상", price);//this(제목, 작가, 가격);
    
  }
  public Book(String title, String writer) {
    //this.title = title;
    //this.writer = writer;
    //this.price = 0;
    this(title,writer, 0);
  }
  
  public Book(String title, String writer, int price) {
    this.title = title;
    this.writer = writer;
    this.price = price;
  }
  
  // method
  public void print() {
    System.out.println("제목 : " + title);
    System.out.println("작가 : " + writer);
    System.out.println("가격 : " + price + "원");
  }
  
  
}
