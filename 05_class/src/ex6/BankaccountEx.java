package ex6;

public class BankaccountEx {

  public static void main(String[] args) {
    
    // Bankaccount 타입의 인스턴스 생성
    BankAccount bankAccount1 = new BankAccount("010-1234-5678", 100);
    BankAccount bankAccount2 = new BankAccount("010-8765-4321", 200);
    
    // 이체 (출금 -> 입금)
    // bankAccount1 -> bankAccount2, 100 이체하기
    bankAccount1.transfer(bankAccount2, 500);
    
    bankAccount1.inquiry();
    bankAccount2.inquiry();
    
    

  }

}
