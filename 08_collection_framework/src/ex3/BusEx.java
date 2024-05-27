package ex3;

public class BusEx {

  public static void main(String[] args) {
    
    try {
      
      Bus bus = new Bus();
      
      bus.on(new Woman("낸시"));
      bus.on(new Man("캐서린"));
      bus.on(new Man("존스"));
      bus.on(new Woman("마이클"));
      bus.on(new Woman("레베카"));
      
      bus.passengerList();
      
      bus.off(3);
      
      bus.passengerList();
      
      bus.on(new Woman("엠마")); // 3
      
      bus.passengerList();
      
    } catch (RuntimeException e) {
      System.out.println(e.getMessage()); // 만차입니다. // 없는 좌석입니다.
    }

  }

}
