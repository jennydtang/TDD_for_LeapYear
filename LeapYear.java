package TDD.LeapYear;

public class LeapYear {

    public static boolean IsLeapYear(int year) {
        if (isMultipleOf4(year) && ((notDivisbleBy4(year)) || (isMultipleOf400(year)))) {
            return true;
        } else {
            return false;
        }
    }

    // refactor code below
    private static boolean isMultipleOf4(int year) {
        return year % 4 == 0;
    }

    private static boolean notDivisbleBy4(int year) {
        return year % 100 != 0;
    }

    private static boolean isMultipleOf400(int year) {
        return year % 400 == 0;
    }

}