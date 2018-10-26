package pageObjects;

import env.Constant;
import locators.LoginLocators;
import org.junit.Assert;
import org.openqa.selenium.By;


public class LoginPage extends LoginLocators {

    public LoginPage(){
        super();
    }

    public void checkDisableButton() {
        Assert.assertFalse(Login_button.isEnabled());
    }

    public void enterCredentials(String Username, String Password){
        textBox_Username.sendKeys(Username);
        textBox_Password.sendKeys(Password);
    }

    public void displayLoginDateTimeBasicInfo() {
        String Date = "17 Sep 2018, 12:00";
        String name = "Abhishek Sharma";
        String LastLogin = display_LastLogin.getText();
        LastLogin = LastLogin.replaceAll("Last Login: ","");
        Assert.assertEquals(Date,LastLogin);

        String userName = display_Name.getText();
        Assert.assertEquals(name,userName);
    }

    public void staticSearchParameters() {
        String parameters = display_Parameters.getText();
        Assert.assertEquals(parameters, Constant.SearchParameters);
    }

    public void logOut() {
        driver.findElement(By.id("dropdown")).click();
        driver.findElement(By.name("logout")).click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(Constant.URL,currentUrl);
    }
}
