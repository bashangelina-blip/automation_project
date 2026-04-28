package core;

import framework.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.home.HomePage;

public class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();

        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
        driver.get("https://the-internet.herokuapp.com/");

        homePage = new HomePage(driver);
    }

    @AfterMethod

    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
}
