package pages;

import org.openqa.selenium.By;
import base.BaseClass;

public class CheckoutCompletePage {

    // Locator
    By successMsg = By.className("complete-header");

    // Get Success Message
    public String getSuccessMessage() {
        return BaseClass.driver.findElement(successMsg).getText();
    }

    // Validate Order
    public void validateOrder() {

        String message = getSuccessMessage();

        if (message.equals("Thank you for your order!")) {
            System.out.println("Order Validation Successful");
        } else {
            System.out.println("Order Validation Failed");
        }
    }
}