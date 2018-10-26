package locators;

import info.seleniumcucumber.userStepDefintions.UserStepDefinitions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LoginLocators extends UserStepDefinitions {

    public LoginLocators() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "submit")
    public static WebElement Login_button;

    @FindBy(how = How.ID, using = "username")
    public static WebElement textBox_Username;

    @FindBy(how = How.ID, using = "password")
    public static WebElement textBox_Password;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/footer/div[3]")
    public static WebElement display_LastLogin;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/nav/div[3]")
    public static WebElement display_Name;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div/div/p/b")
    public static WebElement display_Parameters;

    @FindBy(how = How.ID, using = "dropdown")
    public static WebElement dropDown;

    @FindBy(how = How.NAME, using = "logout")
    public static WebElement Logout_button;



}
