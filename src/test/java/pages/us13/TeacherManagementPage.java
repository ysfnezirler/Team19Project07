package pages.us13;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherManagementPage {

    public TeacherManagementPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement menu;

    @FindBy(linkText = "Teacher Management")
    public WebElement teacherManagement;

    @FindBy(xpath = " //*[@class=' css-1wy0on6']")
    public WebElement chooseLessons;

    @FindBy(xpath = "//*[@id='name']")
    public WebElement name;

    @FindBy(xpath = "//*[@id='surname']")
    public WebElement surname;

    @FindBy(xpath = "//*[@id='birthPlace']")
    public WebElement birthPlace;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//*[@id='phoneNumber']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//*[@id='isAdvisorTeacher']")
    public WebElement isAdvisorTeacher;

    @FindBy(xpath = "//*[@value='FEMALE']")
    public WebElement genderFemale;

    @FindBy(xpath = "//*[@value='MALE']")
    public WebElement genderMale;

    @FindBy(xpath = "//*[@id='birthDay']")
    public WebElement dateOfBirth;

    @FindBy(xpath = "//*[@id='ssn']")
    public WebElement ssn;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submit;


}
