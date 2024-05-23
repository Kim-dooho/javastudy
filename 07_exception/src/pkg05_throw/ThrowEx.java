package pkg05_throw;

public class ThrowEx {

  public static void main(String[] args) {
    
    // throw 문 : 개발자가 직접 예외를 만들어서 던지는 코드를 작성할 때 사용한다.
    
    int score = 0;
    try {
      
      score = 60;
      
      if(score < 0 || score > 100) {
        
        throw new RuntimeException();  // 직접 만든 예외를 던지기
        
      }
      
      String pass = (score >= 60) ? "합격" : "불합격";
      
      System.out.println(score + "점은 " + pass + "입니다.");
      
    } catch(RuntimeException e) {
      System.out.println(score + "점은 잘못된 점수입니다.");
    }

  }

}
