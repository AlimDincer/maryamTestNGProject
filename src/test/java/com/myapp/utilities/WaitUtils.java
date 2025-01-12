package com.myapp.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {
    public static WebElement waitForVisibility(WebElement element, int timeout){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return  wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static WebElement waitForClickablility(By locator, int timeout){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(timeout));
        return  wait.until(ExpectedConditions.elementToBeClickable(locator));

    }  public static void waitFor(int seconds){
        try{
            Thread.sleep(seconds*1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
