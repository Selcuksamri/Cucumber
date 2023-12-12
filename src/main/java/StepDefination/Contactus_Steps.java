package StepDefination;

import PageObjectModel.ContactUsPage;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Contactus_Steps {

    private WebDriver driver;
    ContactUsPage contactUsPage = new ContactUsPage();

    @Given("navigate to website")
    public void navigateToWebsite() {
        driver = Driver.getDriver();

        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @When("Click on contact us button")
    public void clickOnContactUsButton() {

        contactUsPage.clickContactUsButton();
    }

    @And("select subject heading")
    public void selectSubjectHeading() {

        contactUsPage.selectFromDropdown();

    }

    @And("Type email")
    public void typeEmail() {
        contactUsPage.typeEmail();
    }

    @And("Type a message")
    public void typeMessage() {
        contactUsPage.typeMessage();
    }

    @And("click on send button")
    public void clickOnSendButton() {
        contactUsPage.clickOnSendButton();
    }

    @Then("verify success message")
    public void verifySuccessMessage() {
        contactUsPage.assertMyMessage();
    }

    @And("Type order reference {string}")
    public void typeOrderReference(String order) {
        contactUsPage.typeOrderReference(order);
    }
}

