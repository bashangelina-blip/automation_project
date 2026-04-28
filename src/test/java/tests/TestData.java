package tests;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "loginData")
    public Object [][] loginData(){
        return new Object[][] {{"tomsmith","SuperSecretPassword!",true},
                {"fghjt","SuperSecretPassword!",false},
                {"1234567","hello123",false}
        };



        }
    }

