package com.report;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstDemo {

    @Test
    public void firstTestCase() {
        System.out.println("FirstTestCase");
    }

    @Test
    public void setup() {
        System.out.println("setting up");
      //  Assert.fail();
    }
    @Test
    public void shopping() {
        System.out.println("shopping");
    }

    @Test
    public void pricing() {
        System.out.println("pricing");
    }

    @Test
    public void search() {
        System.out.println("search");
    }
}
