package sec03.exam05;

public class OperationPromotionExample {
    public static void main(String[] args) {
        byte bytevalue1 = 10;
        byte bytevalue2 = 20;
        // byte bytevalue3 = bytevalue1 + bytevalue2; // <- 컴파일 에러
        int intvalue1 = bytevalue1 + bytevalue2;
        System.out.println(intvalue1);

        char charvalue1 = 'A';
        char charvalue2 = 1;
        // char charvalue3 = charvalue1 + charvalue2; //<- 컴파일 에러
        int intvlaue2 = charvalue2 + charvalue1;
        System.out.println("유니코드: " + intvlaue2);
        System.out.println("출력문자: " + (char)intvlaue2);



    }
}
