package stepdefinitions.us13;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;;
import pages.us13.TeacherManagementPage;
import com.github.javafaker.Faker;
import utilities.ReusableMethods;

public class TC01ViceDeanTeacherOlusturma {

    TeacherManagementPage teacherManagementPage = new TeacherManagementPage();

    public static String nameFaker = Faker.instance().name().firstName();
    public static String surnameFaker = Faker.instance().name().lastName();
    public static String birthPlaceFaker = Faker.instance().address().cityName();
    public static String emailFaker = Faker.instance().internet().emailAddress();
    public static String ssnFaker = Faker.instance().idNumber().ssnValid().intern();
    public static String usernameFaker = Faker.instance().name().username();
    public static String passwordFaker = Faker.instance().internet().password();



    @When("Kullanici Menu butonuna tiklar")
    public void kullanici_menu_butonuna_tiklar() {
        teacherManagementPage.menu.click();
        ReusableMethods.waitFor(3);

    }
    @When("Kullanici Teacher Management butonuna tiklar")
    public void kullanici_teacher_management_butonuna_tiklar() {
        teacherManagementPage.teacherManagement.click();
        ReusableMethods.waitFor(2);
    }
    @When("Kullanici Choose Lessons dropdownindan bir ders secer")
    public void kullanici_choose_lessons_dropdownindan_bir_ders_secer() {
        teacherManagementPage.chooseLessons.click();

    }
    @When("Kullanici Name textboxina {string} girer")
    public void kullanici_name_textboxina_girer(String name) {
        teacherManagementPage.name.sendKeys(nameFaker+"");
    }
    @When("Kullanici Surname textboxina {string} girer")
    public void kullanici_surname_textboxina_girer(String surname) {
        teacherManagementPage.surname.sendKeys(surnameFaker+"");
    }
    @When("Kullanici Birth Place textboxina {string} girer")
    public void kullanici_birth_place_textboxina_girer(String birth_place) {
        teacherManagementPage.birthPlace.sendKeys(birthPlaceFaker+"");
    }
    @When("Kullanici Email textboxina {string} girer")
    public void kullanici_email_textboxina_girer(String email) {
        teacherManagementPage.email.sendKeys(emailFaker+"");
    }
    @When("Kullanici Phone textboxina {string} girer")
    public void kullanici_phone_textboxina_girer(String phone) {
        teacherManagementPage.phoneNumber.sendKeys("214-589-6541");
    }
    @When("Kullanici gender secer")
    public void kullanici_gender_secer() {
        teacherManagementPage.genderFemale.click();
    }
    @When("Kullanici Date Of Birth {string} girer")
    public void kullanici_date_of_birth_girer(String date_of_birth) {
        teacherManagementPage.dateOfBirth.sendKeys("21.05.2000");
    }
    @When("Kullanici Ssn textboxina {string} girer")
    public void kullanici_ssn_textboxina_girer(String ssn) {
        teacherManagementPage.ssn.sendKeys(ssnFaker+"");
    }
    @When("Kullanici Username textboxina {string} girer")
    public void kullanici_username_textboxina_girer(String username) {
        teacherManagementPage.username.sendKeys(usernameFaker+"");
    }
    @When("Kullanici Password textboxina {string} girer")
    public void kullanici_password_textboxina_girer(String password) {
        teacherManagementPage.password.sendKeys(passwordFaker+"");
    }
    @When("Kullanici Submit butonuna tiklar")
    public void kullanici_submit_butonuna_tiklar() {
        teacherManagementPage.submit.click();
    }

    @Then("Kullanici Teacher Saved Succsesfully yazisini gorur")
    public void kullaniciTeacherSavedSuccsesfullyYazisiniGorur() {

    }

}
