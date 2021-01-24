package sec01.exam01;

public class VariableInitializationExample {
    public static void main(String[] args) {
        // 변수 value 선언
        int value;

        // value 에 값 부여
        value = 10;

        // 변수 value 값을 읽고 10을 더하는 연산 수행
        // 연산의 결과값을 번수 result에 저장
        int result = value + 10; // <- value 의 값이 없기떄문에 에러 발생

        // 변수 result 값 출력
        System.out.println(result);
    }
}
