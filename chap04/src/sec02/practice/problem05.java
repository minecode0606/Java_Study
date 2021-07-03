package sec02.practice;
import java.util.Scanner;

public class problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = (int) scanner.nextInt();
        for (int i=0; i<=size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
