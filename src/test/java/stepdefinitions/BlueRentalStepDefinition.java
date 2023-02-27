package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BlueRentalPage;
import utilities.Driver;

public class BlueRentalStepDefinition {
    BlueRentalPage blueRentalPage;

    @Given("kullanici homepage {string} gider")
    public void kullanici_homepage_gider(String string) {
        blueRentalPage = new BlueRentalPage();
        Driver.getDriver().get(string);

    }

    @When("kullanici loginLinke tiklar")
    public void kullanici_login_linke_tiklar() {
        blueRentalPage.loginGiris.click();
    }

    @When("kullanıcı adini {string} girer")
    public void kullanıcı_adini_girer(String string) {
        blueRentalPage.email.sendKeys(string);
    }

    @When("kullanici sifreyi {string} girer")
    public void kullanici_sifreyi_girer(String string) {
        blueRentalPage.password.sendKeys(string);
    }

    @When("kullanici login butonuna basar")
    public void kullanici_login_butonuna_basar() {
        blueRentalPage.loginButton.click();
    }

    @Then("kullanici login oldugunu dogrular")
    public void kullanici_login_oldugunu_dogrular() {
        Assert.assertTrue(blueRentalPage.dogrulamaButonu.isDisplayed());
    }

    @Then("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
}
