package Steps;

import Pages.CartPage;
import Pages.HomePage;
import Utilites.CustomAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CartSteps extends BaseSteps{

    CartPage cartPage = new CartPage(webDriver);
    HomePage homePage = PageFactory.initElements(webDriver,HomePage.class);

    public CartSteps(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnProduct() {
        homePage.getDeviceUrl().click();
    }

    public void clickOnCart() {
        cartPage.getCartURL().click();
    }

    public void verifyDeviceName() {
        String device = cartPage.getDeviceName().getText();
        boolean devicePresent = cartPage.getDeviceName().isDisplayed();
        CustomAssertions.isElementPresent(devicePresent);
    }


    public void verifyImgIsDisplayed(){
        boolean imgPresent = cartPage.getImg().isDisplayed();
        CustomAssertions.isElementPresent(imgPresent);
    }

    public void verifyPrice() {
        boolean pricePresent = cartPage.getDevicePrice().isDisplayed();
        CustomAssertions.isElementPresent(pricePresent);
    }

    public void verifyDeleteUrl() {
        String delete = cartPage.getDeleteUrl().getText();
        boolean deletePresent = cartPage.getDeleteUrl().isDisplayed();
        CustomAssertions.isElementPresent(deletePresent);
    }

    public void verifyTotal() {
        boolean total = cartPage.getTotal().isDisplayed();
        CustomAssertions.isElementPresent(total);
    }

    public void verifyBtnPlaceOrder(){
        boolean btn = cartPage.getBtn().isDisplayed();
        CustomAssertions.isElementPresent(btn);
    }




}
