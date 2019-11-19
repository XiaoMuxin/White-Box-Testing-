package com.test.jacoco.test;

import static org.junit.Assert.assertEquals;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	int a = hw.Method3(6, -1, 1);
        a = hw.Method3(4, -1, 1);
    	a = hw.Method3(6, 0, -1);
        a = hw.Method3(4, 0, -3);
        a = hw.Method3(4, 0, -1);
    }
    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */
     @Test
    public void testbug() {
        HelloWorld hw = new HelloWorld();
        boolean a=hw.bug(5);
        a=hw.bug(0);
    }
     @Test
    public void testMethod4() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method4(5,2,3,3,4);
        a = hw.Method4(4,4,3,2,4);
        a = hw.Method4(0,2,3,3,4);
        a = hw.Method4(5,5,3,3,4);
        a = hw.Method4(5,5,3,2,4);
        //a = hw.Method4(5,2,3,4,4);
        //a = hw.Method4(3,2,3,4,4);
        //a = hw.Method4(4,3,2,2,4);
    }
     @Test
    public void testisTriangle() {
        HelloWorld hw = new HelloWorld();
        boolean a=hw.isTriangle(1,2,3);
        a=hw.isTriangle(3,2,3);
        a=hw.isTriangle(-3,-2,-3);
        a=hw.isTriangle(3,-2,-3);
        a=hw.isTriangle(3,2,-3);
        a=hw.isTriangle(3,1,2);
        a=hw.isTriangle(1,3,2);
    }
    @Test
    public void testisBirthday() {
        HelloWorld hw = new HelloWorld();
        boolean a=hw.isBirthday(2019,10,1);
        a=hw.isBirthday(1900,2,28);
        a=hw.isBirthday(2000,2,30);
        a=hw.isBirthday(2019,0,1);
        a=hw.isBirthday(2018,13,1);
        a=hw.isBirthday(2019,1,0);
        a=hw.isBirthday(2018,2,0);
        a=hw.isBirthday(2018,3,0);
        a=hw.isBirthday(2018,4,0);
        a=hw.isBirthday(2018,5,0);
        a=hw.isBirthday(2018,6,0);
        a=hw.isBirthday(2018,7,0);
        a=hw.isBirthday(2018,8,0);
        a=hw.isBirthday(2018,9,0);
        a=hw.isBirthday(2018,10,0);
        a=hw.isBirthday(2018,11,0);
        a=hw.isBirthday(2018,12,0);
        a=hw.isBirthday(2019,1,32);
        a=hw.isBirthday(2018,2,30);
        a=hw.isBirthday(2018,3,32);
        a=hw.isBirthday(2018,4,32);
        a=hw.isBirthday(2018,5,32);
        a=hw.isBirthday(2018,6,32);
        a=hw.isBirthday(2018,7,32);
        a=hw.isBirthday(2018,8,32);
        a=hw.isBirthday(2018,9,32);
        a=hw.isBirthday(2018,10,32);
        a=hw.isBirthday(2018,11,32);
        a=hw.isBirthday(2018,12,32);
        a=hw.isBirthday(2018,4,1);
        a=hw.isBirthday(1000,3,1);
        a=hw.isBirthday(3000,3,1);
        a=hw.isBirthday(2019,11,1);
        a=hw.isBirthday(2019,10,2);
        a=hw.isBirthday(2019,8,1);
        a=hw.isBirthday(2000,2,0);
        a=hw.isBirthday(2000,2,1);
        a=hw.isBirthday(2008,2,0);
    }
    @Test
    public void testminiCalculator() {
        HelloWorld hw = new HelloWorld();
        double a=hw.miniCalculator(1.0,2.0,'+');
        a=hw.miniCalculator(1.0,2.0,'-');
        a=hw.miniCalculator(1.0,2.0,'*');
        a=hw.miniCalculator(1.0,2.0,'/');
    }
}
