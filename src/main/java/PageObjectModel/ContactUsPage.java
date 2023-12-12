package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends AbstractClass {

    WebDriver driver;

    public void contactus_page(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@title='Contact Us']")
    private WebElement contactUsButton;

    public void clickContactUsButton(){
       ClickFunction(contactUsButton);
    }

    @FindBy(name = "id_contact")
    private WebElement SubjectHeadingDropDown;

    public void selectFromDropdown(){
        selectElementFromDropdown(SubjectHeadingDropDown,"Webmaster");

        }

    @FindBy(id = "email")
    private WebElement emailTextArea;

    public void typeEmail(){
        sendKeysFunction(emailTextArea,"omerozdemir123@gmail.com");
    }

    @FindBy(name = "id_order")
    private WebElement order;

    public void typeOrderReference(String orderr){

        sendKeysFunction(order,orderr);
    }

    @FindBy(id = "message")
    private WebElement messageBox;

    public void typeMessage(){

        sendKeysFunction(messageBox,"Ürün kırık geldi. Lütfen bana email olarak dönüş yapın.. Saygılarımla..");

    }

    @FindBy(id = "submitMessage")
    private WebElement sendButton;

    public void clickOnSendButton(){

        ClickFunction(sendButton);
    }

    @FindBy(css = "p.alert-success")
    private WebElement successMessage;

    public void assertMyMessage() {
        Assertion(successMessage, "Your message has been successfully sent to our team.");

    }









    }
