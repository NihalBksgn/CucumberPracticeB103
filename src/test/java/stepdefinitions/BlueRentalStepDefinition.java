package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BlueRentalPage;
import utilities.Driver;

import java.util.Arrays;

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
    public void kullanici_login_butonuna_basar() throws InterruptedException {
        blueRentalPage.loginButton.click();
        Thread.sleep(2000);
    }

    @Then("kullanici login oldugunu {string} ile dogrular")
    public void kullanici_login_oldugunu_dogrular(String string) {
        Assert.assertTrue(blueRentalPage.dogrulamaButonu.isDisplayed());
    }

    @Then("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }


    @Then("kullanici hata mesaji aldigini dogrular")
    public void kullanici_hata_mesaji_aldigini_dogrular() {

        Assert.assertTrue(blueRentalPage.hataMesaji.isDisplayed());
    }
}
