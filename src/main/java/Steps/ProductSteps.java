package Steps;

import Pages.HomePage;
import Pages.ProductPage;
import Utilites.CustomAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductSteps extends BaseSteps{

    HomePage homePage = PageFactory.initElements(webDriver,HomePage.class);
    ProductPage productPage = PageFactory.initElements(webDriver, ProductPage.class);

    public ProductSteps(WebDriver webDriver) {
        super(webDriver);
    }


    public void clickOnProduct() {
        homePage.getDeviceUrl().click();
    }

    public void verifyDeviceName() {
        String realTxt = productPage.getDeviceName().getText();
        String expectedTxt = "Samsung galaxy s6";
        CustomAssertions.isElementEqual(expectedTxt,realTxt);
        boolean name = productPage.getDeviceName().isDisplayed();
        CustomAssertions.isElementPresent(name);

    }

    public void verifyPriceOfDevice() {
        String realTxt = productPage.getDevicePrice().getText().substring(0,4);
        String expectedTxt = "$360";
        CustomAssertions.isElementEqual(expectedTxt,realTxt);
        boolean price = productPage.getDevicePrice().isDisplayed();
        CustomAssertions.isElementPresent(price);
    }

    public void verifyDescription() {
        //String txt = productPage.getDeviceDescription().getText();
        boolean description = productPage.getDeviceDescription().isDisplayed();
        CustomAssertions.isElementPresent(description);
    }

    public void verifyButtonIsDisplayed() {
        boolean btnCart = productPage.getBtnAddCart().isDisplayed();
        CustomAssertions.isElementPresent(btnCart);
    }

    public void verifyImgOfDevice() {
        boolean img = productPage.getImgDevice().isDisplayed();
        CustomAssertions.isElementPresent(img);
    }

    public void verifyAlertContent() {
        String content = webDriver.switchTo().alert().getText();
        String expected = "Product added";
        CustomAssertions.isElementEqual(content, expected);
        webDriver.switchTo().alert().accept();
        //clickOnAlert();
    }

    public void clickOnAlert (){
        webDriver.switchTo().alert().accept();
    }

    public void clickOnBtn () {
        productPage.getBtnAddCart().click();
    }


}
