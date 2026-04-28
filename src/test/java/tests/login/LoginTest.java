package tests.login;

import core.BaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import pages.SecurePage;
import tests.TestData;

public class LoginTest extends BaseTest {

    @Test(dataProvider = "loginData", dataProviderClass = TestData.class)

    public void testSuccessfulLogin(String user, String password, boolean isValid) {
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUserName(user);
        loginPage.setPassword(password);
        SecurePage securePage = loginPage.clickLoginButton();
        String actualTitle = securePage.getTextMessage();

        if(isValid){
            softAssert.assertTrue(actualTitle.contains("You logged into a secure area!"),
                "Text is different!");}
        else{
            softAssert.assertTrue(actualTitle.contains("Your username is invalid!"),
                    "Text is different!");
        }

        softAssert.assertAll();

    }
}

