package com.example.secondapp;


import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    Calculator calculator;

    //oncreate
    public void setUp() throws Exception {
        super.setUp();
        calculator = new Calculator();
    }

    //ondestroy
    public void tearDown() throws Exception {
    }

    public void testAdd() {
        int expected = 40;
        int actual = Calculator.add(10,20);

        assertEquals(expected,actual);

    }

    public void testLogin(){
        // boolean expected = true;
        boolean actual = calculator.login("myname","mypass");
        assertTrue(actual);
    }
}