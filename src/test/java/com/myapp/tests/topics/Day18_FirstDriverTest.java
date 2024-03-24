package com.myapp.tests.topics;

import com.myapp.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day18_FirstDriverTest {
    @Test
    public void test1(){
    Driver.getDriver().get("https:www.amazon.com");
    String actualTitle= Driver.getDriver().getTitle();
        System.out.println(actualTitle);
    assert actualTitle.contains("Amazon");
    Assert.assertTrue(actualTitle.contains("Amazon"));


    }

}
