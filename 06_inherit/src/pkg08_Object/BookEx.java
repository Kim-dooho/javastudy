package pkg08_Object;

public class BookEx {

  public static void main(String[] args) {
    
    // Book 클래스 타입의 인스턴스 생성
    Book book1 = new Book("홍길동전", "허균");
    Book book2 = new Book("홍길동전", "허균");
    
    //참조 타입의 인스턴스 동등 비교
    System.out.println(book1.equals(book2)); //book1 과 book2의 문자열 비교, 주소값이 아닌 문자 자체를 비교하기 위한 작업을 하였음
    
    // 인스턴스의 문자열 확인
    System.out.println(book1); //toString 생략 가능함
    System.out.println(book2);

  }

}
