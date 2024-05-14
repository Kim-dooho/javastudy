package pkg03_compare;

public class CompareEx {

  public static void main(String[] args) {
    
    // 비교 연산
    // boolean 타입의 결과(true 또는 false)를 반환
    
    int a = 10;
    int b = 20;
    
    System.out.println(a > b);
    System.out.println(a >= b);
    System.out.println(a < b);
    System.out.println(a <= b);
    System.out.println(a == b);
    System.out.println(a != b);
    
    //주의사항. 문자열은 동등비교(==, !=) 사용을 하지 않는다.(주소값을 비교하기 때문)
    String myName = "king";
    String yourName =  "king";
    System.out.println(myName == yourName);

  }

}
