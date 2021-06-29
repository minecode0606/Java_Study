package sec02.exam05;

public class CharOperationExample {
    public static void main(String[] args) {
        char c1 = 'A' + 1;
        char c2 = 'A';
        // char c3 = c2 + 1; // <- 산술연산은 int 타입이므로 연산 결과는 int가 됨
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        // System.out.println("c3 = " + c3);
    }
}
