package Test;

import Steps.HomeSteps;
import Steps.ProductSteps;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class ProductTest {

    public WebDriver _driver = get_driver();

    private WebDriver get_driver() {
        System.setProperty("webdriver.chrome.driver", "/Users/lym1121/Documents/Automation-2022/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        return driver;
    }

    ProductSteps productSteps = new ProductSteps(_driver);


    @BeforeTest(alwaysRun = true)
    public void beforeTest() {
        System.out.println("This is the before test");
    }

    /**
     * SR-12121
     * Clicking add to cart button will display browser alert with
     * below information:
     * Product added
     * OK button to accept
     */
    @Test(description = "Verify that the browser banner is displayed after adding item to cart")
    public void testDisplayBrowserBanner() throws InterruptedException {
        Thread.sleep(2000);
        productSteps.clickOnProduct();
        Thread.sleep(1000);
        productSteps.clickOnBtn();
        Thread.sleep(2000);
        productSteps.verifyAlertContent();
        //productSteps.clickOnAlert();
    }



    /**
     * SR-12120
     * Clicking any of the products in the catalog displayed in the
     * homepage will display:
     * - Add to cart button
     * - Product description
     * - Price
     * - Name of product
     * - Image of product
     */

    @Test(description = "Verify product has proper information")
    public void testInformationIsDisplayed() throws InterruptedException {
        Thread.sleep(1500);
        productSteps.clickOnProduct();
        Thread.sleep(2000);
        productSteps.verifyDeviceName();
        productSteps.verifyPriceOfDevice();
        productSteps.verifyDescription();
        productSteps.verifyButtonIsDisplayed();
        productSteps.verifyImgOfDevice();


    }

    @AfterTest(alwaysRun = true)
    public void afterTest() {
        _driver.quit();
    }


}
