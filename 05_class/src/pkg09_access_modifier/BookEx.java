package pkg09_access_modifier;

public class BookEx {

  public static void main(String[] args) {
    
    // Book 타입의 인스턴스 생성 (생성자가 호출되는 부분)
    Book book1 = new Book("콩쥐와팥쥐", 100);
    Book book2 = new Book("좋은생각", "누군가");
    Book book3 = new Book("소나기", "황순원", 200);
    
    //인스턴스 정보 출력
    book1.print();
    book2.print();
    book3.print();

  }

}
