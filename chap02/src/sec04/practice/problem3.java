package sec04.practice;

import java.util.Scanner;
public class problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[필수 정보 입력]");
        System.out.print("이름: ");
        String name = scanner.nextLine();
        System.out.print("주민번호 앞 6자리: ");
        String livenumber = scanner.nextLine();
        System.out.print("전화번호: ");
        String phone = scanner.nextLine();
        System.out.println("[입력한내용]");
        System.out.println(name);
        System.out.println(livenumber);
        System.out.println(phone);
    }
}
