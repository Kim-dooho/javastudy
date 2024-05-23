package pkg04_checked;

import java.util.Objects; //Objects 에 ctrl + spacebar 로 import 자동생성

public class CheckedEx {

  public static void main(String[] args) {
    
    /*
     * 클래스 호출 방식
     * 1. 패키지와 클래스를 함께 작성해야 한다.
     * 2. 패키지를 생략할 수 있는 경우가 있다.
     *   1) 같은 패키지에 저장된 클래스
     *   2) java.lang 패키지에 저장된 클래스 (System, String 등)
     * 3. 패키지를 생략할 수 없다면 패키지를 작성해야 한다.
     *   1) import 패키지.클래스 : 한 번만 작성 // 자동완성을 해야 하는 이유
     *   2) 패키지.클래스        : 매 번 작성
     */
    
    /*
     * checked exception
     * 1. 예외 처리 구문(try-catch, throws) 구문이 없으면 동작하하지 않는 예외를 의미한다.
     * 2. 실행 전에 미리 예외 처리를 해야 한다.
     * 3. RuntimeException 클래스가 아닌 예외 클래스들이다.
     */
    
    try {
      Class.forName("oracle.jdbc.OracleDriver");  // 반드시 패키지와 같이 적어야 한다.
    } catch(ClassNotFoundException e) {
      System.out.println("해당 클래스를 찾을 수 없습니다.");  // try-catch 가 없으면 안된다.
    }
    
  }

}
