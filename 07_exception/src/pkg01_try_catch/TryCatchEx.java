package pkg01_try_catch;

public class TryCatchEx { // throwable <- 문제점을 던져주면 잡는(Catch) 기능
  
  public static void ex1() { // static 멤버는 static 멤버만 호출할 수 있다.
    //예외가 발생하는 상황
    String s = "1.5";
    int iNumber = Integer.parseInt(s);
    System.out.println(iNumber);
    
  }

  public static void ex2() {
    
    /*
     * 예외 처리란?
     * 1. 예외가 발생했을 때 프로그램이 비정상 종료되지 않도록 적절히 처리하는 것을 의미한다.
     * 2. 예외 발생을 막는 것은 애초에 불가능하다.
     */
    
    /*
     * 예외 처리 구문
     * 1. try 블록   : 실행할 코드를 작성하는 블록으로 이 곳에서 예외가 발생할 수 있다.
     * 2. catch 블록 : try 블록에서 예외가 발생한 경우 해당 예외를 처리하는 블록이다.
     * 3. 형식
     *   try {
     *     실행 코드
     *   } catch(매개변수) {
     *     예외 처리 코드
     *   }
     */
    
    try {
      String s = "2.5";
      int iNumber = Integer.parseInt(s);
      System.out.println(iNumber);
    } catch(NumberFormatException e) { // NumberFormatException 의 부모 Exception 을 일반적으로 대신하여 사용함
      System.out.println("정수만 변환할 수 있습니다.");
    }
    
    }
  
  public static void ex3() {
    
    String s = "1.5";
    try {
      int iNumber = Integer.parseInt(s);
      System.out.println(iNumber);
    } catch(Exception e) { // Exception 의 이름은 e 로 하기로 함
      System.out.println(s + "는 정수로 변환할 수 없습니다.");
    }
    
    }
  
  public static void ex4() {
    try {
      
      String param1 = "5";
      String param2 = "0";
      
      int iNum1 = Integer.parseInt(param1);
      int iNum2 = Integer.parseInt(param2);
      
      System.out.println(iNum1 + "+" + iNum2 + "=" + (iNum1 + iNum2));
      System.out.println(iNum1 + "-" + iNum2 + "=" + (iNum1 - iNum2));
      System.out.println(iNum1 + "*" + iNum2 + "=" + (iNum1 * iNum2));
      System.out.println(iNum1 + "/" + iNum2 + "=" + (iNum1 / iNum2));
      
    } catch(NumberFormatException e) {
      System.out.println("정수만 계산할 수 있습니다.");
    } catch(ArithmeticException e) {
      System.out.println("0으로 나눌 수 없습니다.");
    }
  }
  
  /*
   * 다중 catch 블록을 구성할 때 주의사항
   * 자식 예외 클래스를 먼저 배치하고 부모 예외 클래스를 나중에 배치해야 한다.
   * 
   * try {
   * 
   * } catch(부모타입 e) {
   * 
   * } catch(자식타입 e) {
   * 
   * }
   */
  
  public static void main(String[] args) {
    ex4();
    
  }

}
