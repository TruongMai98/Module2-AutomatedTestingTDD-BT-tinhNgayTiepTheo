public class NextDayCalculator {

    public static final String CONNECTION = "/";

    public static String getNextDay(int day, int month, int year) {
        return ++day + CONNECTION + month + CONNECTION + year;
    }
}
