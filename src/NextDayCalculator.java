public class NextDayCalculator {

    public static final String CONNECTION = "/";

    public static String getNextDay(int day, int month, int year) {
        int lastDayOfMonth = getLastDayOfMonth(month, year);
        int firstDayOfMonth = 1;
        if (day == lastDayOfMonth && month == 12) {
            day = firstDayOfMonth;
            month = 1;
            year++;
        } else if (day == lastDayOfMonth){
            day = firstDayOfMonth;
            month++;
        } else {
            day++;
        }
        return day + CONNECTION + month + CONNECTION + year;
    }

    private static int getLastDayOfMonth(int month, int year) {
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
            case 4:
            case 6:
            case 9:
            case 11:
                lastDayOfMonth = 30;
                break;
            case 2:
                if (divisibleBy400(year)) {
                    lastDayOfMonth = 29;
                } else if (divisibleBy4(year) && notDivisibleBy100(year)) {
                    lastDayOfMonth = 29;
                } else {
                    lastDayOfMonth = 28;
                }

                break;
        }
        return lastDayOfMonth;
    }

    private static boolean notDivisibleBy100(int year) {
        return year % 100 != 0;
    }

    private static boolean divisibleBy4(int year) {
        return year % 4 == 0;
    }

    private static boolean divisibleBy400(int year) {
        return year % 400 == 0;
    }
}
