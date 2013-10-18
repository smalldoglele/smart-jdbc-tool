package org.hmy.test;

import java.util.Calendar;
import java.util.Date;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    
    /**
     * Create the test case
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }
    
    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }
    
    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        Calendar calendar1=Calendar.getInstance();
        Calendar calendar2=Calendar.getInstance();
        calendar1.set(Calendar.YEAR, 2013);
        calendar1.set(Calendar.MONTH, 3);
        calendar1.set(Calendar.DATE, 9);
        //
        calendar2.set(Calendar.YEAR, 2013);
        calendar2.set(Calendar.MONTH, 10);
        calendar2.set(Calendar.DATE, 14);
        int count=calendar2.get(Calendar.DAY_OF_YEAR)-calendar1.get(Calendar.DAY_OF_YEAR);
        System.out.println(count);
        assertTrue(true);
    }
}
