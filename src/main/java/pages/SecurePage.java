package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage extends BasePage{
    public SecurePage(WebDriver driver) {
        super(driver);
    }
    private By secureText = By.id("flash");

    public String getTextMessage(){
        return driver.findElement(secureText).getText();
    }
}
