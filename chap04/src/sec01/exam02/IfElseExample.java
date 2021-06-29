package sec01.exam02;

import java.util.Scanner;
public class IfElseExample {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int score;

        System.out.println("점수 : ");
        score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A 입니다.");
        } else {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다.");
        }
    }
}