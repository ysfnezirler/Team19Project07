package stepdefinitions.us13;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.us13.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC01ViceDeanTeacherOlusturma {

    LoginPage loginPage = new LoginPage();
    @Given("Kullanici {string} e gider")
    public void kullanici_e_gider(String schoolManagementUrl) {
        Driver.getDriver().get(ConfigReader.getProperty("school_management_url"));
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

    @And("Kullanici submitlogin butonuna tiklar")
    public void kullaniciSubmitloginButonunaTiklar() {
    }

    @When("Kullanici Menu butonuna tiklar")
    public void kullanici_menu_butonuna_tiklar() {

    }
    @When("Kullanici Teacher Management butonuna tiklar")
    public void kullanici_teacher_management_butonuna_tiklar() {

    }
    @When("Kullanici Choose Lessons dropdownindan bir ders secer")
    public void kullanici_choose_lessons_dropdownindan_bir_ders_secer() {

    }
    @When("Kullanici Name textboxina {string} girer")
    public void kullanici_name_textboxina_girer(String name) {

    }
    @When("Kullanici Surname textboxina {string} girer")
    public void kullanici_surname_textboxina_girer(String surname) {

    }
    @When("Kullanici Birth Place textboxina {string} girer")
    public void kullanici_birth_place_textboxina_girer(String birth_place) {

    }
    @When("Kullanici Email textboxina {string} girer")
    public void kullanici_email_textboxina_girer(String email) {

    }
    @When("Kullanici Phone textboxina {string} girer")
    public void kullanici_phone_textboxina_girer(String phone) {

    }
    @When("Kullanici gender secer")
    public void kullanici_gender_secer() {

    }
    @When("Kullanici Date Of Birth {string} girer")
    public void kullanici_date_of_birth_girer(String date_of_birth) {

    }
    @When("Kullanici Ssn textboxina {string} girer")
    public void kullanici_ssn_textboxina_girer(String ssn) {

    }
    @When("Kullanici Username textboxina {string} girer")
    public void kullanici_username_textboxina_girer(String username) {

    }
    @When("Kullanici Password textboxina {string} girer")
    public void kullanici_password_textboxina_girer(String password) {

    }
    @When("Kullanici Submit butonuna tiklar")
    public void kullanici_submit_butonuna_tiklar() {

    }

    @Then("Kullanici Teacher Saved Succsesfully yazisini gorur")
    public void kullaniciTeacherSavedSuccsesfullyYazisiniGorur() {

    }

}
