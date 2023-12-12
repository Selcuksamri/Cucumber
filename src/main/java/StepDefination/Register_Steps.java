package StepDefination;

import PageObjectModel.register_Page;
import Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Register_Steps {

    private WebDriver driver;

    register_Page register_page = new register_Page();

    @Given("Navigate to website")
    public void navigateToWebsite() {
        driver = Driver.getDriver();

        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @And("click sign in button")
    public void clickSignInButton() {
        register_page.clickOnSignInButton();
    }

    @And("Type email {string}")
    public void typeEmail(String email) throws Throwable {
        register_page.typeEmail(email);
    }

    @And("click on create an account button")
    public void clickCreateAccountButton() {
        register_page.clickOnSubmitButton();
    }

    @And("choose title")
    public void chooseTitle() {
    }

    @And("type firstname {string} and lastname {string}")
    public void typeFirstNameAndLastName(String firstname, String lastname) {
        register_page.typeFirstnameAndLastName(firstname,lastname);
    }

    @And("type password {string}")
    public void typePassword(String password) {
        register_page.typePassword(password);
    }

    @And("type Company {string}")
    public void typeCompany(String company) {
        register_page.typeCompany(company);
    }

    @And("type address {string}")
    public void typeAddress(String address) {
        register_page.typeCompany(address);
    }

    @After
    public void quitDriver() throws InterruptedException {
        Thread.sleep(2000);

        Driver.getDriver();
    }

}
