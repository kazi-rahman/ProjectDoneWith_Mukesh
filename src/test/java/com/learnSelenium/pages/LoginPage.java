package com.learnSelenium.pages;

import com.learnSelenium.utilities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass {

    public WebDriver driver;

    public LoginPage (WebDriver driver){

        this.driver=driver;
    }

    @FindBy (xpath = "//a[contains(text(),'Login')]") WebElement loginLink;
    @FindBy (xpath = "//input[@id='spree_user_email']") WebElement username;
    @FindBy (xpath = "//input[@id='spree_user_password']") WebElement password;
    @FindBy (xpath = "//input[@name='commit']") WebElement loginButton;

    public void loginToSpree(String uname, String pass){
            loginLink.click();
            username.sendKeys(uname);
            password.sendKeys(pass);
            loginButton.click();
}
}
