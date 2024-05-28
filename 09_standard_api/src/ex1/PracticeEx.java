package ex1;

import java.security.SecureRandom;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

public class PracticeEx {
  
  public static void ex1() {
    
    // 시스템에 저장할 파일명 만들기
    // 형식 : 하이픈이 제거된 UUID + 밑줄 + 타임스탬프.확장자
    
    String originalFilename = "apple.jpg";
    
    System.out.println(originalFilename.replace(".", "_"));
    
    
    
  }
  
  public static void ex2() {
    
    // 나이와 성별을 저장한 Map 만들기
    // 나이 : 현재년도 - 태어난년도
    // 성별 : 하이픈 뒤의 숫자가 1,3이면 남, 2,4이면 여
    
    // 주민번호
    String id = "901010-2******";
    
    int age = 2024 - 1990;
    
    Map<Object, Object> info = Map.of("나이", age, "성별", "남성");
    
  }

  public static void ex3() {
    
    // 각 나라별 수도 맞히기
    
    // 프랑스 수도는? >>> 
    // 파리
    // 스위스 수도는? >>> 
    // 베른
    // 영국 수도는? >>> 
    // 런던
    // 독일 수도는? >>> 
    // 베를린
    // 이탈리아 수도는? >>> 
    // 로마
    // 5개 정답 성공
    
     Map<String, String> map = Map.of("프랑스", "파리"
                                   , "독일", "베를린"
                                   , "이탈리아", "로마"
                                   , "스위스", "베른"
                                   , "영국", "런던");
     Scanner sc = new Scanner(System.in);

     System.out.println("프랑스 수도는? >>>");
     String name1 = sc.next();
     System.out.println("스위스 수도는? >>>");
     String name2 = sc.next();
     System.out.println("영국 수도는? >>>");
     String name3 = sc.next();
     System.out.println("독일 수도는? >>>");
     String name4 = sc.next();
     System.out.println("이탈리아 수도는? >>>");
     String name5 = sc.next();
     
     
     
     sc.close();
     
  }
  
  public static void ex4() {

    // 5000원이 있는 통장(balance)에서 랜덤하게 출금하기
    // 실행예시)
    // 출금 전 5000원, 1회 출금액 2917원, 출금 후 2083원
    // 출금 전 2083원, 2회 출금액 1961원, 출금 후 122원
    // 출금 전 122원, 3회 출금액 102원, 출금 후 20원
    // 출금 전 20원, 4회 출금액 2원, 출금 후 18원
    // 출금 전 18원, 5회 출금액 17원, 출금 후 1원
    // 출금 전 1원, 6회 출금액 1원, 출금 후 0원
    
    
    SecureRandom secureRandom = new SecureRandom();
  
    int balance = 5000;
    int count = 1;
    int coin = 0;
    
    for(count = 1; balance > 0; count++) {
    coin = secureRandom.nextInt(balance) + 1;
    System.out.print("출금 전 " + balance + "원, ");
    balance -= coin;
    System.out.print(count + "회 출금액 " + coin + "원, ");
    System.out.println("출금 후 "  + balance + "원");
    }

  }
  
  public static void ex5() {

    // 윷놀이
    // 실행예시1) "도", 1칸 이동한다.
    // 실행예시2) "개", 2칸 이동한다.
    // 실행예시3) "걸", 3칸 이동한다.
    // 실행예시4) "윷", "도", 5칸 이동한다.
    // 실행예시5) "모", "윷", "도", 10칸 이동한다.
    
    String[] yuts = {"", "도", "개", "걸", "윷", "모"};
    
  }

  public static void ex6() {
    
    // SecureRandom을 이용해 "대문자+소문자+숫자"로 구성된 임의의 인증번호 만들기
    // 실행예시1)
    //   몇 자리의 인증번호를 생성할까요? >>> 4
    //   생성된 4자리 인증번호는 7W5e입니다.
    // 실행예시2)
    //   몇 자리의 인증번호를 생성할까요? >>> 6
    //   생성된 6자리 인증번호는 Fa013b입니다.
    
    SecureRandom secureRandom = new SecureRandom();
    Scanner sc = new Scanner(System.in);
    

    System.out.println("몇 자리의 인증번호를 생성할까요? >>>");
    int number = sc.nextInt();
    
    
    int code = secureRandom.nextInt(16);
    
    System.out.println("생성된 " + number + "자리 인증번호는 " + code + "입니다.");
    
  }

  public static void ex7() {

    // UpDown 게임
    // 컴퓨터가 1 ~ 10000 사이의 난수를 발생시킨다.
    // 사용자는 해당 난수를 맞힌다.
    // 실행예시)
    // 입력 >>> 5000
    // Down!
    // 입력 >>> 2500
    // Up!
    // ...
    // 입력 >>> 4500
    // 정답입니다. 총 5번만에 성공했습니다.
    
    SecureRandom secureRandom = new SecureRandom();

    int number = secureRandom.nextInt(10000);
    System.out.println(number);
    
    
    
  }

  public static void ex8() {

    // 0~9 사이 난수를 100개 발생시키고 발생한 난수들이 생성된 횟수(빈도수)를 그래프화 하여 출력하시오.
    // 실행예시)
    // 0 : #### 4
    // 1 : ############ 12
    // 2 : ############ 12
    // 3 : ##### 5
    // 4 : ######## 8
    // 5 : ########### 11
    // 6 : ############ 12
    // 7 : ################## 18
    // 8 : ####### 7
    // 9 : ########### 11
    
    
    int count = 10;
    int[] numbers = new int[100];    // 100개 난수
    int[] frequencies = new int[count]; // 각 숫자의 빈도수
    

    for(int i = 0; i <= 100; i++) {
      SecureRandom secureRandom = new SecureRandom();
      int randomNumber = secureRandom.nextInt(count);
      System.out.println(randomNumber);
      
    }
    
    
    
  }
  
  public static void ex9() {
    
    // 5 x 5 숫자 빙고판 자동 생성
    //
    // 지시사항)
    //   1. 1 ~ 25 사이 정수를 2차원 배열 bingo 에 순차적으로 넣는다.
    //      1  2  3  4  5
    //      6  7  8  9 10
    //     11 12 13 14 15
    //     16 17 18 19 20
    //     21 22 23 24 25
    //   2. 25번 서로 섞는다.
    //      순차적으로        랜덤하게
    //      모든요소접근      접근
    //      ----------------------------
    //      bingo[0][0]  <->  bingo[1][4]
    //      bingo[0][1]  <->  bingo[0][2]
    //      bingo[0][2]  <->  bingo[2][1]
    //      ...
    //      bingo[4][4]  <->  bingo[3][1]
    //
    // 실행예시)
    //  10  9  4 25  2
    //  15  3 13 21  1
    //  14 20 11 19  6
    //   8 17  5 12  7
    //  16 22 18 24 23

    // 빙고 크기
    final int SIZE = 5;
    
  }
  
  public static void main(String[] args) {
    ex7();    
  }

}