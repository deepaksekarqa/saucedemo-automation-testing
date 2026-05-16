package pages;

import org.openqa.selenium.By;
import base.BaseClass;

public class LogoutPage {

    // Locators
    By menuBtn = By.id("react-burger-menu-btn");
    By logoutLink = By.id("logout_sidebar_link");

    // Open Menu
    public void openMenu() {
        BaseClass.driver.findElement(menuBtn).click();
        System.out.println("Menu Opened");
    }

    // Click Logout
    public void clickLogout() {
        BaseClass.driver.findElement(logoutLink).click();
        System.out.println("Clicked Logout");
    }

    // Perform Logout
    public void logout() throws InterruptedException {
        openMenu();
        Thread.sleep(2000);
        clickLogout();
        System.out.println("Logout Successful");
    }
}