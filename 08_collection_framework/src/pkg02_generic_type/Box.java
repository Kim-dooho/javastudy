package pkg02_generic_type;

/*
 * generic type
 * 1. 일반화 되어 있는 타입을 의미한다.
 * 2. 인스턴스 생성 시점(new)에 어떤 타입을 사용할 것인지 결정한다. (구체화)
 * 3. 오직 reference type 만 사용할 수 있다. (primitive type 이 필요한 경우 해당 타입의 wrapper class 를 사용해야 한다.
 */

public class Box<T> { // <T> 어떤 타입이든 받아와서 완성됨 전달할 수 있는 타입은 reference type 뿐임(Integer 등)
  
  private T data;     // int (T 로 바꿈) 를 전달한 정보에 따라 long 나 String 등으로 바꾸는 기능이 generic type (T)

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }
  
  

}
