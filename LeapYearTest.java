package TDD.LeapYear;

import org.junit.Assert;
import org.junit.Test;

public class LeapYearTest {

    @Test
    public void leapYearDivisibleByFour() {
        Assert.assertTrue(LeapYear.IsLeapYear(1996));
    }

    @Test
    public void yearsNotDivisbleByFour() {
        Assert.assertFalse(LeapYear.IsLeapYear(2001));
    }

    @Test
    public void leapYearsNotDivisbleByOneHundred() {
        Assert.assertFalse(LeapYear.IsLeapYear(1900));
    }

    @Test
    public void leapYearsDivisibleByFourHundred() {
        Assert.assertTrue(LeapYear.IsLeapYear(2000));
    }
}
