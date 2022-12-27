package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductPage extends BasePage{

    public ProductPage(WebDriver webDriver) {
        super(webDriver);
    }


    @FindBy(how = How.XPATH, using="//h2[@class='name']")
    private static WebElement deviceName;
    @FindBy(how = How.CLASS_NAME, using="price-container" )
    private static WebElement devicePrice;
    @FindBy(how = How.ID, using="more-information" )
    private static WebElement deviceDescription;
    @FindBy(how = How.CLASS_NAME, using="btn-success" )
    private static WebElement btnAddCart;
    @FindBy(how = How.XPATH, using="//img[contains(@src,'galaxy')]")
    //@FindBy(how = How.XPATH, using="//img[@src='imgs/galaxy_s6.jpg']")
    private static WebElement imgDevice;


    public WebElement getBtnAddCart() {
        return btnAddCart;
    }

    public WebElement getDeviceDescription() {
        return deviceDescription;
    }

    public WebElement getDevicePrice(){
        return devicePrice;
    }

    public WebElement getDeviceName(){
        return deviceName;
    }

    public WebElement getImgDevice(){
        return imgDevice;
    }
}
