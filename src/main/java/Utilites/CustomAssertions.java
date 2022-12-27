package Utilites;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CustomAssertions extends Assert {

    public static void isElementPresent (Boolean desired) {
        Assert.assertEquals(desired, true, "Element is not present");

    }

    public static void isElementLeft(int winWidth, int eleWidth) {
        Assert.assertTrue((eleWidth) < (winWidth / 2), "Categories are not in the left");
    }

    public static void isElementEqual(String desired, String expected) {
        Assert.assertEquals(desired, expected, "The elements doesn't match");
        System.out.println("testing");
    }

}
