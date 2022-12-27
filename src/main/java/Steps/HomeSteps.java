package Steps;

import Pages.HomePage;
import Utilites.CustomAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomeSteps extends BaseSteps {

    HomePage homePage = PageFactory.initElements(webDriver, HomePage.class);

    public HomeSteps(WebDriver webDriver) {
        super(webDriver);
    }

    public void verifyElementsLeft () {
        int element = homePage.elementWidth();
        int window = homePage.windowWidth();
        if (element < window) {
            System.out.println("Elements are in the left side");
            CustomAssertions.isElementLeft(window, element);
        } else {
            System.out.println("Elements are not in the left side");
        }
    }

    public void verifyCategories() throws InterruptedException {
        WebElement first = homePage.getTextFirstCategory();
        WebElement second = homePage.getTextSecondCategory();
        WebElement third = homePage.getTextThirdCategory();

        CustomAssertions.isElementPresent(first.isDisplayed());
        CustomAssertions.isElementPresent(second.isDisplayed());
        CustomAssertions.isElementPresent(third.isDisplayed());
    }





}
