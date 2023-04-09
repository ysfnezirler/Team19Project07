package pages.us13;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='header_link ms-2']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement usernameLogin;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordLogin;

    @FindBy(xpath = "(//*[@type='button'])[3]")
    public WebElement login;
}
