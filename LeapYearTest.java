package TDD.LeapYear;

import org.junit.Assert;
import org.junit.Test;

public class LeapYearTest {

    @Test
    public void leapYearDivisibleByFour() {
        // LeapYear leapYear = new LeapYear();
        // Assert.assertEquals("1996", leapYear.processNumber(1996));
        Assert.assertTrue(LeapYear.IsLeapYear(1996));
    }

    @Test
    // public void yearsNotDivisibleByFour() {
    // LeapYear leapYear = new LeapYear();
    // Assert.assertEquals("2001", leapYear.processNumber(2001));
    // }
    public void yearsNotDivisbleByFour() {
        Assert.assertFalse(LeapYear.IsLeapYear(2001));
    }

    @Test
    public void leapYearsNotDivisbleByOneHundred() {
        // LeapYear leapYear = new LeapYear();
        // Assert.assertEquals("1900", leapYear.processNumber(1900));
        Assert.assertFalse(LeapYear.IsLeapYear(1900));
    }

    @Test
    public void leapYearsDivisibleByFourHundred() {
        Assert.assertTrue(LeapYear.IsLeapYear(2000));
    }
}
