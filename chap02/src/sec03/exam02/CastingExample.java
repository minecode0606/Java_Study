package sec03.exam02;

public class CastingExample {
    public static void main(String[] args) {
        int intvalue = 44032;
        char charvalue = (char) intvalue;
        System.out.println(charvalue);

        long longvalue = 500;
        intvalue = (int) longvalue;
        System.out.println(intvalue);

        double doublevlaue = 3.14;
        intvalue = (int) doublevlaue;
        System.out.println(intvalue);
    }
}
