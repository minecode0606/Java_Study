package sec02.exam03;
import java.util.Scanner;

public class ForSumFrom1To100Example2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int loop;
        int i = 0;
        int sum = 0;
        System.out.println("1부터 더할수를 입력하시요 :");
        loop = scanner.nextInt();

        for (i=1; i<=loop; i++) {
            sum += i;
        }

        System.out.println("1~" + (i-1) + " 합 :" + sum);
    }
}
// STOPSHIP: 2021/06/29