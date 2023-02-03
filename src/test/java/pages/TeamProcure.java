package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeamProcure {

    public TeamProcure(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Sign-up']")
    public WebElement signUp;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement eMail;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@name='password_confirmation']")
    public WebElement passwordConfirmation;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement checkbox;

    @FindBy(xpath = "//div[@class='form-group d-grid mt-4']")
    public WebElement register;

    @FindBy(xpath = "//*[@id='name']")
    public WebElement name;

    @FindBy(xpath = "//*[@id='companyName']")
    public WebElement companyName;

    @FindBy(xpath = "//*[@id='phoneNumber']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//*[@class='select2-selection__arrow']")
    public WebElement peopleOfCompany;

    @FindBy(xpath = "//*[@id='title']")
    public WebElement title;

    @FindBy(xpath = "//div[@class='setup-buttons']")
    public WebElement next;

    @FindBy(xpath = "(//div[@class='icon-info mt-4 d-flex justify-content-center'])[1]")
    public WebElement requestManagement;

    @FindBy(xpath = "(//div[@class='icon-info mt-4 d-flex justify-content-center'])[2]")
    public WebElement procurement;

    @FindBy(xpath = "(//div[@class='icon-info mt-4 d-flex justify-content-center'])[3]")
    public WebElement rfq;

    @FindBy(xpath = "(//div[@class='icon-info mt-4 d-flex justify-content-center'])[4]")
    public WebElement warehouse;

    @FindBy (xpath = "//*[@class='btn btn-next btn-primary']")
    public WebElement next2;

    @FindBy (xpath = "(//*[@class=\"d-flex justify-content-center font-16\"])[1]")
    public WebElement usStandarts;

    @FindBy (xpath = "(//*[@class=\"d-flex justify-content-center font-16\"])[2]")
    public WebElement europanStandarts;

    @FindBy (xpath = "//*[text()='Complete']")
    public WebElement complete;

    @FindBy (xpath = "//*[@class='btn-google']")
    public WebElement loginWithGoogle;

    @FindBy (xpath = "//*[@id='identifierId']")
    public WebElement loginEmail;

    @FindBy (xpath = "//*[text()='İleri']")
    public WebElement ileri;





}
