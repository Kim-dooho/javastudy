package ex3;

import java.util.ArrayList;
import java.util.List;

public class Bus {
  
  private List<Seat> seats;
  public static final int LIMIT = 8;
  private int numOfPerson;
  
  public Bus() {
    // 구현
    seats = new ArrayList<Seat>(); // 좌석 만들기
    for(int i = 0; i < LIMIT; i++) {
      seats.add(new Seat());
    }
    numOfPerson = 0;
  }
  
  // 버스 타기 (항상 앞자리부터 채운다.)
  public void on(Person person) throws RuntimeException {
    // 구현
    if(numOfPerson == LIMIT) {
      throw new RuntimeException("만석입니다.");
    }
    for(int i = 0; i < LIMIT; i++) {
      Seat seat = seats.get(i);
      Person p = seat.getPerson();
      if(p ==null) {
        seat.setPerson(person);
        numOfPerson++;
        break;
      }
    }
  }
  
  // 버스 내리기 (내리는 사람의 좌석 번호가 전달된다.)
  public void off(int seatNo) throws RuntimeException {
    // 구현
    if(seatNo <= 0 || seatNo > LIMIT) {
      throw new RuntimeException("없는 좌석입니다.");
    }
    int i = seatNo - 1;
    Seat seat = seats.get(i);
    Person p = seat.getPerson();
    if(p != null) {
      seat.setPerson(null);
      numOfPerson--;
    }
  }
  
  // 탑승자 목록 확인
  public void passengerList() {
    // 01번 좌석 : 홍길동
    // 02번 좌석 : 김두한
    // 03번 좌석 : 비어있음
    // ...
    // 25번 좌석 : 비어있음
    for(int i = 0; i < LIMIT; i++) {
      Person p = seats.get(i).getPerson();
      String seatNo = String.format("%02d", i + 1);
      System.out.print(seatNo + "번 좌석 : ");
      if(p == null) {
        System.out.println("비어있음");
      } else {
        System.out.println(p.getName());
      }
    }
  }
  
}
