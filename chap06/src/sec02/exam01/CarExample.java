package sec02.exam01;

public class CarExample {
    public static void main(String[] args) {
        // 겍체 생성
        Car mycar = new Car();

        // 필드값 읽기
        System.out.println("제작회사: " + mycar.company);
        System.out.println("모델명: " + mycar.company);
        System.out.println("색갈: " + mycar.color);
        System.out.println("최고속도: " + mycar.maxSpeed);
        System.out.println("현재속도: " + mycar.speed);

        // 필드값 변경
        mycar.speed = 60;
        System.out.println("수정된 속도: " + mycar.speed);
    }
}