package pages;

import org.openqa.selenium.By;
import base.BaseClass;

public class CheckoutPage {

    // Locators
    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By zipCode = By.id("postal-code");
    By continueBtn = By.id("continue");

    // Enter First Name
    public void enterFirstName(String fname) {
        BaseClass.driver.findElement(firstName).sendKeys(fname);
        System.out.println("Entered First Name");
    }

    // Enter Last Name
    public void enterLastName(String lname) {
        BaseClass.driver.findElement(lastName).sendKeys(lname);
        System.out.println("Entered Last Name");
    }

    // Enter Zip Code
    public void enterZipCode(String zip) {
        BaseClass.driver.findElement(zipCode).sendKeys(zip);
        System.out.println("Entered Zip Code");
    }

    // Click Continue
    public void clickContinue() {
        BaseClass.driver.findElement(continueBtn).click();
        System.out.println("Clicked Continue Button");
    }

    // Complete Form
    public void enterDetails(String fname, String lname, String zip) {
        enterFirstName(fname);
        enterLastName(lname);
        enterZipCode(zip);
        clickContinue();
        System.out.println("Checkout Details Submitted");
    }
}