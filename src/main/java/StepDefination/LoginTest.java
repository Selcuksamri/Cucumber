package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {

    @Given("Amazon sitesine git")
    public void amazon_sitesine_git() {

        System.out.println("Amazon Sitesine Gidildi");
    }

    @Given("Kullanıcı adını gir")
    public void kullanıcı_adını_gir() {

        System.out.println("Kullanıcı adı girildi");

    }

    @Given("Şifreni gir")
    public void şifreni_gir() {

        System.out.println("Şifre girildi");

    }

    @When("Login butonuna tıkladığında")
    public void login_butonuna_tıkladığında() {
        System.out.println("Login butonuna tıklandı");

    }

    @Then("Başarılı bir şekilde giriş yapmış ol")
    public void başarılı_bir_şekilde_giriş_yapmış_ol() {
        System.out.println("Başarılı bir şekilde giriş yapıldı");

    }
}
