package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartPage extends BasePage {

    public CartPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getImg() {
        return _webDriver.findElement(By.xpath("//tr[@class='success']//td[1]//img"));
    }

    public WebElement getCartURL() {
        return _webDriver.findElement(By.id("cartur"));
    }

    public WebElement getDeviceName() {
        return _webDriver.findElement(By.xpath("//tr[@class='success']/td[2]"));
    }

    public WebElement getDevicePrice() {
        return _webDriver.findElement(By.xpath("//tr[@class='success']/td[3]"));
    }

    public WebElement getDeleteUrl() {
        return _webDriver.findElement(By.xpath("//tr[@class='success']/td[4]"));
    }

    public WebElement getTotal() {
        return _webDriver.findElement(By.id("totalp"));
    }

    public WebElement getBtn() {
        return _webDriver.findElement((By.className("btn-success")));
    }
}
