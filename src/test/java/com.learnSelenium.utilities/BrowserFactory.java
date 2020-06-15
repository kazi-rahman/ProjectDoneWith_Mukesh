package com.learnSelenium.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserFactory {

  //WebDriver driver;

    public static WebDriver startApplication(WebDriver driver,String browserName,String url)
     {
        if(browserName.equals("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver();
        }
        else if (browserName.equals("ff"))
        {
                WebDriverManager.firefoxdriver().setup();
                driver= new FirefoxDriver();

        }
        else {
            System.out.println("browser not supported");
        }
         driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
         driver.navigate().to(url);
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);



        return driver;
    }


     public static void closeBrowser(WebDriver driver){
        driver.close();
        driver.quit();
     }

}
