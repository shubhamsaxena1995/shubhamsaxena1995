package com.priority;

import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 1)
    public void firstTestCase() {
        System.out.println("FirstTestCase");
    }

    @Test(priority = 2)
    public void setup() {
        System.out.println("setting up");
        //Assert.fail();
    }
    @Test(priority = 4)
    public void shopping() {
        System.out.println("shopping");
    }

    @Test(priority = 5)
    public void pricing() {
        System.out.println("pricing");
    }

    @Test(priority = 3,enabled=true)
    public void search() {
        System.out.println("search");
    }
}
