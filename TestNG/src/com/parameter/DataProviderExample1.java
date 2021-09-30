package com.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample1 {

    @DataProvider(name = "ObjectDataProvider")
    public static Object[][] primeNumbers() {
        return new Object[][] { { new DataProviderBean("GREEN", 111) },
                { new DataProviderBean("BLACK", 222) },
                { new DataProviderBean("BLUE", 333) }
        };
    }

    @Test(dataProvider = "ObjectDataProvider")
    public void testMethod(DataProviderBean myBean) {
        System.out.println(myBean.getVal() + " " + myBean.getI());
    }


}
