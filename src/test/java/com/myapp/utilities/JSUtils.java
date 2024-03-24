package com.myapp.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JSUtils {
    public static void scrollIntoViewJS(WebElement element){
        JavascriptExecutor js =  (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",element);
    }
    public static void scrollIntoAllTheWayDownJS(){
        JavascriptExecutor js =  (JavascriptExecutor)Driver.getDriver();
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }
    public static void scrollIntoAllTheWayUpJS(){
        JavascriptExecutor js =  (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
    }
    public static void clickBYJS(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", element);

    }
}
