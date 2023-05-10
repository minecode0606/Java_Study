package sec04.practice;

import java.util.Scanner;
public class problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strnum1 = scanner.nextLine();
        String strnum2 = scanner.nextLine();
        int strint1 = Integer.parseInt(strnum1);
        int strint2 = Integer.parseInt(strnum2);
        System.out.println(strint1 + strint2);
    }
}
