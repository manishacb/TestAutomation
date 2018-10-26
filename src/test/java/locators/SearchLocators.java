package locators;

import info.seleniumcucumber.userStepDefintions.UserStepDefinitions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchLocators extends UserStepDefinitions {

    public SearchLocators() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "username")
    public static WebElement heading_MDMID;

    @FindBy(how = How.ID, using = "password")
    public static WebElement heading_CUSTID;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/footer/div[3]")
    public static WebElement heading_CustomerName;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/nav/div[3]")
    public static WebElement heading_DOB;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div/div/p/b")
    public static WebElement heading_AddressCity;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div/div/p/b")
    public static WebElement heading_AddressArea;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div/div/p/b")
    public static WebElement heading_HomeBranch;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div/div/p/b")
    public static WebElement heading_AssetRM;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div/div/p/b")
    public static WebElement heading_LiabilityRM;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div/div/p/b")
    public static WebElement heading_GroupID;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div/div/p/b")
    public static WebElement heading_BusinessSegment;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div/div/p/b")
    public static WebElement heading_PartnerSegment;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div/div/p/b")
    public static WebElement heading_CustOpenDate;

}
