package sec01.practice;

public class stringstudy {
    public static void main(String[] args) {
        String name1 = "강민서";
        String name2 = "강민서";
        System.out.println(name1 == name2); // name1과 name2는 같은겍체를 참조한다.

        boolean result = name1.equals(name2);
        System.out.println(result);
        String name3 = "강소율";
        boolean result2 = name1.equals(name3);
        System.out.println(result2);
    }
}
