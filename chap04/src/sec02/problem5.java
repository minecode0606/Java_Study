package sec02;

public class problem5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
