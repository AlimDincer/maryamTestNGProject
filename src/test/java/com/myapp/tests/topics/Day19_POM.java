package com.myapp.tests.topics;

import com.myapp.pages.OrangeHRMLPage;
import com.myapp.utilities.ConfigReader;
import com.myapp.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day19_POM {
    @Test
    public void loginTest(){
       OrangeHRMLPage pom=new OrangeHRMLPage();
       Driver.getDriver().get(ConfigReader.getProperty("orange_url"));
       pom.username.sendKeys("Admin");
       pom.password.sendKeys("admin123");
       pom.login.click();
       pom.dashboard.getText();
       Assert.assertTrue(pom.dashboard.getText().equals("Dashboard"));
    }
}
