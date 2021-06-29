package sec01.exam03;
import java.util.Scanner;

public class IfElseIfElseExample {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int score;

        System.out.println("점수 : ");
        score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("점수가 100 ~ 90입니다.");
            System.out.println("등급은 A 입니다.");
        } else if (score >= 80) {
            System.out.println("점수가 80 ~ 89입니다.");
            System.out.println("등급은 B입니다.");
        } else if (score >= 70) {
            System.out.println("점수가 70 ~ 79입니다.");
            System.out.println("등급은 C입니다.");
        } else {
            System.out.println("점수가 70 미만입니다.");
            System.out.println("등급은 D입니다.");
        }
    }
}
