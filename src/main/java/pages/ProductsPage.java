package pages;

import org.openqa.selenium.By;
import base.BaseClass;

public class ProductsPage {

    // Locators
    By addToCartBtn = By.id("add-to-cart-sauce-labs-backpack");
    By cartIcon = By.className("shopping_cart_link");

    // Add Product to Cart
    public void addProductToCart() {
        BaseClass.driver.findElement(addToCartBtn).click();
        System.out.println("Product Added to Cart");
    }

    // Click Cart Icon
    public void clickCart() {
        BaseClass.driver.findElement(cartIcon).click();
        System.out.println("Clicked Cart Icon");
    }
}