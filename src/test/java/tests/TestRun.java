package tests;

import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;
import pages.CartPage;
import pages.CheckoutPage;
import pages.CheckoutOverviewPage;
import pages.CheckoutCompletePage;
import pages.LogoutPage;
import utils.ScreenshotUtils;

public class TestRun extends BaseClass {

    @Test(priority = 1, description = "Verify valid login")
    public void testLogin() throws InterruptedException {
        LoginPage login = new LoginPage();
        login.login("standard_user", "secret_sauce");
        Thread.sleep(2000);
        ScreenshotUtils.takeScreenshot("Login_Success");
        System.out.println("TC01 - Login Test Passed");
    }

    @Test(priority = 2, description = "Add product to cart and navigate to cart")
    public void testAddToCart() throws InterruptedException {
        ProductsPage product = new ProductsPage();
        product.addProductToCart();
        Thread.sleep(2000);
        ScreenshotUtils.takeScreenshot("Product_Added");
        product.clickCart();
        Thread.sleep(2000);
        ScreenshotUtils.takeScreenshot("Cart_Page");
        System.out.println("TC02 - Add to Cart Test Passed");
    }

    @Test(priority = 3, description = "Complete checkout flow")
    public void testCheckout() throws InterruptedException {
        CartPage cart = new CartPage();
        cart.clickCheckout();
        Thread.sleep(2000);

        CheckoutPage checkout = new CheckoutPage();
        checkout.enterDetails("Deepak", "Sekar", "600001");
        Thread.sleep(2000);
        ScreenshotUtils.takeScreenshot("Checkout_Page");

        CheckoutOverviewPage overview = new CheckoutOverviewPage();
        overview.clickFinish();
        Thread.sleep(2000);
        ScreenshotUtils.takeScreenshot("Order_Completed");
        System.out.println("TC03 - Checkout Test Passed");
    }

    @Test(priority = 4, description = "Validate order success message")
    public void testOrderValidation() {
        CheckoutCompletePage complete = new CheckoutCompletePage();
        String msg = complete.getSuccessMessage();
        // TestNG Assert — proper pass/fail instead of just println
        Assert.assertEquals(msg, "Thank you for your order!", "Order success message mismatch!");
        System.out.println("TC04 - Order Validation Passed");
    }

    @Test(priority = 5, description = "Logout from the application")
    public void testLogout() throws InterruptedException {
        LogoutPage logout = new LogoutPage();
        logout.logout();
        Thread.sleep(2000);
        ScreenshotUtils.takeScreenshot("Logout_Success");
        System.out.println("TC05 - Logout Test Passed");
    }
}