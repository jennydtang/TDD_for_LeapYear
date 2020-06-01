package TDD.LeapYear;

public class LeapYear {
    // Following notes from Class:
    // public String processNumber(int number) {
    // if ((number % 4 == 0) && (number % 100 != 0)) {
    // return "True";
    // } else {
    // return Integer.toString(number);
    // }
    // }
    // Restructuring to fit Boolean:
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