package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.DemoGuruPage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoGuruStepDefinition {
    DemoGuruPage demoGuruPage;

    @Then("Company listesini consola yazdirir.")
    public void company_listesini_consola_yazdirir() {
        demoGuruPage = new DemoGuruPage();
        demoGuruPage.company.stream().forEach(t -> System.out.println(t.getText()));
    }

    @Then("kullanici {string} in listede oldugunu gorur")
    public void kullanici_in_listede_oldugunu_gorur(String string) {
        demoGuruPage = new DemoGuruPage();
//        List<String>textList =new ArrayList<>();
//    for(WebElement w:demoGuruPage.company ){
//        textList.add(w.getText());
//    }
        //  Assert.assertTrue(textList.contains(string));
        Assert.assertTrue(demoGuruPage.company.stream().map(t -> t.getText()).collect(Collectors.toList()).contains(string));

    }

}