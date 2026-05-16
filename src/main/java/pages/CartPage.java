package pages;

import org.openqa.selenium.By;
import base.BaseClass;

public class CartPage {

    // Locator
    By checkoutBtn = By.id("checkout");

    // Click Checkout Button
    public void clickCheckout() {
        BaseClass.driver.findElement(checkoutBtn).click();
        System.out.println("Clicked Checkout Button");
    }
}