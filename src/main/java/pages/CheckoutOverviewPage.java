package pages;

import org.openqa.selenium.By;
import base.BaseClass;

public class CheckoutOverviewPage {

    // Locator
    By finishBtn = By.id("finish");

    // Click Finish Button
    public void clickFinish() {
        BaseClass.driver.findElement(finishBtn).click();
        System.out.println("Clicked Finish Button");
    }
}