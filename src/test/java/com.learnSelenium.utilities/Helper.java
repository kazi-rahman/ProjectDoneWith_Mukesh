package com.learnSelenium.utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper {

    // ScreenShot,  alerts,  frames,  windows,  Sync issue, JavaScriptExecutor ....

    public static  String captureScreenShot(WebDriver driver){
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String  screenShotPath="src/ScreenShots/_"+getCurrnetDateTime()+".png";
        try {
            FileHandler.copy(src,new File(screenShotPath));
            System.out.println("ScreenShot Captured");
        }
        catch (IOException e) {
            System.out.println("ScreenShot has not been taken" +e.getMessage()); }

        return screenShotPath;
    }


    public static String getCurrnetDateTime(){
        DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy HH_mm_ss");
        Date currentDate=new Date();
       return customFormat.format(currentDate);
    }


}
