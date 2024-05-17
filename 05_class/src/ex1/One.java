package ex1;

public class One {
  
  void method(int number) {
    if(number > 0) {
      System.out.print("method:" + "positive");
    } else if(number == 0) {
      System.out.print("method:" + "zero");
    } else {
      System.out.print("method:" + "negative");
    }
    System.out.println();
  }
}
