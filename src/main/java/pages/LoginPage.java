package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private By userNameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.xpath("//i[contains(@class, 'fa-sign-in')]");

    public void setUserName(String userName){
        driver.findElement(userNameField).sendKeys(userName);
    }
    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public SecurePage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecurePage(driver);
    }
}
