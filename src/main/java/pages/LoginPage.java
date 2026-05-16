package pages;

import org.openqa.selenium.By;
import base.BaseClass;

public class LoginPage {

    // Locators
    By username = By.id("user-name");
    By password = By.id("password");
    By loginBtn = By.id("login-button");

    // Enter Username
    public void enterUsername(String user) {
        BaseClass.driver.findElement(username).sendKeys(user);
        System.out.println("Entered Username");
    }

    // Enter Password
    public void enterPassword(String pass) {
        BaseClass.driver.findElement(password).sendKeys(pass);
        System.out.println("Entered Password");
    }

    // Click Login Button
    public void clickLogin() {
        BaseClass.driver.findElement(loginBtn).click();
        System.out.println("Clicked Login Button");
    }

    // Complete Login Action
    public void login(String user, String pass) {
        enterUsername(user);
        enterPassword(pass);
        clickLogin();
        System.out.println("Login Successful");
    }
}