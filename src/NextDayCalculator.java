public class NextDayCalculator {

    public static final String CONNECTION = "/";

    public static String getNextDay(int day, int month, int year) {
        int lastDayOfMonth = 31;
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
