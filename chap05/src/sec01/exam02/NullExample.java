package sec01.exam02;

public class NullExample {
    public static void main(String[] args) {
        String hobby = null;
        String name = "홍자바"; // 가비지 컬렉터의 의해 소멸됨
        name = null;
    }
}
