package sec03.exam02;

import sec03.exam01.Week;

import java.util.Calendar;

public class EnumWeekExample {
    public static void main(String[] args) {
        Week today = null;

        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch (week) {
            case 1:
                today = Week.SUNDAY;
                break;
            case 2:
                today = Week.MONDAY;
                break;
            case 3:
                today = Week.THURSDAY;
                break;
            case 4:
                today = Week.WEDNESDAY;
                break;
            case 5:
                today = Week.THURSDAY;
                break;
            case 6:
                today = Week.FRIDAY;
                break;
            case 7:
                today = Week.SUNDAY;
                break;
        }

        System.out.println("오늘요일 : " + today);

        if (today == Week.SATURDAY | today == Week.SUNDAY) {
            System.out.println("학교에 가지 않습니다.");
        } else {
            System.out.println("학교에 갑니다.");
        }
    }
}