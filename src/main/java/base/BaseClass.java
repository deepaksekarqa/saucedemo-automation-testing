package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

    public static WebDriver driver;

    // Setup Method (Launch Browser + Open URL)
    @BeforeClass
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");

        System.out.println("Setup Completed - Browser Launched");
    }

    // TearDown Method (Close Browser)
    @AfterClass
    public void tearDown() {

        driver.quit();

        System.out.println("Browser Closed");
    }
}

