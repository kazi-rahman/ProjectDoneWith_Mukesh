package com.learnSelenium.utilities;

import com.learnSelenium.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class LoginTestSpree extends BaseClass {

    @Test
    public void loginSpree(){


        logger = reports.createTest("Login to Spree Website");
        LoginPage loginpage= PageFactory.initElements(driver,LoginPage.class);
        logger.info("Starting Spree Application");
        loginpage.loginToSpree(excel.StringExcelData("login",1,0),excel.StringExcelData("login",1,1));
        Helper.captureScreenShot(driver);
        logger.pass("Login to the Spree has completed Successfully");
    }
}
