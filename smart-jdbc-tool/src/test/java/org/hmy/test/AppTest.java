package org.hmy.test;

import java.util.Calendar;
import java.util.Date;

import org.smart.jdbc.tool.util.JdbcUtil;

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
        JdbcUtil jdbcUtitl = new JdbcUtil();
        System.out.println(jdbcUtitl.getTableDefineds().size());
        System.out.println(jdbcUtitl.getColumnDefinedsByTableName("t_rp"));
    }
}
