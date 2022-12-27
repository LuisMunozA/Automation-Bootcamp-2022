package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage{

    public HomePage (WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how = How.LINK_TEXT, using = "Phones")
    private WebElement textFirstCategory;
    @FindBy(how = How.LINK_TEXT, using = "Laptops")
    private WebElement textSecondCategory;
    @FindBy(how = How.LINK_TEXT, using = "Monitors")
    private WebElement textThirdCategory;

    @FindBy(how = How.ID, using = "cartur")
    private WebElement btnCart;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Samsung galaxy s6')]")
    //@FindBy(how = How.XPATH, using = "//a[@class='hrefch']")
    private WebElement deviceUrl;

    public WebElement getTextFirstCategory() {
        return textFirstCategory;
    }

    public WebElement getTextSecondCategory() {
        return textSecondCategory;
    }

    public WebElement getTextThirdCategory() {
        return textThirdCategory;
    }

    //find elements in the left

    public int windowWidth(){
        int winWidth = _webDriver.manage().window().getSize().getWidth();
        return winWidth;
    }

    public int elementWidth(){
        WebElement categories = _webDriver.findElement(By.className("col-lg-3"));
        int eleWidth = categories.getSize().getWidth();
        return eleWidth;
    }


    //Find Cart
    public WebElement getBtnCart() {
        return btnCart;
    }

    //Find item
    public WebElement getDeviceUrl() {
        return deviceUrl;
    }
}