package com.learnSelenium.utilities;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;

public class BaseClass {
    protected WebDriver driver;
    public ExcelDataProvider excel;
    public ConfigDataProvider conf;
    public ExtentReports reports;
    public ExtentTest logger;

    @BeforeSuite
    public void setUpSuite() {
        excel = new ExcelDataProvider();
        conf = new ConfigDataProvider();
        ExtentHtmlReporter extent = new ExtentHtmlReporter(new File("src/Reports/report.html"));

        reports = new ExtentReports();
        reports.attachReporter(extent);

    }


    @BeforeClass
    public void setup() {
        //driver = BrowserFactory.startApplication(driver , conf.getBrowserFromConfig(), conf.getURLFromConfig());
        driver = BrowserFactory.startApplication(driver, "chrome", "http://spree.shiftedtech.com/");

    }

    @AfterClass
    public void tearDown() {
        //driver.close();
        // driver.quit();
    }

    @AfterMethod
    public void tearDownMethod(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE) {
            logger.fail("Test failed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenShot(driver)).build());
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            logger.pass("Test passed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenShot(driver)).build());
        }

        reports.flush();
    }


}
