import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Created by haim on 11/24/15.
 */
public class YearTest {

    public void testIsLeapYear() throws Exception {
        year tester = new year();
        assertEquals("1800 is false",false, tester.isLeapYear(1800));
        assertEquals("1900 is false", false, tester.isLeapYear(1900));
        assertEquals("1994 is false",false, tester.isLeapYear(1994));
        assertEquals("1998 is false",false, tester.isLeapYear(1998));
        assertEquals("1999 is false",false, tester.isLeapYear(1999));
        assertEquals("2000 is true",true, tester.isLeapYear(2000));
        assertEquals("2001 is false",false, tester.isLeapYear(2001));
        assertEquals("2004 is true",true, tester.isLeapYear(2004));
        assertEquals("2100 is false", false, tester.isLeapYear(2100));
        assertEquals("4 is false",false, tester.isLeapYear(4));
    }
}











