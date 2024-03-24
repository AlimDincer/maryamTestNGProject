package com.myapp.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MediaUtils {
    public static String takeScreenshotOfEntirePage(String name) throws IOException {
     String date= new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
     TakesScreenshot st=(TakesScreenshot) Driver.getDriver();
     File source = st.getScreenshotAs(OutputType.FILE);
     String target = System.getProperty("user.dir")+ "/test-output/Reports/Screenshot/"+date+"image.png";
     File finalDestination =new File(target);
     FileUtils.copyFile(source, finalDestination);
          return target;
      }
    public static void takeScreenshotOfThisElement() throws IOException {
      File image = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);
      String now= new SimpleDateFormat("yyMMddhhmmss").format(new Date());
      String path = System.getProperty("user.dir")+ "/test-output/ElementScreenshot/"+now+"image.png";
      FileUtils.copyFile(image,new File(path));
       }
}
