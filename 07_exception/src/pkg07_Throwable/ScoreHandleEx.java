package pkg07_Throwable;

public class ScoreHandleEx {

  public static void main(String[] args) {
    
    try {
      ScoreHandle scorehandle = new ScoreHandle();
      String pass = scorehandle.getPass(-100);
      System.out.println(pass);
    } catch(RuntimeException e) {
      System.out.println(e.getMessage());  // 예외 메시지 확인
      e.printStackTrace();                 // 예외 발생한 곳을 추적하기 System.out 은 검은 글씨, System.err 은 빨간 글씨
    }
    
  }

}
