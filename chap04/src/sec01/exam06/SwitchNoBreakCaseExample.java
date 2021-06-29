package sec01.exam06;

public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {
        int time = (int) (Math.random() * 4) + 8;
        System.out.println("[현재시각: "+ time + " 시]");

        switch (time) {
            case 9:
                System.out.println("학교에 갑니다.");
            case 10:
                System.out.println("수업을 듣습니다.");
            case 12:
                System.out.println("점심을 먹습니다");
            default:
                System.out.println("나도 모릅니다.");
        }
    }
}
