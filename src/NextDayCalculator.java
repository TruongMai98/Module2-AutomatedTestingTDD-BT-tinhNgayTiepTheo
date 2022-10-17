public class NextDayCalculator {

    public static final String CONNECTION = "/";

    public static String getNextDay(int day, int month, int year) {
        int lastDayOfMonth = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                lastDayOfMonth = 31;
                break;
            case 2:
            case 4:
            case 6:
            case 9:
            case 11:
                lastDayOfMonth = 30;
                break;
        }
        int firstDayOfMonth = 1;
        if (day == lastDayOfMonth) {
            day = firstDayOfMonth;
            month++;
        } else {
            day++;
        }
        return day + CONNECTION + month + CONNECTION + year;
    }
}
