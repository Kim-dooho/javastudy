package pkg01_wrapper_class;

public class WrapperEx {

  public static void main(String[] args) {
    
    /*
     * primitive type     reference type (wrapper class)  // collection_framework 에서는 reference type 만 쓰기
     * 1. byte            Byte
     * 2. short           Short
     * 3. int             Integer
     * 4. long            Long
     * 5. float           Float
     * 6. double          Double
     * 7. char            Character
     * 8. boolean         Boolean
     */
    
    // Boxing (primitive type → reference type)
    Integer number = 10;                          // int number = 10; 과 같으나 null 값도 가질 수 있다.
    
    // UnBoxing (reference type → primitive type)
    int number2 = number;                         // Integer number = 10; 를 다시 primitive type 으로 바꿈
    
    System.out.println(number);  // reference type 10
    System.out.println(number2); // primitive type 10
    System.out.println(number + number2);

  }

}
