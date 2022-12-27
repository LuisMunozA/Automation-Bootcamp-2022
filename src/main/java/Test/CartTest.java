package Test;

import Steps.CartSteps;
import Steps.ProductSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CartTest {

    public WebDriver _driver = get_driver();

    private WebDriver get_driver() {
        System.setProperty("webdriver.chrome.driver", "/Users/lym1121/Documents/Automation-2022/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        return driver;
    }

    CartSteps cartSteps = PageFactory.initElements(_driver, CartSteps.class);
    ProductSteps productSteps = PageFactory.initElements(_driver, ProductSteps.class);

    @BeforeTest(alwaysRun = true)
    public void beforeTest() {
        System.out.println("This is the before test");
    }

    /**
     * SR-12130
     * Clicking the cart link will display below information:
     * 1. List of items added including picture, title, price and delete
     * link
     * 2. Total of items prices
     * 3. Place order button
     */

    @Test(description = "Verify that the required information is present in the cart")
    public void testValidateInformation() throws InterruptedException {
        Thread.sleep(1500);
        cartSteps.clickOnProduct();
        Thread.sleep(1500);
        productSteps.clickOnBtn();
        Thread.sleep(2500);
        productSteps.clickOnAlert();
        _driver.navigate().refresh();
        Thread.sleep(2000);
        cartSteps.clickOnCart();
        Thread.sleep(1500);
        cartSteps.verifyImgIsDisplayed();
        cartSteps.verifyDeviceName();
        cartSteps.verifyPrice();
        cartSteps.verifyDeleteUrl();
        cartSteps.verifyTotal();
        cartSteps.verifyBtnPlaceOrder();
    }

    @AfterTest(alwaysRun = true)
    public void afterTest() {
        _driver.quit();
    }

}
