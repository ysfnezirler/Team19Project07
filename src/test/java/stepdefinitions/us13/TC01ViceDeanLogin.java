package stepdefinitions.us13;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.us13.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC01ViceDeanLogin {

    LoginPage loginPage = new LoginPage();

    @Given("Kullanici {string} e gider")
    public void kullanici_e_gider(String schoolManagementUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(schoolManagementUrl));
    }

    @When("Kullanici loginAnasayfa butonuna tiklar")
    public void kullaniciLoginAnasayfaButonunaTiklar() {
        loginPage.loginButton.click();
    }

    @When("Kullanici usernamelogin textboxina {string} girer")
    public void kullaniciUsernameloginTextboxinaGirer(String usernamelogin) {
        loginPage.usernameLogin.sendKeys(usernamelogin);
    }

    @When("Kullanici passwordlogin textboxina {string} girer")
    public void kullaniciPasswordloginTextboxinaGirer(String passwordlogin) {
        loginPage.passwordLogin.sendKeys(passwordlogin);
    }

    @And("Kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        loginPage.login.click();
    }
}
