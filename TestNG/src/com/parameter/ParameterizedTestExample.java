package com.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTestExample {
    @Test
    @Parameters("myName")
    public void parameterTest(String myName) {

        System.out.println("My name is : " + myName);
    }
    @Test
    @Parameters({"a","b"})
    public void add(int c, int d)
    {
        int sum=c+d;
        System.out.println("Sum of two numbers : "+sum);
    }
    @Test
    @Parameters({"a","b"})
    public void subtract(int c, int d)
    {
        int subtract=c-d;
        System.out.println("Subtraction of two numbers : "+subtract);
    }
    @Test
    @Parameters({"a","b"})
    public void mul(int c, int d)
    {
        int mul=c*d;
        System.out.println("Multiplication of two numbers : "+mul);
    }

}
