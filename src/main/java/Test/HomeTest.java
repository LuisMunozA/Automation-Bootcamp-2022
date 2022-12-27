package Test;

import Steps.HomeSteps;
import Utilites.CustomAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeTest {

    public WebDriver _driver = get_driver();

    private WebDriver get_driver() {
        System.setProperty("webdriver.chrome.driver", "/Users/lym1121/Documents/Automation-2022/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        return driver;
    }

    HomeSteps homeSteps = new HomeSteps(_driver);

    @BeforeTest(alwaysRun = true)
    public void beforeTest() {
        System.out.println("This is the before test");
    }

    /**
     * SR-12111
     * When opening home page (https://www.demoblaze.com/)
     * there must be three categories displayed in the left:
     * 1.Phones
     * 2.Laptops
     * 3.Monitors
     */

    @Test(description = "Verify that 3 categories are present")
    public void testCategoriesArePresent() throws InterruptedException {
        Thread.sleep(1500);
        homeSteps.verifyElementsLeft();
        homeSteps.verifyCategories();
    }

    @AfterTest(alwaysRun = true)
    public void afterTest() {
        _driver.quit();
    }

}
