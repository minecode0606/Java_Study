package sec02.exam06;

public class StringConcatExample {
    public static void main(String[] args) {
        String str1 = "JDK" + "15.0";
        String str2 = str1 + " 개발버전";
        System.out.println(str2);

        String str3 = "JDK" + 15 + .0;
        String str4 = 10 + 5.0 + "JDK";

        System.out.println(str3);
        System.out.println(str4);
    }
}
