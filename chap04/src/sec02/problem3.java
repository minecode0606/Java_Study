package sec02;

import java.util.TreeMap;

public class problem3 {
    public static void main(String[] args) {
        while (true) {
            int num1 = (int) (Math.random() * 6) + 1;
            int num2 = (int) (Math.random()*6) + 1;
            System.out.println("(" + num1 + "," + num2 + ")");
            if (num1 + num2 == 5) {
                System.out.println("반복을 종료합니다.");
                break;
            }
        }
    }
    public static double function() {
        double a = 1.1;
        return a;
    }
}
